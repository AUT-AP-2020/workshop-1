public class RunClock {
    public static void main(String[] args) {
        ClockDisplay Time = new ClockDisplay();
        for (int i = 0; i < 1000; i++) {
            Time.timeTick();
            System.out.println(Time.getTime());
        }
    }
}
