/**
 * its a testing class containing main method to see if Lab & Student classes
 * work properly
 * 
 * @version 1.1
 * @author amirali belbasi
 */
public class Run {
    /**
     * main method to be executed
     * 
     * @param args
     */
    public static void main(String[] args) {
        // creating three objects of type Student
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
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
        std3.setGrade(20);
        std3.print();
        System.out.println("--------");
        // now we are gonna check methods of Lab class
        Student std4 = new Student("amirali", "belbasi", "9831109");
        std4.setGrade(17);
        Lab labG6 = new Lab(4, "Saturday");
        Student[] arrayOfStudents = new Student[4];
        arrayOfStudents[0] = std1;
        arrayOfStudents[1] = std2;
        arrayOfStudents[2] = std3;
        labG6.setStudents(arrayOfStudents);
        // enrolling a student to lab
        labG6.enrollStudent(std4);
        System.out.println("day: " + labG6.getDay());
        System.out.println("capacity: " + labG6.getCapacity());
        // printing all details of students and average of lab
        labG6.print();
    }
}