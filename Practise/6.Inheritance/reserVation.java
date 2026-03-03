class Reservation {
    String guestName;
    String roomType;
    int floor;
    double rate;

    // Walk-in constructor
Reservation() {
guestName = "Walk-in Guest";
roomType = "Standard";
        floor = 0;
        rate = 2000;
    }

    // Online booking constructor
Reservation(String name, String roomType, int floor, double rate) {
this.guestName = name;
this.roomType = roomType;
this.floor = floor;
this.rate = rate;
    }

    // Copy constructor
Reservation(Reservation r) {
this.guestName = r.guestName;
this.roomType = r.roomType;
this.floor = r.floor;
this.rate = r.rate;
    }

    void display() {
System.out.println("Guest: " + guestName);
System.out.println("Room: " + roomType);
System.out.println("Floor: " + floor);
System.out.println("Rate: Rs." + rate);
System.out.println("---------------------");
    }
}

public class reserVation {
    public static void main(String[] args) {

        Reservation r1 = new Reservation();

        Reservation r2 = new Reservation("Arjun", "Deluxe", 3, 3500);

        Reservation r3 = new Reservation(r2);
        r3.guestName = "Rahul";

        r1.display();
        r2.display();
        r3.display();
    }
}
