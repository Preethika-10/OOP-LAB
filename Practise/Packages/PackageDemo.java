import java.util.Scanner;
import java.time.LocalTime;

public class PackageDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        MockPackage.displayGreeting(name);
        double result = java.lang.Math.pow(2, 3); 
        System.out.println("2 to the power of 3 is: " + result);
    }
}

class MockPackage {
    public static void displayGreeting(String user) {
        System.out.println("---------------------------------");
        System.out.println("Hello, " + user + "!");
        System.out.println("This message is 'delivered' from the MockPackage class.");
        System.out.println("---------------------------------");
    }
}