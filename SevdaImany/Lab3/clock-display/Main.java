public class Main{
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();
        clockDisplay.setTime(0 ,0, 0);
        for (int i = 0; i < 60; i++) {
            System.out.println(clockDisplay.getTime());
            clockDisplay.timeTick();
        }
    }
}