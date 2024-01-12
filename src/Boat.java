public class Boat {

    public long calculatePossibleWays(long duration, long recordDistance) {
        long possibilities = 0;
        for (long holdButton = 0; holdButton < duration; holdButton++) {
            long remainingTime = duration - holdButton - 1;
            long distance = (holdButton + 1) * remainingTime;

            if (distance > recordDistance) {
                possibilities++;
            }
        }
        return possibilities;
    }
}
