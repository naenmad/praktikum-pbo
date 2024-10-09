package UTS;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelManagement {
    private ArrayList<User> users;
    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public HotelManagement() {
        users = new ArrayList<>();
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        initializeRooms();
        addDefaultAdmin();
    }

    private void initializeRooms() {
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i, "Standard", 100.0, "Basic amenities"));
        }
    }

    private void addDefaultAdmin() {
        User defaultAdmin = new Admin("admin", "admin123", rooms, reservations);
        users.add(defaultAdmin);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di Sistem Hotel Naen");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Masukan pilihan anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    User user = login(scanner);
                    if (user != null) {
                        user.accessLevel();
                        userMenu(scanner, user);
                    }
                    break;
                case 2:
                    signUp(scanner);
                    break;
                case 3:
                    System.out.println("Keluar...");
                    System.out.println("Terima kasih telah menggunakan Sistem Hotel Naen <3!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private User login(Scanner scanner) {
        System.out.print("Masukan jenis user (admin/customer): ");
        String userType = scanner.nextLine().trim().toLowerCase();

        while (!userType.equals("admin") && !userType.equals("customer")) {
            System.out.println("Pilihan tidak valid. tolong masukan 'admin' atau 'customer': ");
            userType = scanner.nextLine().trim().toLowerCase();
        }

        System.out.print("Masukan nama : ");
        String name = scanner.nextLine();
        System.out.print("Masukan password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(password) && user.getClass().getSimpleName().equalsIgnoreCase(userType)) {
                return user;
            }
        }

        System.out.println("User tidak ditemukan atau password salah. Tolong coba lagi.");
        return null;
    }

    private void signUp(Scanner scanner) {
        System.out.print("Masukan tipe user (admin/customer): ");
        String userType = scanner.nextLine().trim().toLowerCase();

        while (!userType.equals("admin") && !userType.equals("customer")) {
            System.out.println("Tipe user invalid. Tolong masukan 'admin' atau 'customer': ");
            userType = scanner.nextLine().trim().toLowerCase();
        }

        System.out.print("Masukan nama anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukan password: ");
        String password = scanner.nextLine();

        User user;
        if (userType.equals("admin")) {
            user = new Admin(name, password, rooms, reservations);
        } else {
            user = new Customer(name, password, rooms, reservations);
        }

        users.add(user);
        System.out.println("Sign up user berhasil!");
    }

    private void userMenu(Scanner scanner, User user) {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Book Kamar");
            System.out.println("2. Cek ketersediaan kamar");
            System.out.println("3. Lihat detail pesanan");
            System.out.println("4. Batalkan pesanan");
            System.out.println("5. Lihat semua kamar");
            System.out.println("6. Perbarui informasi user");
            System.out.println("7. Cari Pesanan");
            System.out.println("8. Cari Kamar");
            if (user instanceof Admin) {
                System.out.println("9. Kelola Kamar");
                System.out.println("10. Buat Laporan");
                System.out.println("11. Dashboard Admin");
            }
            System.out.println("12. Logout");
            System.out.print("Masukan pilihan anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukan nomor kamar yang ingin dibooking: ");
                    int roomNumber = scanner.nextInt();
                    ((Bookable) user).bookRoom(roomNumber);
                    break;
                case 2:
                    System.out.print("Masukan nomor kamar yang ingin dicek: ");
                    roomNumber = scanner.nextInt();
                    boolean available = ((Bookable) user).checkAvailability(roomNumber);
                    System.out.println("Kamar " + roomNumber + " berstatus " + (available ? "tersedia" : "tidak tersedia"));
                    break;
                case 3:
                    ((Bookable) user).viewOrderDetails();
                    break;
                case 4:
                    System.out.print("Masukan nomor kamar yang ingin dibatalkan: ");
                    roomNumber = scanner.nextInt();
                    cancelReservation(user, roomNumber);
                    break;
                case 5:
                    viewAllRooms();
                    break;
                case 6:
                    updateUserInformation(scanner, user);
                    break;
                case 7:
                    searchReservations(scanner);
                    break;
                case 8:
                    searchRooms(scanner);
                    break;
                case 9:
                    if (user instanceof Admin) {
                        manageRooms(scanner);
                    } else {
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 10:
                    if (user instanceof Admin) {
                        generateReport();
                    } else {
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 11:
                    if (user instanceof Admin) {
                        adminDashboard();
                    } else {
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                    break;
                case 12:
                    System.out.println("Keluar...");
                    System.out.println("Terima kasih telah menggunakan Sistem Hotel Naen <3!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private void cancelReservation(User user, int roomNumber) {
        Reservation toRemove = null;
        for (Reservation reservation : reservations) {
            if (reservation.getRoomNumber() == roomNumber && reservation.getCustomerName().equals(user.getName())) {
                toRemove = reservation;
                break;
            }
        }
        if (toRemove != null) {
            reservations.remove(toRemove);
            for (Room room : rooms) {
                if (room.getRoomNumber() == roomNumber) {
                    room.setBooked(false);
                    System.out.println("Reservasi untuk ruangan " + roomNumber + " berhasil dibatalkan.");
                    return;
                }
            }
        } else {
            System.out.println("Reservasi tidak ditemukan.");
        }
    }

    private void viewAllRooms() {
        for (Room room : rooms) {
            System.out.println("Kamar " + room.getRoomNumber() + " berstatus " + (room.isBooked() ? "dibooking" : "tersedia"));
        }
    }

    private void updateUserInformation(Scanner scanner, User user) {
        System.out.println("Masukan nama baru: ");
        String newName = scanner.nextLine();
        System.out.println("Masukan password baru: ");
        String newPassword = scanner.nextLine();
        user.setName(newName);
        user.setPassword(newPassword);
        System.out.println("Informasi akun berhasil diupdate.");
    }

    private void searchReservations(Scanner scanner) {
        System.out.println("Masukan tipe pencarian (name/room): ");
        String searchType = scanner.nextLine().trim().toLowerCase();

        if (searchType.equals("name")) {
            System.out.println("Masukan nama customer: ");
            String name = scanner.nextLine();
            for (Reservation reservation : reservations) {
                if (reservation.getCustomerName().equalsIgnoreCase(name)) {
                    System.out.println("Kamar " + reservation.getRoomNumber() + " dibooking oleh " + reservation.getCustomerName());
                }
            }
        } else if (searchType.equals("room")) {
            System.out.println("Masukan nomor kamar: ");
            int roomNumber = scanner.nextInt();
            for (Reservation reservation : reservations) {
                if (reservation.getRoomNumber() == roomNumber) {
                    System.out.println("Kamar " + roomNumber + " dibooking oleh " + reservation.getCustomerName());
                }
            }
        } else {
            System.out.println("Tipe pencarian tidak valid.");
        }
    }

    private void searchRooms(Scanner scanner) {
        System.out.println("Cari berdasarkan (type/price/facilities): ");
        String criteria = scanner.nextLine().trim().toLowerCase();

        switch (criteria) {
            case "type":
                System.out.println("Masukan tipe kamar: ");
                String type = scanner.nextLine().trim();
                for (Room room : rooms) {
                    if (room.getType().equalsIgnoreCase(type)) {
                        System.out.println("Kamar " + room.getRoomNumber() + " berstatus " + (room.isBooked() ? "dibooking" : "tersedia"));
                    }
                }
                break;
            case "price":
                System.out.println("Enter maximum price: ");
                double price = scanner.nextDouble();
                for (Room room : rooms) {
                    if (room.getPrice() <= price) {
                        System.out.println("Kamar " + room.getRoomNumber() + " berstatus " + (room.isBooked() ? "dibooking" : "tersedia"));
                    }
                }
                break;
            case "facilities":
                System.out.println("Masukan fasilitas: ");
                String facility = scanner.nextLine().trim();
                for (Room room : rooms) {
                    if (room.getFacilities().toLowerCase().contains(facility.toLowerCase())) {
                        System.out.println("Kamar " + room.getRoomNumber() + " berstatus " + (room.isBooked() ? "dibooking" : "tersedia"));
                    }
                }
                break;
            default:
                System.out.println("Kriteria pencarian tidak valid.");
        }
    }

    private void generateReport() {
        int bookedRooms = 0;
        int availableRooms = 0;

        for (Room room : rooms) {
            if (room.isBooked()) {
                bookedRooms++;
            } else {
                availableRooms++;
            }
        }

        System.out.println("Laporan:");
        System.out.println("Total kamar: " + rooms.size());
        System.out.println("Kamar terbooking: " + bookedRooms);
        System.out.println("Kamar tersedia: " + availableRooms);
    }

    private void adminDashboard() {
        int totalRooms = rooms.size();
        int bookedRooms = (int) rooms.stream().filter(Room::isBooked).count();
        int availableRooms = totalRooms - bookedRooms;

        System.out.println("Admin Dashboard:");
        System.out.println("Total kamar: " + totalRooms);
        System.out.println("Kamar terbooking: " + bookedRooms);
        System.out.println("Kamar Tersedia: " + availableRooms);
        System.out.println("Total reservasi: " + reservations.size());
    }

    private void manageRooms(Scanner scanner) {
        System.out.println("1. Tambah Kamar");
        System.out.println("2. Hapus Kamar");
        System.out.print("Masukan pilihan anda: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Masukan nomor kamar baru: ");
                int roomNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukan tipe kamar: ");
                String type = scanner.nextLine();
                System.out.print("Masukan harga kamar: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Masukan fasilitas kamar: ");
                String facilities = scanner.nextLine();
                rooms.add(new Room(roomNumber, type, price, facilities));
                System.out.println("Kamar " + roomNumber + " berhasil ditambahkan.");
                break;
            case 2:
                System.out.print("Masukan nomor kamar yang ingin dihapus: ");
                roomNumber = scanner.nextInt();
                rooms.removeIf(room -> room.getRoomNumber() == roomNumber);
                System.out.print("Kamar " + roomNumber + " berhasil dihapus.");
                break;
            default:
                System.out.println("Pilihan tidak valid. silahkan coba lagi.");
        }
    }
}