package UTS;

public interface Bookable {
    void bookRoom(int roomNumber);
    boolean checkAvailability(int roomNumber);
    void viewOrderDetails();
}