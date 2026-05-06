//Ioanna Sakellariou 5125

class Car extends Vehicle {
    public Car() {
        super("Car");
    }

    public double computeConsumptionFactor(Road road) {
        double[] factors = {0.1, 0.35, 0.45};
        int roadType = road.getType();
        double consumptionFactor = factors[roadType];
        return road.updateConsumptionFactor(consumptionFactor);
    }
}

