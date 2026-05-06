//Ioanna Sakellariou 5125
public class RacingGame {
    public static void main(String[] args) {
        RaceTrack track = new RaceTrack(10);
        RaceParticipants participants = new RaceParticipants();
        
        while (!track.reachedEnd()) {
            System.out.println("Remaining track:");
            track.printRemainingTrack();
            
            participants.refuelVehicles();
            participants.runSegment(track.nextSegment());
        }
        
        System.out.println("Race finished!");
        System.out.println("The winner is: " + participants.getWinner());
    }
}
