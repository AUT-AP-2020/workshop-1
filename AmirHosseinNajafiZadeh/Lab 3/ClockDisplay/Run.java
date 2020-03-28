package myPack;

/**
 * in this class we check if the clock is working correct
 */
public class Run{
    public static void main(String[] args){
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(11, 20, 0);
        for(int i = 0; i < 1800; i++){
            clock.timeTick();
            System.out.println(clock.getTime());
        }
    }
}