//Ioanna Sakellariou 5125

import java.util.Random;

public class DirtRoad extends Road {
    private double rainLevel;
    private Random random = new Random();

    public DirtRoad(int kilometers) {
        super(kilometers);
        this.rainLevel = random.nextDouble();
    }

    public double getRainLevel() {
        return rainLevel;
    }

    public double updateConsumptionFactor(double consumptionFactor) {
        if (rainLevel >= 0.8 && rainLevel <= 1.0) {
            consumptionFactor *= 1.2;
        } else if (rainLevel >= 0.5 && rainLevel < 0.8) {
            consumptionFactor *= 1.1;
        }
        return consumptionFactor;
    }
   
    public String toString() {
        if(super.hasTurns() == true){
            return String.format("%d klm of dirt road with turns and rain level %f", getKilometers(), rainLevel);
        }else{
            return String.format("%d klm of dirt road and rain level %f", getKilometers(), rainLevel);
        }
    }            

    public int getType() {
        return 1;
    }
}