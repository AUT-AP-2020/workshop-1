/**
 *The Lab class represents a student in a Lab administration system.
 *It holds the lab detail relevant in our context.
 *
 *@author Setayesh
 *@version 0.0
 */
public class Lab {
    //the students of Student class
    private Student[] students;
    //average of student's grades
    private int avg;
    //the day of lab
    private String day;
    //the capacity of lab
    private int capacity;
    //the current size of the lab
    private int currentSize;


    /**
     * create a new lab with a given capacity and day
     * @param cap capacity of lab
     * @param d day of lab
     */
    public Lab(int cap, String d) {
        students = new Student[cap];
        capacity = cap;
        day = d;
        avg = 0;
        currentSize = 0;
    }

    /**
     * enroll student to lab
     * @param std the student to enroll lab
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
     *print the student last name and ID number and lab average to the output terminal.
     */public void print() {
         for (int i = 0; i < currentSize; i++) {
             System.out.println("std fName: " + students[i].getFirstName()
                     + " std id:" + students[i].getId()
                     + " std grade:"+ students[i].getGrade());
         }
         calculateAvg();
         System.out.println("Lab AVG:" + avg);
     }
    /**
     * get the students of lab
     * @return students field
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     *
     * @param students set the students of lab
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * get the average of students lab grade
     * @return avg field
     */
    public int getAvg() {
        return avg;
    }

    /**
     * calculate the average of lab's students grade
     */
    public void calculateAvg() {
        int sum = 0;
        for(int i = 0; i < currentSize; i++){
            sum += students[i].getGrade();
        }
        avg = sum / currentSize;
    }

    /**
     * get the day of lab
     * @return day field
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day set the day of lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * get the capacity of lab
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set the capacity of lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}