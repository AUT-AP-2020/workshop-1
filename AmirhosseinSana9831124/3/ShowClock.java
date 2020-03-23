public class ShowClock {
    public static void main(String args[]){
        ClockDisplay clock1 = new ClockDisplay();
        ClockDisplay clock2 = new ClockDisplay(1, 59, 59);

        System.out.println(clock1.getTime());
        System.out.println(clock2.getTime());

        clock1.timeTick();
        clock1.timeTick();
        clock1.timeTick();
        clock2.timeTick();

        System.out.println(clock1.getTime());
        System.out.println(clock2.getTime());

        clock2.timeTick();
        clock2.timeTick();

        System.out.println(clock1.getTime());
        System.out.println(clock2.getTime());
    }
}
