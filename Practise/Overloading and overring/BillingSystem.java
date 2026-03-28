class InvoiceProcessor {
    
    public void generateInvoice(String customer, double amount) {
        System.out.println("Standard Invoice for " + customer + ": $" + amount);
    }

    
    private double calculateTax(double amount) {
        return amount * 0.05; // Base 5% tax
    }

    public void processPayment(String customer, double amount) {
        double total = amount + calculateTax(amount);
        System.out.println("Processing payment for " + customer + ". Total with base tax: $" + total);
        generateInvoice(customer, total);
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customer, double amount) {
        double discount = amount * 0.10;
        double finalAmount = amount - discount;
        System.out.println("Retail Invoice for " + customer + " (10% Discount Applied): $" + finalAmount);
    }
    
    
}

public class BillingSystem {
    public static void main(String[] args){
   InvoiceProcessor processor = new RetailInvoice();

        System.out.println("--- Runtime Polymorphism in Action ---");
        processor.generateInvoice("John Doe", 100.0);

        System.out.println("\n--- Encapsulation & Internal Logic ---");
        
        processor.processPayment("Jane Smith", 200.0);
    }
}