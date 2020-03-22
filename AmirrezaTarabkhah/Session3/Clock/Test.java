public class Test
{
	public static void main(String[] arg)
	{
		ClockDisplay clock = new ClockDisplay();
		for (int i = 0; i <= 10000; i++)
		{
			clock.timeTick();
			System.out.println(clock.getTime());
		}
	}
}