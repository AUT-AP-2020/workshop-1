/**
 * this is the main class for testing Clock's functionality
 * @author afada
 * @version 1.0
 */
public class TestClock {
    public static void main(String[] args) {
        ClockDisplay clock = new ClockDisplay();
        System.out.println( clock.getTime());

        /**
         * there is a for loop for incrementing clock and displaying it
         */
        for(int i =0; i<100000; i++){
            clock.timeTick();
            System.out.println(clock.getTime());
        }
    }
}
