package com.company;

/**
 * Main class for run the project
 * @author Yahya and reformed by Mohammad Javad
 */

public class Main {

    public static void main(String[] args) {


        College ce = new College(2);

        Lab lab1 = new Lab(20, "SUNDAY");
        Lab lab2 = new Lab(22,"SATURDAY");

        lab1.setTeacher("T ZAMENI");
        lab2.setTeacher("R KH");

        ce.enrollLab(lab1);
        ce.enrollLab(lab2);

        Student std1 = new Student ("Javad","Rajabi","9831025");
        Student std2 = new Student ("Ali","sarami","9831045");
        Student std3 = new Student ("Mohammad","norozi","9831050");
        Student std4 = new Student ("kasra","bali","9831035");

        std1.setGrade(20);
        std2.setGrade(13);
        std3.setGrade(17);
        std4.setGrade(16);

        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);

        lab2.enrollStudent(std3);
        lab2.enrollStudent(std4);

        lab1.calculateAvg();
        lab2.calculateAvg();

        ce.printt();

    }
}