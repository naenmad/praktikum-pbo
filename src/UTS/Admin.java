package UTS;

import java.util.ArrayList;

public class Admin extends User {
    public Admin(String name, String password, ArrayList<Room> rooms, ArrayList<Reservation> reservations) {
        super(name, password, rooms, reservations);
    }

    @Override
    public void accessLevel() {
        System.out.println("Selamat datang " + name + ", hak akses anda sebagai Admin");
    }
}