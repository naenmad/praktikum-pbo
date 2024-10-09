package UTS;

public class Reservation {
    private int roomNumber;
    private String customerName;

    public Reservation(int roomNumber, String customerName) {
        this.roomNumber = roomNumber;
        this.customerName = customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
}
