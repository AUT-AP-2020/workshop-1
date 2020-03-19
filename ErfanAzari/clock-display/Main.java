package main.java;

public class Main {

    public static void main(String[] args) {
	    ClockDisplay clock1 = new ClockDisplay();
	    ClockDisplay clock2 = new ClockDisplay(4,59,58);
        System.out.println(clock1.getTime());
        clock2.secondTimeTick();
        System.out.println(clock2.getTime());
        clock2.secondTimeTick();
        System.out.println(clock2.getTime());
        clock2.secondTimeTick();
        clock2.minuteTimeTick();
        System.out.println(clock2.getTime());
    }
}
