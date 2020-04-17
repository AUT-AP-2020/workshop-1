package ws1;

import java.util.ArrayList;

public class Lab {
    private Student[] students ;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize = 0;

    /**
     * @param cap lab capacity
     * @param d enroll day
     */
    public Lab(int cap, String d){
        capacity = cap;
        day = d;
        students = new Student[100];
    }

    /**
     * check if the lab has capacity or not
     * @param std student to add
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        }
        else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print students info in lab and the average of grades
     */
    public void print(){
        for (int i = 0; i < currentSize ; i++) {
            System.out.println("std fName: " + students[i].getFirstName()
                    + " std id:" + students[i].getId()
                    + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Lab AVG:" + calculateAvg());
    }



    public void setStudents(Student[] students) {
        this.students = students;
    }


    public float calculateAvg() {
        float sum=0;
        for (int i = 0; i < currentSize ; i++) {
            sum += students[i].getGrade();
        }
         return sum/currentSize;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
