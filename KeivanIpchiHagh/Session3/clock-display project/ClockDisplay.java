import java.util.Calendar;

/**
 * <h1>Clock Display Class</h1>
 * This class simulates a basic clock
 * @author Keivan Ipchi Hagh
 * @version 1.0.1
 */
class ClockDisplay {

    /**
     * Clock partitions
     */
    private NumberDisplay hour, minute, second;    
    
    /**
     * ClockDisplay Constructor
     * Initializes clock partitions with live values
     */
    public ClockDisplay() {

        Calendar rightNow = Calendar.getInstance();

        this.hour = new NumberDisplay(rightNow.get(Calendar.HOUR_OF_DAY), 24);
        this.minute = new NumberDisplay(rightNow.get(Calendar.MINUTE), 60);
        this.second = new NumberDisplay(rightNow.get(Calendar.SECOND), 60);
    }    

    /**
     * ClockDisplay @override Constructor
     * Initializes clock partitions with costume values
     * @param hour Hour
     * @param minute Minute
     * @param second Second
     */
    public ClockDisplay(int hour, int minute, int second) {

        this.hour = new NumberDisplay(hour, 24);
        this.minute = new NumberDisplay(minute, 60);
        this.second = new NumberDisplay(second, 60);
    }

    /**
     * Tick, increments second by '1' and change other parts if necessary
     */
    public void tick() {

        second.increment();

        if (second.getValue() == 0)
            minute.increment();

        if (minute.getValue() == 0 && second.getValue() == 0)
            hour.increment();
    }

    /**
     * Displays the formatted clock
     */
    public void display() {
        System.out.println(hour.getFormatDisplay() + ":" + minute.getFormatDisplay() + ":" + second.getFormatDisplay());
    }
}