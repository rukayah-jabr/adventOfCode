
public class Main{

    public static void main(String[] args) {
        Boat boat = new Boat();


        //Teil 1
        int[] durations = {46,82,84,79};
        long[] distances = {347L,1522L,1406L,1471L};
        long sumOfPossibilities = 1;

        //Teil 2
        long duration = 46828479;
        long distance = 347152214061471L;

        //Teil 1
        for (int i = 0; i < durations.length; i++) {
            long ways = boat.calculatePossibleWays(durations[i], distances[i]);
            sumOfPossibilities *= ways;
        }

        System.out.println(sumOfPossibilities);

        //Teil2
        sumOfPossibilities = boat.calculatePossibleWays(duration, distance);
        System.out.println(sumOfPossibilities);


    }
}
