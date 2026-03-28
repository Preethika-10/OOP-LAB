class Calculator {
    public int add(int a, int b) {
        System.out.println("Base Calculator: Adding two numbers.");
        return a + b;
    }
    protected void display() {
        System.out.println("Message from Base Calculator.");
    }
    private void show() {
        System.out.println("Base Calculator: This is a private method.");
    }

    public void accessPrivate() {
        show(); // Accessing the private method within the same class
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    public int add(int a, int b) {
        System.out.println("Advanced Calculator: Performing high-precision addition.");
        return a + b;
    }
    @Override
    protected void display() {
        System.out.println("Message from Advanced Calculator.");
    }

    public void show() {
        System.out.println("Advanced Calculator: This is a NEW show method (not an override).");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Using Base Class Reference ---");
        Calculator calc = new Calculator();
        calc.add(5, 5);
        calc.display();
        calc.accessPrivate();

        System.out.println("\n--- Using Parent Reference for Child Object (Polymorphism) ---");
        Calculator polyCalc = new AdvancedCalculator();
        polyCalc.add(10, 20); 
        polyCalc.display(); 
        polyCalc.accessPrivate();
        System.out.println("\n--- Using Child Class Reference ---");
        AdvancedCalculator advCalc = new AdvancedCalculator();
        advCalc.show(); 
    }
}