//Ioanna Sakellariou 5125

class Jeep extends Vehicle {
    public Jeep() {
        super("Jeep");
    }

    public double computeConsumptionFactor(Road road) {
        double[] factors = {0.25, 0.3, 0.35};
        int roadType = road.getType();
        double consumptionFactor = factors[roadType];
        return road.updateConsumptionFactor(consumptionFactor);
    }
}