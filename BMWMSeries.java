public class BMWMSeries {
    // Instance variables
    private String model;
    private String engine;
    private String transmission;
    private String drivetrain;
    private String suspension;
    private String brakes;
    private String exhaust;
    private String interior;
    private String color;
    private int horsepower;
    private int torque;
    private int topSpeed;
    private double fuelCapacity;
    private double zeroToSixty;
    private double engineSize;

    // Constructor
    public BMWMSeries(String model, String engine, String transmission, String drivetrain,
                      String suspension, String brakes, String exhaust, String interior,
                      String color, int horsepower, int torque, int topSpeed,
                      double fuelCapacity, double zeroToSixty, double engineSize) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.drivetrain = drivetrain;
        this.suspension = suspension;
        this.brakes = brakes;
        this.exhaust = exhaust;
        this.interior = interior;
        this.color = color;
        this.horsepower = horsepower;
        this.torque = torque;
        this.topSpeed = topSpeed;
        this.fuelCapacity = fuelCapacity;
        this.zeroToSixty = zeroToSixty;
        this.engineSize = engineSize;
    }

    // Methods
    public void startEngine() {
        System.out.println("🚗 Starting the " + model + "...");
        System.out.println("*VROOOM* The " + engine + " roars to life!");
    }

    public void displaySpecs() {
        System.out.println("=== " + model + " Specifications ===");
        System.out.println("Engine: " + engine);
        System.out.println("Transmission: " + transmission);
        System.out.println("Drivetrain: " + drivetrain);
        System.out.println("Suspension: " + suspension);
        System.out.println("Brakes: " + brakes);
        System.out.println("Exhaust: " + exhaust);
        System.out.println("Interior: " + interior);
        System.out.println("Color: " + color);
        System.out.println("Horsepower: " + horsepower + " hp");
        System.out.println("Torque: " + torque + " lb-ft");
        System.out.println("Top Speed: " + topSpeed + " mph");
        System.out.println("Fuel Capacity: " + fuelCapacity + " gallons");
        System.out.println("0-60 mph: " + zeroToSixty + " seconds");
        System.out.println("Engine Size: " + engineSize + "L");
    }


    public String getModel() { return model; }
    public String getEngine() { return engine; }
    public int getHorsepower() { return horsepower; }
    public double getZeroToSixty() { return zeroToSixty; }
    
}
