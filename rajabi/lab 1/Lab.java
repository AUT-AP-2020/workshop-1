package com.company;

/**
 * The Lab class represents a lab in college based on it's day and capacity with the students and their information.
 * @author Yaya and reformed by Mohammad Javad
 */

public class Lab {

    // array of students in the lab
    private Student[] students;

    // average of all students grades
    private double avg;

    // the day that lab is open
    private String day;

    // capacity of lab
    private int capacity;

    // teacher's name in the lab
    private String teacher;

    // the number of students in the lab
    private int currentSize;

    /**
     * Create a new lab with a given capacity and day.
     * @param cap capacity of the lab
     * @param d day of the lab
     */

    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        students = new Student[cap];
    }

    /**
     * enrool students into the lab
     * @param std contains the student's information
     */

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * get students in the lab with their information
     * @return all students
     */

    public Student[] getStudents() { return students; }

    /**
     * enroll students in the lab
     * @param students set the students information
     */

    public void setStudents(Student[] students) {
        for(int i=0;i<capacity;i++)
            enrollStudent(students[i]);
    }

    /**
     * calculate the average of all student's grades
     */

    public void calculateAvg() {
        double sum =0;
        for(int i=0;i<currentSize;i++){
            sum+=students[i].getGrade();
        }
        avg=sum/currentSize;
    }

    /**
     * get the average of all student's grades
     * @return average of all grades
     */

    public double getAvg() {
        return avg;
    }

    /**
     * get the number of students in the lab
     * @return the currentsize
     */

    public int getCurrentSize() {
        return  currentSize;
    }

    /**
     * determine a day that the lab is on
     * @param day for the lab
     */

    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the day for lab
     */

    public String getDay() { return day; }

    /**
     * get the capasity of the lab
     * @return the capacity
     */

    public int getCapacity() {
        return  capacity;
    }

    /**
     * determine a number for the capacity of the lab
     * @param capacity for the lab
     */

    public void setCapacity(int capacity) { this.capacity = capacity; }

    /**
     * choose your teacher
     * @param name lab's teacher
     */

    public void setTeacher (String name) {teacher = name; }

    /**
     * @return the lab's teacher name */

    public String getTeacher() { return teacher; }
}