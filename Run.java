package ir.ac.aut;

public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
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

        System.out.println("\n\n\n");

        Lab myLab=new Lab(15, "sunday");
        myLab.enrollStudent(std1);
        myLab.enrollStudent(std2);
        myLab.enrollStudent(std3);
        myLab.print();


        University aut=new University();
        aut.addLab(myLab);
        aut.printInfoLabs();
        aut.removeLab(myLab);
        aut.printInfoLabs();
    }
}