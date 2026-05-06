//Ioanna Sakellariou 5125

import java.util.Random;

public class Road {
    private int kilometers;
    private boolean hasTurns;

    public Road(int kilometers) {
        this.kilometers = kilometers;
        this.hasTurns = new Random().nextBoolean();
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setHasTurns(boolean hasTurns) {
        this.hasTurns = hasTurns;
    }

    public boolean hasTurns() {
        return hasTurns;
    }

    public double updateConsumptionFactor(double consumptionFactor) {
        if (hasTurns) {
            consumptionFactor *= 1.1;
        }
        return consumptionFactor;
    }
    
    public int getType() {
        return 0;
    }

    public String toString() {
        return String.format("%d klm of paved road%s", kilometers, hasTurns ? " with turns" : "");
    }
}
