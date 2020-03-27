public class Run
{
    public static void main (String args[])
    {
        Students std1 = new Students("ehsan","kamali",9831011,12);
        Students std2 = new Students("reza","Jahani",9831078,6);
        std2.setGrade(16);
        Lab first = new Lab (5,"sunday");
        first.enrollStudent(std1);
        first.enrollStudent(std2);
        first.calculateAvg();
        first.print();
    }
}
