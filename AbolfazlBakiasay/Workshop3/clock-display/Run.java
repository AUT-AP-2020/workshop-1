import java.util.Calendar;


public class Run {
	
	public static void main(String[] args)  {
		Calendar cldr = Calendar.getInstance();
		ClockDisplay clock = new ClockDisplay(cldr.get(Calendar.HOUR_OF_DAY), cldr.get(Calendar.MINUTE), cldr.get(Calendar.SECOND));
		cldr.setTimeInMillis(cldr.getTimeInMillis()+10000);
		
		
		///		Testing the clock ticks for 10 seconds
		while( Calendar.getInstance().getTimeInMillis() <= cldr.getTimeInMillis() ) {
			System.out.println(clock.getTime());
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
			clock.timeTick();
		}
	}

}





