class Sensor {
    public int sensorId;              // readable anywhere
    protected String location;        // accessible in class/package
    private String calibrationKey;    // private
    public double reading;            // public

    public static final String UNIT = "Celsius"; // constant
    public static int activeSensorCount = 0;    // shared counter

    public Sensor(int sensorId, String location, String calibrationKey, double reading) {
      this.sensorId = sensorId;
      this.location = location;
      this.calibrationKey = calibrationKey;
      this.reading = reading;
      activeSensorCount++;
    }

    public void displaySensor() {
        System.out.println("Sensor ID: " + sensorId);
        System.out.println("Location: " + location);
        System.out.println("Reading: " + reading + " " + UNIT);
        // cannot access calibrationKey outside class
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}

public class temp {
    public static void main(String[] args) {
        Sensor s1 = new Sensor(1, "Rooftop", "key123", 28.5);
        Sensor s2 = new Sensor(2, "Lobby", "key234", 25.0);
        Sensor s3 = new Sensor(3, "Server Room", "key345", 22.8);

        s1.displaySensor();
        System.out.println("Fahrenheit: " + Sensor.convertCelsiusToFahrenheit(s1.reading));
        System.out.println("-------------------");
        s2.displaySensor();
        System.out.println("Fahrenheit: " + Sensor.convertCelsiusToFahrenheit(s2.reading));
        System.out.println("-------------------");
        s3.displaySensor();
        System.out.println("Active Sensors: " + Sensor.activeSensorCount);
    }
}
