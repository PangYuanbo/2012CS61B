public class Vehicle {
    // Attributes
    private int passengers;
    private int fuelCapacity;
    private int milesPerGallon;

    // Constructor
    public Vehicle(int passengers, int fuelCapacity, int milesPerGallon) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.milesPerGallon = milesPerGallon;
    }

    // toString method
    @Override
    public String toString() {
        return "It can carry " + passengers + " people and run " + range() + " miles.";
    }

    // Method to calculate the range
    public int range() {
        return fuelCapacity * milesPerGallon;
    }

    // Method to calculate the fuel needed for a given distance
    public double fuelNeeded(int miles) {
        return (double) miles / milesPerGallon;
    }

    // Getter methods for testing purposes
    public int getPassengers() {
        return passengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Creating instances of Vehicle
        Vehicle minivan = new Vehicle(7, 15, 16);
        Vehicle sedan = new Vehicle(4, 15, 20);
        Vehicle sportsCar = new Vehicle(2, 12, 15);

        // Printing information about each vehicle
        System.out.println("minivan information:");
        System.out.println(minivan);
        System.out.println("In order to run 100 miles, it needs " + minivan.fuelNeeded(100) + " gallons of fuel.");

        System.out.println("sedan information:");
        System.out.println(sedan);
        System.out.println("In order to run 100 miles, it needs " + sedan.fuelNeeded(100) + " gallons of fuel.");

        System.out.println("sportsCar information:");
        System.out.println(sportsCar);
        System.out.println("In order to run 100 miles, it needs " + sportsCar.fuelNeeded(100) + " gallons of fuel.");
    }
}
