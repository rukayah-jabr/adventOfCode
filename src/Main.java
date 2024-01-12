
public class Main{

    public static void main(String[] args) {
        Boat boat = new Boat();

        int[] durations = {46, 82, 84, 79};
        int[] distances = {347, 1522, 1406, 1471};
        int sumOfPossibilities = 1;

        for (int i = 0; i < durations.length; i++) {
            int ways = boat.calculatePossibleWays(durations[i], distances[i]);
            sumOfPossibilities *= ways;
        }

        System.out.println(sumOfPossibilities);
    }
}
