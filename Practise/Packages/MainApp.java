class Student {
    public String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("--- Student Record ---");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
}

// This is your Main class
public class MainApp {
    public static void main(String[] args) {
        // Creating the student object
        Student s1 = new Student("Alex Smith", 101);

        // Displaying info
        s1.displayInfo();

        // Showing how built-in packages are used together
        System.out.println("\n--- Using Built-in Packages ---");
        
        // java.time is a built-in package
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        System.out.println("Exam taken on: " + now);

        // java.util is another built-in package
        java.util.Random random = new java.util.Random();
        System.out.println("Random Seat Number: " + random.nextInt(50));
    }
}