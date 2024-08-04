public class VehicleDemo {
  public static void main(String[] args) {
    Vehicle minivan = new Vehicle(7, 20, 12);
    System.out.println("minivan information:");
    System.out.println(minivan);
    System.out.println("In order to run 100 miles, it needs " + minivan.fuelNeeded(100) + " gallons of fuel.");

    Vehicle sedan = new Vehicle(4, 15, 20);
    System.out.println("sedan information:");
    System.out.println(sedan);
    System.out.println("In order to run 100 miles, it needs " + sedan.fuelNeeded(100) + " gallons of fuel.");

    Vehicle sportsCar = new Vehicle(2, 18, 10);
    System.out.println("sportsCar information:");
    System.out.println(sportsCar);
    System.out.println("In order to run 100 miles, it needs " + sportsCar.fuelNeeded(100) + " gallons of fuel.");
  }
}

class Vehicle {
  int passengers;
  int fuelCapacity;
  int milesPerGallon;
  
  public Vehicle(int passengers, int fuelCapacity, int milesPerGallon) {
    this.passengers = passengers;
    this.fuelCapacity = fuelCapacity;
    this.milesPerGallon = milesPerGallon;
  }

  public int range() {
    return fuelCapacity * milesPerGallon;
  }

  public double fuelNeeded(int miles) {
    return (double) miles / milesPerGallon;
  }
  
  public String toString() {
    return "It can carry " + passengers + " passengers and has a range of " + range() + " miles.";
  }
}