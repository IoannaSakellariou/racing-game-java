//Ioanna Sakellariou 5125

class Motorbike extends Vehicle {
    public Motorbike() {
        super("Motorbike");
    }

    public double computeConsumptionFactor(Road road) {
        double[] factors = {0.05, 0.4, 0.5};
        int roadType = road.getType();
        double consumptionFactor = factors[roadType];
        return road.updateConsumptionFactor(consumptionFactor);
    }
}

