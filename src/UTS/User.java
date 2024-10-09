package UTS;

import java.util.ArrayList;

public abstract class User {
    protected String name;
    protected String password;
    protected ArrayList<Room> rooms;
    protected ArrayList<Reservation> reservations;

    public User(String name, String password, ArrayList<Room> rooms, ArrayList<Reservation> reservations) {
        this.name = name;
        this.password = password;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void accessLevel();
}