public class Main{
    public static void main(String []args){
        ClockDisplay clockDisplay = new ClockDisplay(1,59,59);
        for(int i = 0; i <= 5; i++) {
            System.out.println(clockDisplay.getTime());
            clockDisplay.timeTick();

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
//            Runtime.getRuntime().exec("cls");

        }
        ClockDisplay clockDisplay1 = new ClockDisplay(12,0,59);
        System.out.println();
        System.out.println(clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println(clockDisplay1.getTime());
        clockDisplay1.timeTick();
        System.out.println(clockDisplay1.getTime());
    }
}