public class Boat {

    public int calculatePossibleWays(int duration, int recordDistance) {
        int possibilities = 0;
        for (int holdButton = 0; holdButton < duration; holdButton++) {
            int remainingTime = duration - holdButton - 1;
            int distance = (holdButton + 1) * remainingTime;

            if (distance > recordDistance) {
                possibilities++;
            }
        }
        return possibilities;
    }
}
