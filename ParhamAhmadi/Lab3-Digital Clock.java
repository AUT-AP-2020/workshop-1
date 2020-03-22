/**
 * @param sec is second
 * @param min is minute
 */

class ClockDisplay 
{   
    private NumberDisplay sec;
    private NumberDisplay min;
    private NumberDisplay hour;
    /**
     * @param sec is second
     * @param min is minute
     * @param hour is hour
     */
    public ClockDisplay(int hour,int min,int sec)
    {
        this.sec=new NumberDisplay(60,sec);
        this.min=new NumberDisplay(60,min);
        this.hour=new NumberDisplay(24,hour);
    }

    public void tick()
    {  
        sec.increment();
        if(sec.getCounter()==59)
        {
            min.increment();
            if(min.getCounter()==0)
            {
                hour.increment();
            }
        }
        
    }
    public void print()
    {
        hour.print();
        System.out.printf(":");
        min.print();    
        System.out.printf(":");
        sec.print();
        System.out.println();
    }

}

/**
 * @param counter with this it counts
 * @param limit that is the maximum size of counter
 */
class NumberDisplay 
{
    private int counter;
    private int limit;
    public NumberDisplay(int limit,int counter)
    {
        this.limit=limit;
        this.counter=counter;
    }
    public void increment()
    {
        counter++;
        if (counter==limit)
        {
            counter=0;  
            return;    
        }
        
    }
    /**
     * @return the counter
     */
    public int getCounter() {
        return counter;
    }
    
    public void print()
    {
        if (counter<10)
        {
            
            System.out.printf("0"+counter);
                
        }
        else
            System.out.printf("%d",counter);    
    }
}


class Run 
{
    private static ClockDisplay myclock=new ClockDisplay(23,56,10);
    public static void main(String[] args) 
    {
        // long i=1;
        while(true)
        {
            myclock.tick();
            myclock.print();
        }    
    }
    
}