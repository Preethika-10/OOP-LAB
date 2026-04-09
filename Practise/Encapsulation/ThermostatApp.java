// The Logic: Encapsulated Thermostat
class SmartThermostat {
    // Private variables: hidden and protected
    private double currentTemp;
    private double targetTemp;
    private boolean isHeaterOn;
    
    // Constants for safety limits
    private final double MIN_TEMP = 5.0;
    private final double MAX_TEMP = 30.0;

    public SmartThermostat(double startTemp) {
        this.currentTemp = startTemp;
        this.targetTemp = startTemp;
        this.isHeaterOn = false;
    }

    // Public Getter: Let the user see the temperature
    public double getCurrentTemp() {
        return currentTemp;
    }

    // Public Setter: The Gatekeeper for the target temperature
    public void setTargetTemp(double newTemp) {
        if (newTemp >= MIN_TEMP && newTemp <= MAX_TEMP) {
            this.targetTemp = newTemp;
            System.out.println(">>> Target set to " + newTemp + "°C");
            updateHeaterStatus();
        } else {
            System.out.println("!!! ERROR: " + newTemp + "°C is outside safe limits (5-30°C).");
        }
    }

    // Private Method: Internal logic that the user doesn't need to touch
    private void updateHeaterStatus() {
        if (currentTemp < targetTemp) {
            isHeaterOn = true;
            System.out.println("[System Update] Heater turned ON.");
        } else {
            isHeaterOn = false;
            System.out.println("[System Update] Heater turned OFF.");
        }
    }
}

// The Runner: The public class containing the main method
public class ThermostatApp {
    public static void main(String[] args) {
        // Initialize at 18 degrees
        SmartThermostat livingRoom = new SmartThermostat(18.0);

        System.out.println("--- Thermostat Simulation Started ---");
        System.out.println("Current Temperature: " + livingRoom.getCurrentTemp() + "°C");

        // 1. Try to set a valid temperature
        System.out.println("\nAction: Setting temperature to 22.5...");
        livingRoom.setTargetTemp(22.5);

        // 2. Try to set an invalid (dangerous) temperature
        System.out.println("\nAction: Setting temperature to 90.0...");
        livingRoom.setTargetTemp(90.0); 

        // 3. Try to set a very cold temperature
        System.out.println("\nAction: Setting temperature to -10.0...");
        livingRoom.setTargetTemp(-10.0);
        
        System.out.println("\nFinal Reading: " + livingRoom.getCurrentTemp() + "°C");
    }
}