import java.util.Date;

public class Run {
    public static void main(String[] args){
        Date time = new Date();
        ClockDisplay clockDisplay = new ClockDisplay(time.getHours(),time.getMinutes());
        for (int i = 0; i < 900; i++) {
            System.out.println(clockDisplay.getTime());
            clockDisplay.timeTick();
        }
    }
}
