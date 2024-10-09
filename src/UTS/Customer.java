package UTS;

import java.util.ArrayList;

public class Customer extends User implements Bookable {
    public Customer(String name, String password, ArrayList<Room> rooms, ArrayList<Reservation> reservations) {
        super(name, password, rooms, reservations);
    }

    @Override
    public void accessLevel() {
        System.out.println("Customer access granted.");
    }

    @Override
    public void bookRoom(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && !room.isBooked()) {
                room.setBooked(true);
                reservations.add(new Reservation(roomNumber, name));
                System.out.println("Room " + roomNumber + " booked successfully.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " is not available.");
    }

    @Override
    public boolean checkAvailability(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return !room.isBooked();
            }
        }
        return false;
    }

    @Override
    public void viewOrderDetails() {
        System.out.println("Order details for " + name + ":");
        for (Reservation reservation : reservations) {
            if (reservation.getCustomerName().equals(name)) {
                System.out.println("Room " + reservation.getRoomNumber() + " booked.");
            }
        }
    }
}