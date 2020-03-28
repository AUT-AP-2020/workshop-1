package com.myPack;

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

        Lab lab = new Lab(10, "Monday");

        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);

        System.out.println(lab.getDay());

        System.out.println(lab.getCapacity());

        System.out.println(lab.getAvg());

        lab.print();

        Lab lab2 = new Lab(10, "Friday");

        Student std4 = new Student("Ali","Norozi", "9831067");
        Student std5 = new Student("Mohammad", "Safari", "9831112");
        Student std6 = new Student("Ali", "Asad", "9831044");

        std4.setGrade(20);
        std5.setGrade(12);
        std6.setGrade(10);

        lab2.enrollStudent(std4);
        lab2.enrollStudent(std5);
        lab2.enrollStudent(std6);

        lab2.print();

        University university = new University("AmirKabir", 5);

        university.enrollLab(lab);
        university.enrollLab(lab2);

        university.printall();
    }
}
