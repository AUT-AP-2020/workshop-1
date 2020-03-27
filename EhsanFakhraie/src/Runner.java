import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Ehsan
 * Date: 3/26/20
 * Time: 9:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) {
        Lab lab=new Lab(5,"Shambe");
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            Student student=new Student("fName"+i,"lName"+i,""+i);
            student.setGrade(rand.nextInt(20));
            try {
                lab.enrollStudent(student);
                System.out.println("New Student:\n"+student+"\n"+"enrolled in lab"+"\n");
            } catch (Exception e) {
                System.out.println("Lab is full");
            }

        }

        System.out.println(lab);
    }
}
