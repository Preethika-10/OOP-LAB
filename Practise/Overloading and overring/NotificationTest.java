class Notifier {
    public void send(String message) {
        System.out.println("General Alert: " + message);
    }
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
    private void internalLog(String message) {
        System.out.println("Internal System Log: Notification triggered -> " + message);
    }
    public void pushWithLogging(String message) {
        internalLog(message);
        send(message);
    }
}

class AppNotifier extends Notifier {
    public void performBatchNotify() {
        System.out.println("--- AppNotifier executing inherited methods ---");
        send("System Update");                       // Calls Public
        send("Welcome!", "user@example.com");        // Calls Protected
        send("OTP Code: 1234", 9876543210L);         // Calls Default

    }
}

public class NotificationTest {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.performBatchNotify();
        
        System.out.println("\n--- Indirect Private Access ---");
        app.pushWithLogging("Security Alert");
    }
}