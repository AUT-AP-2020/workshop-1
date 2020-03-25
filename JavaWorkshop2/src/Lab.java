public class Lab {

    /**
     * this Lab class is for managing the students of a lab
     * like adding them and calculating the average grade of them
     */


    private Student[] students; // an array of students
    private float avg; // the average of students grades
    private String day; //
    private int capacity; //the maximum students capacity
    private int currentSize; // the current student numbers


    /**
     * the constructor
     * @param cap the capacity of the lab
     * @param d the day on which the lab occurs
     */
    public Lab(int cap, String d) {
        students = new Student[cap];
        this.capacity = cap;
        day = d;
        currentSize = 0;
    }

    /**
     * the method to add students to the lab
     * @param std is the Student object that you want to add!
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
     * a method for printing all the students participating in the class and their average
     */
    public void print() {
        for (int i=0; i<currentSize; i++){
            students[i].print();
        }
        calculateAvg();
        System.out.println("Average Grades: " + avg);
    }

    /**
     * getter of students
     * @return students as an Array
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * a method for adding whole students at once
     * @param students as an array of them
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * simply the average of student grades
     * @return
     */
    public float getAvg() {
        calculateAvg();
        return avg;
    }

    /**
     * calculate the average before accessing avg param
     */
    public void calculateAvg() {
        float sum = 0;
        for (int i=0; i<currentSize; i++){
            sum += students[i].getGrade();
        }
        avg = sum/currentSize;
    }

    /**
     * gives the day param
     * @return
     */
    public String getDay() {
        return day;
    }

    /**
     * sets the day
     * @param day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * fives the capacity field
     * @return
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets the capacity of Lab
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}