package com.myPack;

/**
 * the lab class is the class that holds information
 * about students and it has a list of students
 */
public class Lab {
    //The array of students is an instance of Student class
    private Student[] students;
    //This should be float
    private float avg;
    //The day of lab
    private String day;
    //Maximum number of lab students
    private int capacity;
    //The current number of students
    private int currentSize;

    /**
     * the class constructor
     * @param cap is maximum number of students
     * @param d the day of lab
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        currentSize = 0;
        avg = 0;
        students = new Student[cap];
    }

    /**
     * the method for adding a student to the lab
     * @param std an instance of our student class for adding to list
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
     * this method will print the lab information
     */
    public void print() {
        for(int i = 0; i < currentSize; i++) {
            students[i].print();
        }
        calculateAvg();
        System.out.println("The lab average is " + avg);
    }

    /**
     * the getter method for getting the array of students
     * @return an array of students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * this method will add students as an array
     * in our students list
     * @param students an student array
     */
    public void setStudents(Student[] students) {
        for(int i = 0; i < students.length; i++) {
            this.students[i] = students[i];
        }
    }

    /**
     * the getter method for getting labs Average
     * @return the average of lab
     */
    public float getAvg() {
        return avg;
    }

    /**
     * this method will calculate the average
     * base on scores and the current size of array
     */
    public void calculateAvg() {
        avg = 0;
        for(int i = 0; i < currentSize; i++) {
            avg += (float) students[i].getGrade();
        }
        avg /= currentSize;
    }

    /**
     * the getter method for lab day
     * @return the lab day
     */
    public String getDay() {
        return day;
    }

    /**
     * sets the lab day
     * @param day the day we want to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * the getter of capacity
     * @return the number of capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * the setter of capacity
     * @param capacity the number of capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * the getter of the current size
     * @return get the current size of array
     */
    public int getCurrentSize(){
        return currentSize;
    }
}
