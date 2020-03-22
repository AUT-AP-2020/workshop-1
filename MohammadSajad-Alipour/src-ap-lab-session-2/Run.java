/**
 * This is a class to test and run the program
 */
public class Run {
    public static void main(String[] args) {
        //Initializing Students Data
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(11);
        std2.print();
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        //Initializing Labs Data
        Lab lab1=new Lab(3,"Saturday");
        Student[] students=new Student[8];
        students[0]=std1;
        students[1]=std2;
        students[2]=std3;
        students[0].setGrade(90);
        students[1].setGrade(70);
        students[2].setGrade(20);
        lab1.enrollStudent(students[0]);
        lab1.enrollStudent(students[1]);
        lab1.enrollStudent(students[2]);
        lab1.print();

        //Testing CallByRefrence Method
        //The answer is CallByReference
        lab1.setStudents(students);
        lab1.testingCallByReferenceMethod(students[0]);
        students[0].print();


        //Testing Faculty Class
        Faculty faculty=new Faculty("Computer Engineering");
        faculty.addLab(lab1);
        faculty.print();
        faculty.removeLab(lab1);
        faculty.print();


    }
}