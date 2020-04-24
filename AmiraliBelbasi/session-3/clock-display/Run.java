import java.util.Date;

/**
 * class to test myClock
 * @author amirali belbasi
 */
public class Run
{
    /**
     * testing myClock
     * @param args
     */
    public static void main(String[] args) {
        ClockDisplay myClock = new ClockDisplay();
        System.out.println(myClock.getTime());
        myClock.timeTick();
        System.out.println(myClock.getTime());
        for (int i = 0; i < 58; i++)
        {
            myClock.timeTick();
        }
        System.out.println(myClock.getTime());
        myClock.timeTick();
        // a minute passed
        System.out.println(myClock.getTime());
        for (int i = 0; i < 3539; i++)
        {
            myClock.timeTick();
        }
        System.out.println(myClock.getTime());
        myClock.timeTick();
        // an hour passed
        System.out.println(myClock.getTime());
        for (int i = 0; i < (23 * 3600) - 1; i++)
        {
            myClock.timeTick();
        }
        System.out.println(myClock.getTime());
        myClock.timeTick();
        // a full day passed
        System.out.println(myClock.getTime());
        myClock.timeTick();
        // starts over again
        System.out.println(myClock.getTime());
        System.out.println("-------");
        // now testing clock with given start point
        myClock = new ClockDisplay(12, 21, 3);
        System.out.println(myClock.getTime());
        myClock.timeTick();
        System.out.println(myClock.getTime());
        System.out.println("-------");
        // now initialing it with system time
        Date myCurrentSystemTime = new Date();
        myClock = new ClockDisplay(myCurrentSystemTime.getHours()
        , myCurrentSystemTime.getMinutes()
        , myCurrentSystemTime.getSeconds());
        System.out.println(myClock.getTime());
        myClock.timeTick();
        System.out.println(myClock.getTime());
    }
}