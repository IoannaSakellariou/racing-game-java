//Ioanna Sakellariou 5125
public abstract class Vehicle {
    private String vehicle;
    private int fuel;

    public Vehicle(String vehicle) {
        this.vehicle = vehicle;
        this.fuel = 0;
    }

    public abstract double computeConsumptionFactor(Road road);

    public double calculateSpeed(Road road) {
        double consumptionFactor = computeConsumptionFactor(road);
        return (fuel / road.getKilometers()) / consumptionFactor;
    }

    public double calculateTime(Road road) {
        double speed = calculateSpeed(road);
        return road.getKilometers() / speed;
    }

    public double race(Road road, int fuelConsumed) {
        double time = calculateTime(road);
        fuel -= fuelConsumed;
        return time;
    }

    public void refuel() {
        fuel += 10;
    }

    public String toString() {
        return "" + vehicle + ", fuel left: " + fuel;
    }
    
    public String getvehicle() {
        return vehicle;
    }

    public int getFuel() {
        return fuel;
    }
}
