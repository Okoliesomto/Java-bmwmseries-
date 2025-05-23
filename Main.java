public class Main {
    public static void main(String[] args) {
        // Creating an instance of BMWMSeries
        BMWMSeries m3 = new BMWMSeries(
                "M3 Competition",
                "3.0L I6 Twin Turbo (S58)",
                "8-speed M Steptronic",
                "AWD with RWD bias",
                "Adaptive M Suspension",
                "M Compound Brakes",
                "M Sport Exhaust",
                "Merino Leather with Carbon Trim",
                "Isle of Man Green",
                503,
                479,
                180,
                8,
                3.4,
                3.0
        );

        BMWMSeries m5 = new BMWMSeries(
                "M5 CS",
                "4.4L V8 Twin Turbo (S63)",
                "8-speed M Steptronic",
                "AWD with RWD mode",
                "Adaptive M Suspension Pro",
                "M Carbon Ceramic Brakes",
                "M Performance Exhaust",
                "Alcantara Interior",
                "Frozen Deep Green Metallic",
                627,
                553,
                190,
                8,
                2.9,
                4.4
        );

        // Call methods
        m3.startEngine();
        m3.displaySpecs();

        System.out.println("\n-----------------------\n");

        m5.startEngine();
        m5.displaySpecs();
    }
}