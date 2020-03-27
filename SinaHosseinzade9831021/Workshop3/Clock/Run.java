

public class Run {
    public static void main(String[] args)
    {
       ClockDisplay Clock = new ClockDisplay(5,55,5);
       Clock.timeTick();
       Clock.timeTick();
       Clock.timeTick();
       System.out.println(Clock.getTime());
    }
}
