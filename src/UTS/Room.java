package UTS;

public class Room {
    private int roomNumber;
    private boolean isBooked;
    private String type;
    private double price;
    private String facilities;

    public Room(int roomNumber, String type, double price, String facilities) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
        this.type = type;
        this.price = price;
        this.facilities = facilities;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }
}