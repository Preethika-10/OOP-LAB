public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void displayDecimalSum(double a, double b) {
        double result = add(a, b);
        System.out.println("The sum of decimals " + a + " and " + b + " is: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
          int sum2 = calc.add(10, 20);
        System.out.println("Sum of two integers: " + sum2);
        int sum3 = calc.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum3);
        calc.displayDecimalSum(12.5, 7.25);
    }
}