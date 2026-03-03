class Patient {

    static int counter = 1001;

    int id;
    String name;
    int age;
    String ward;
    String notes;

    // Emergency
Patient() {
        id = counter++;
        name = "Unknown";
        age = 0;
        ward = "Emergency";
        notes = "None";
    }

    // OPD
Patient(String name, int age, String ward, String notes) {
        id = counter++;
        this.name = name;
this.age = age;
this.ward = ward;
this.notes = notes;
    }

    // Copy constructor
Patient(Patient p) {
        id = counter++;
        this.name = p.name;
this.age = p.age;
this.ward = p.ward;
this.notes = p.notes;
    }

    void display() {
System.out.println("ID: " + id +
                " Name: " + name +
                " Age: " + age +
                " Ward: " + ward +
                " Notes: " + notes);
    }
}

public class hosPatient {
    public static void main(String[] args) {

        Patient p1 = new Patient();

        Patient p2 = new Patient("Kumar", 35, "OPD", "Fever");

        Patient camp = new Patient("Ravi", 40, "Camp", "BP High");

        Patient p3 = new Patient(camp);

        p1.display();
        p2.display();
        p3.display();
    }
}
