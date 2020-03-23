package LAB3;

public class Run {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();
        clockDisplay.setTime(12, 59, 59);
        for (int i = 0; i < 100; i++) {
            System.out.println(clockDisplay.getTime());
            clockDisplay.timeTick();
        }
    }
}
