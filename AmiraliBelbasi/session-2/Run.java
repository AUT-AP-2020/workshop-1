/**
 * its a testing class containing main method
 * to see if Lab & Student classes work properly
 * @version 1.0
 */
public class Run
{
    /**
     * main method to be executed
     * @param args
     */
    public static void main(String[] args)
    {
        // creating three objects of type Student
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        // further more we are checking methods of Student class
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(11);
        std2.print();
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
    }
}