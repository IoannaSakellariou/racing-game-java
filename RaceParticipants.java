//Ioanna Sakellariou 5125
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class RaceParticipants {
    private Racer[] racers;

    public RaceParticipants() {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Motorbike();
        vehicles[1] = new Car();
        vehicles[2] = new Jeep();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of vehicle do you want? (0: Motorbike, 1:Car, 2:Jeep): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Vehicle userVehicle;
        switch (choice) {
            case 0:
                userVehicle = vehicles[0];
                break;
            case 1:
                userVehicle = vehicles[1];
                break;
            case 2:
                userVehicle = vehicles[2];
                break;
            default:
                Random random = new Random();
                int veh = random.nextInt(3);
                System.out.println("Invalid choice. Using random vehicle.");
                userVehicle = vehicles[veh];
                break;
        }

        racers = new Racer[4];
        racers[0] = new Racer("Computer 1", vehicles[0]);
        racers[1] = new Racer("Computer 2", vehicles[1]);
        racers[2] = new Racer("Computer 3", vehicles[2]);
        racers[3] = new HumanRacer("Human", userVehicle);
    }

    public void runSegment(Road road) {
        for (Racer racer : racers) {
            int fuel = racer.getFuel();
            double time = racer.race(road, racer.getFuel());
            System.out.println(racer.getName() + ", " + time + " minutes");
        }
    }

    public void refuelVehicles() {
        for (Racer racer : racers) {
            racer.refuel();
        }
    }

    public Racer[] getRaceResults() {
        Arrays.sort(racers);
        return racers;
    }

    public Racer getWinner() {
        return getRaceResults()[0];
    }
}
