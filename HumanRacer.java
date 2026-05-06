//Ioanna Sakellariou 5125
import java.util.Scanner;

public class HumanRacer extends Racer {

    private Scanner scanner = new Scanner(System.in);

    public HumanRacer(String name, Vehicle vehicle) {
        super(name, vehicle);
    }

    public int getFuel() {
        System.out.print("How much fuel do you want to use? ");
        int fuel = scanner.nextInt();
        scanner.nextLine(); 
        return fuel;
    }
}
