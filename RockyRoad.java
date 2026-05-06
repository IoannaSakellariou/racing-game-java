//Ioanna Sakellariou 5125

import java.util.Random;

public class RockyRoad extends Road {
    private int abnormalityLevel;
    private Random random = new Random();

    public RockyRoad(int kilometers) {
        super(kilometers);
        this.abnormalityLevel = random.nextInt(3);
    }

    public int getAbnormalityLevel() {
        return abnormalityLevel;
    }

    public double updateConsumptionFactor(double consumptionFactor) {

        if (abnormalityLevel == 2) {
            consumptionFactor *= 1.2;
        } else if (abnormalityLevel == 1) {
            consumptionFactor *= 1.1;
        }
        return consumptionFactor;
    }

    public String toString() {
        if(super.hasTurns() == true){
            return String.format("%d klm of rocky road with turns and rock size %d", getKilometers(), abnormalityLevel);
        }else{
            return String.format("%d klm of rocky road and rock size %d", getKilometers(), abnormalityLevel);
        }
    }

    public int getType() {
        return 2;
    }
}