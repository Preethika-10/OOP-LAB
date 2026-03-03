class Vehicle {
    String regNo;
    String fuel;
    int speed;

Vehicle(String regNo, String fuel, int speed) {
        this.regNo = regNo;
        this.fuel = fuel;
        this.speed = speed;
    }

    void start() {
        System.out.println(regNo + " started");
    }

    void stop() {
       System.out.println(regNo + " stopped");
    }
}

class Bus extends Vehicle {
    int capacity;

Bus(String regNo, String fuel, int speed, int capacity) {
      super(regNo, fuel, speed);
      this.capacity = capacity;
    }

    void display() {
       System.out.println("Bus " + regNo + " Capacity: " + capacity);
    }
}

class Truck extends Vehicle {
    int load;

Truck(String regNo, String fuel, int speed, int load) {
        super(regNo, fuel, speed);
        this.load = load;
    }

    void display() {
        System.out.println("Truck " + regNo + " Load: " + load + " tons");
    }
}

class Van extends Vehicle {
        boolean refrigeration;

Van(String regNo, String fuel, int speed, boolean refrigeration) {
        super(regNo, fuel, speed);
        this.refrigeration = refrigeration;
    }

    void display() {
        System.out.println("Van " + regNo + " Refrigeration: " + refrigeration);
    }
}

public class vehicle {
    public static void main(String[] args) {

        Bus b = new Bus("KA01", "Diesel", 80, 50);
        Truck t = new Truck("KA02", "Diesel", 70, 10);
        Van v = new Van("KA03", "Petrol", 90, true);

        b.display();
        t.display();
        v.display();
    }
}

 
