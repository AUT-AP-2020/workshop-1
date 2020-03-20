/**
 * a simple program to simulate a college .
 * its just a home_work so dont look through it for something special.
 * @author farzad
 * @version 0.0
 */

public class Run {
    public static void main(String[] args) {

        College college = new College("CE");
        college.addLab(2,"lab1","saturday");
        college.addLab(3,"lab2","monday");

        college.addStudent(0,"Ehsan","Edalat", "9031066",17);
        college.addStudent(0,"Seyed", "Ahmadpanah", "9031806",18);
        college.addStudent(0,"Ahmad", "Asadi", "9031054",19);
        college.addStudent(1,"Ahmad", "Asadi", "9031054",20);
        college.addStudent(1,"f1", "l1", "9831000",11);
        college.addStudent(1,"f2", "l2", "9831001",15);

        college.printLabsStudents();
        System.out.println("\n\n");

        college.getLab(0).getStudents()[0].setGrade(20);
        college.getLab(1).getStudents()[0].setGrade(19);
        college.getLab(1).getStudents()[1].setGrade(15);
        college.getLab(1).getStudents()[2].setGrade(9.9f);
        college.getLab(1).getStudents()[2].setFirstName("far");
        college.getLab(1).getStudents()[2].setLastName("rad");


        college.printLabsStudents();





    }
}