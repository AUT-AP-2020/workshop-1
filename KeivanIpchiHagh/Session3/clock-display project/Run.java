class Run {

    public static void main(String[] args) throws InterruptedException {
        
        ClockDisplay clock = new ClockDisplay();
        //ClockDisplay costumeClock = new ClockDisplay(5, 59, 55);

        while (true) {
            clock.tick();
            clock.display();
            Thread.sleep(1000);
        }
    }
}