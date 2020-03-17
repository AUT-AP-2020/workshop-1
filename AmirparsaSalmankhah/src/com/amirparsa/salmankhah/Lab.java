package com.amirparsa.salmankhah;

/**
 * Represents a lab
 *
 * @author Amirparsa Salmankhah
 * @version 1.0
 */
public class Lab {
    //Students of the lab
    private Student[] students;
    //Average score of students
    private int avg;
    //Day of the lab
    private String day;
    //Capacity of the lab
    private int capacity;
    //Current size of the lab
    private int currentSize;

    /**
     * Main constructor with 2 parameters
     *
     * @param capacity Capacity of the lab
     * @param day      Day of the lab
     */
    public Lab(int capacity, String day) {
        currentSize = 0;
        avg = 0;
        this.setCapacity(capacity);
        this.day = day;
        students = new Student[capacity];
    }

    /**
     * Add students to the lab
     *
     * @param std student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else
            System.out.println("Lab is full!!!");
    }

    /**
     * Printing details of students and the average
     */
    public void print() {
        for (int i = 0; i < currentSize; i++)
            students[i].print();
        System.out.println("The average is: " + avg);
    }

    /**
     * Students getter
     *
     * @return an array of Students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Students setter
     *
     * @param students an array of Students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * Average getter
     *
     * @return an int - Average
     */
    public int getAvg() {
        return avg;
    }

    /**
     * Calculate the average
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i = 0; i < currentSize; i++)
            sum += students[i].getGrade();
        avg = sum / currentSize;
    }

    /**
     * Day getter
     *
     * @return a String - Day of the lab
     */
    public String getDay() {
        return day;
    }

    /**
     * Day setter
     *
     * @param day Day of the lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Capacity setter
     * @param capacity Capacity of the lab
     */
    public void setCapacity(int capacity) {
        if(capacity>=0)
            this.capacity = capacity;
        else
            System.out.println("Invalid capacity");
    }

    /**
     * Capacity getter
     * @return an integer - Capacity of the lab
     */
    public int getCapacity() {
        return capacity;
    }
}