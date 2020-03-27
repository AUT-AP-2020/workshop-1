/*
well this is about this fictional lab
we are going to get the date
and we are going to know how much people have worked
and at the end we are going to know what level is this lab from 0 to 100
@author Marcela
@version 1.00
 */
import java.util.*;
public class Lab {
    private Students[] studentsS;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(int cap, String d) {
        this.capacity=cap;
        this.day=d;
        studentsS = new Students[capacity];
    }

    public void enrollStudent(Students std) {
        if (currentSize < capacity) {
            studentsS[currentSize] = std;
            currentSize++;
            }
        else {
            System.out.println("Lab is full!!!");
        }
    }
    /*
    its going to print all the info about todays students
     */
    public void print() {
        int x;
       for(x=0;x<currentSize;x++)
        {
            System.out.println("id : "+studentsS[x].getId());
            System.out.println("the name : "+studentsS[x].getFName()+" "+studentsS[x].getSName());
            System.out.println("the grade : "+studentsS[x].getGrade());
        }
        System.out.println("today is "+day+" and average score was: "+avg);
    }
    /*
    @return studentsS the list of ppl who study and learned something today at the lab
    */
    public Students[] getStudents() {
       return studentsS;
    }
    /*
    @param studentsS it will provide info about the todays list
     */
    public void setStudents(Students[] students) {
        this.studentsS=students;
    }
    /*
    @return avg it will provide info about they efficiency of the class
    */
    public int getAvg() {
        return avg;
    }
    /*
        this  method will calculate the hard work of my students in this day !
     */
    public void calculateAvg() {
        int x;
        int total=0;
        for(x=0;x<currentSize;x++)
        {
            total+=studentsS[x].getGrade();
        }
        this.avg=total/(currentSize);
    }
  /*
  @return day it will tell us in which specific day the lab was holed
   */
    public String getDay() {
        return day;
    }
    /*
    @param day it will give us info about day field
     */
    public void setDay(String day) {
        this.day=day;
    }
    /*
    @return capacity the maximum ppl who could be in the lab  :)
     */
    public int getCapacity() {
        return capacity;
    }
    /*
    @param capacity it will provide info about the maximum
     */
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}
