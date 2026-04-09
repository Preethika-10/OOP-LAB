// The logic for the security system (Encapsulated)
class SecuritySystem {
    // Private variables: hidden from the outside world
    private String passcode;
    private boolean isArmed;
    private int failedAttempts;
    private final int MAX_ATTEMPTS = 3;

    // Constructor
    public SecuritySystem(String initialPasscode) {
        this.passcode = initialPasscode;
        this.isArmed = false;
        this.failedAttempts = 0;
    }

    // Public Getter: Read-only access to status
    public boolean getStatus() {
        return isArmed;
    }

    // Public method to arm the system
    public void armSystem() {
        this.isArmed = true;
        System.out.println(">>> System ARMED.");
    }

    // Public method to disarm (The "Gatekeeper")
    public void disarmSystem(String enteredCode) {
        if (failedAttempts >= MAX_ATTEMPTS) {
            System.out.println("!!! SYSTEM LOCKED. Too many failed attempts. Call support.");
            return;
        }

        if (this.passcode.equals(enteredCode)) {
            this.isArmed = false;
            this.failedAttempts = 0;
            System.out.println(">>> Access Granted. System DISARMED.");
        } else {
            this.failedAttempts++;
            int remaining = MAX_ATTEMPTS - failedAttempts;
            System.out.println("!!! WRONG CODE. Attempts remaining: " + remaining);
        }
    }

    // Public method to update data (Requires knowing the old data first)
    public void changePasscode(String oldCode, String newCode) {
        if (this.passcode.equals(oldCode)) {
            this.passcode = newCode;
            System.out.println(">>> Passcode updated successfully.");
        } else {
            System.out.println("!!! Auth failed. Cannot change passcode.");
        }
    }
}

// The Main class to run the program
public class SecurityApp {
    public static void main(String[] args) {
        // Initialize with a secret passcode
        SecuritySystem myHome = new SecuritySystem("1234");

        System.out.println("--- Starting Security Simulation ---");
        
        // 1. Arm the system
        myHome.armSystem();
        System.out.println("Is system armed? " + myHome.getStatus());

        System.out.println("\n--- Attempting Unauthorized Entry ---");
        
        // 2. Simulate failed attempts
        myHome.disarmSystem("0000"); // Attempt 1
        myHome.disarmSystem("5555"); // Attempt 2
        myHome.disarmSystem("9999"); // Attempt 3 (Lockout)

        // 3. Even the correct code won't work now
        System.out.println("\n--- Attempting Correct Code After Lockout ---");
        myHome.disarmSystem("1234"); 

        System.out.println("\n--- Trying to change passcode with wrong old code ---");
        myHome.changePasscode("wrong-old-code", "4321");
    }
}