package UTS;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        // Initialize rooms
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i, "Standard", 100.0, "Basic amenities"));
        }
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Room room = hotel.getRoom(1);
        if (room != null) {
            System.out.println("Kamar " + room.getRoomNumber() + " berstatus " + (room.isBooked() ? "dibooking" : "tersedia"));
        } else {
            System.out.println("Kamar tidak ditemukan.");
        }
    }
}