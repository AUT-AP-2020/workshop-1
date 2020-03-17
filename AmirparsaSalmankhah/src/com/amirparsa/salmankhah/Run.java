package com.amirparsa.salmankhah;

public class Run {
    public static void main(String[] args) {
        Lab lab = new Lab(15,"Saturday");
        Student std1 = new Student("Ehsan","Edalat","9031066");
        Student std2 = new Student("Seyed","Ahmadpanah","9031806");
        Student std3 = new Student("Ahmad","Asadi","9031054");

        std1.setGrade(15);
        std2.setGrade(11);
        std3.setGrade(17);

        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);
        lab.calculateAvg();
        lab.print();
    }
}
