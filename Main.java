public class Main{
    public static void main(String args[]){
        ClockDisplay myClock= new ClockDisplay();
        System.out.println(myClock.getTime());
        myClock.timeTick();
        System.out.println(myClock.getTime());
        myClock.setTime(2, 11, 45);
        System.out.println(myClock.getTime());

    }
}