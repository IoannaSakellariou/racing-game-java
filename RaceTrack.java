//Ioanna Sakellariou 5125
import java.util.Random;

public class RaceTrack {
    private Road[] segments;
    private int curSegment;

    public RaceTrack(int size) {
        segments = new Road[size];
        this.curSegment = 0;
        Random random = new Random();
        
       for (int i = 0; i < size; i++) {
            int roadType = random.nextInt(3);
            int length = 50 + random.nextInt(51);

            switch (roadType) {
                case 0:
                    segments[i] = new Road(length);
                    break;
                case 1:
                    segments[i] = new DirtRoad(length);
                    break;
                case 2:
                    segments[i] = new RockyRoad(length);
                    break;
            }
        }
    }

    public Road nextSegment(){
        if (curSegment < segments.length) {
            Road nextSegment = segments[curSegment];
            curSegment++;
            return segments[curSegment];
        }else{
            return null;
        }
    }

    public boolean reachedEnd() {
        return curSegment == segments.length;
    }

    public void printRemainingTrack() {
        for (int i = curSegment; i < segments.length; i++) {
            System.out.println(segments[i]);
        }
    }

    public static void main(String[] args) {
        RaceTrack raceTrack = new RaceTrack(10);
        raceTrack.printRemainingTrack();
        Road nextSegment = raceTrack.nextSegment();
    }
}
