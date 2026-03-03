class Order {
    String item;
    int quantity;
    String address;
    String instruction;

    // Quick order
Order() {
        item = "Veg Combo";
        quantity = 1;
        address = "To be updated";
        instruction = "None";
    }

    // Item + quantity
Order(String item, int quantity) {
this.item = item;
this.quantity = quantity;
        address = "Home Address on File";
        instruction = "None";
    }

    // Full details
Order(String item, int quantity, String address, String instruction) {
this.item = item;
this.quantity = quantity;
this.address = address;
this.instruction = instruction;
    }

    void display() {
System.out.println("Item: " + item);
System.out.println("Quantity: " + quantity);
System.out.println("Address: " + address);
System.out.println("Instruction: " + instruction);
System.out.println("---------------------");
    }
}

public class foodOrder {
    public static void main(String[] args) {

        Order o1 = new Order();
        Order o2 = new Order("Pizza", 2);
        Order o3 = new Order("Burger", 3, "College Hostel", "Less spicy");

o1.display();
        o2.display();
        o3.display();
}
}
