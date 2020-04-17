package clock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /**
         * this program will update clock per second
         */
        ClockDisplay clockDisplay = new ClockDisplay(23,59,56);
       // NumberDisplay numberDisplay = new NumberDisplay(5);
        while (true) {
            clockDisplay.timeTick();
            clockDisplay.print();
            Thread.sleep(1000);
        }
    }
}
