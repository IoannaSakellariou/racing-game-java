//Ioanna Sakellariou 5125s
class Racer {
    private String name;
    private Vehicle vehicle;
    private double totalTime;

    public Racer(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.totalTime = 0;
    }

    public int getFuel() {
        return vehicle.getFuel();
    }

    public double race(Road road, int fuelConsumed) {
        int fuel = getFuel();
        double time = vehicle.race(road, fuel);
        totalTime += time;
        return time;
    }

    public void refuel() {
        vehicle.refuel();
    }

    public String toString() {
        return "Racer: " + name + ", Total Time: " + totalTime + ", " + vehicle.toString();
    }

    public String getName() {
        return name;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}