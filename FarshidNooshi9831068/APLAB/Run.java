package APLAB;

public class Run {
    public static void main(String[] args) {
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
        Lab lab = new Lab(10, "Saturday");
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);
        lab.print();

        Faculty test = new Faculty();
        Lab lab2 = new Lab(3, "Sunday");
        lab2.enrollStudent(std1);
        lab2.enrollStudent(std2);
        test.addLab(lab);
        test.addLab(lab2);
        test.print();
        test.addStudent(1, std3);
        test.print();
    }
}