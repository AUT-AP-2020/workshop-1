package com.company;

/**
 * The college class contains some labs and their information
 * @author Mohammad Javad
 */

public class College {

    // array of all labs
    private Lab[] labs;

    // number of labs
    private int number;

    // counting the labs
    private int countnum;

    /**
     * creat a college system with some labs
     * @param number the number of labs
     */

    public College(int number) {
        this.number = number;
        labs = new Lab[number];
    }

    /**
     * enroll labs into the college
     * @param lab contains some students
     */

    public void enrollLab(Lab lab) {
        labs[countnum] = lab;
      //  labs[countnum].getStudents();
        countnum++;
    }

    /**
     * print all students in the lab and their information and the average of their grades*/

    public void printt() {
        for (int i=0 ; i<number ; i++) {
            System.out.println("LAB" + (i+1) + " ON " + labs[i].getDay() + " TEACHING BY: " + labs[i].getTeacher());
            for (int j=0 ; j<labs[i].getCurrentSize() ; j++) {
                System.out.println(labs[i].getStudents()[j].getFirstName() + " " + labs[i].getStudents()[j].getLastName() + " " + labs[i].getStudents()[j].getId() + " " +labs[i].getStudents()[j].getGrade());
            }
            System.out.println("THE CAPACITY OF THE LAB IS: " + labs[i].getCapacity());
            System.out.println("THE AVERAGE IS : " + labs[i].getAvg());
            System.out.println();
        }
    }

}