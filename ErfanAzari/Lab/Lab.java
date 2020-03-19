/**
 * The Lab class represents the students in the lab administration.
 *
 * @author Erfan
 * @version 0.0
 */
public class Lab {
    // an array of students in the lab
    private Student[] students;
    // the average of the students' grades
    private int avg;
    // the day of the lab
    private String day;
    // the capacity of the lab
    private int capacity;
    // the current number of students in the lab
    private int currentSize;

    /**
     * Create a new lab with the given capacity and day
     *
     * @param cap the capacity of the lab
     * @param d the day of the lab
     */
    public Lab(int cap, String d){
        students = new Student[cap];
        avg = 0;
        day = d;
        capacity = cap;
        currentSize = 0;
    }

    /**
     * to add a new student to the lab.
     * check if the lab capacity is not full.
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!");
        }
    }

    /**
     * to print the information of students in the lab and the average of their grade
     */
    public void print(){
        for (int i = 0 ; i < currentSize ; i++)
            students[i].print();
        System.out.println("The average of the students' grade in the lab: " + avg);
        }

    /**
     * get the students of the lab
     * @return students field
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students set a new student
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * get the average grade of the students
     * @return avg field
     */
    public int getAvg() {
        return avg;
    }

    /**
     * @param avg calculate the average grade of the students
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i = 0 ; i < currentSize ; i++)
            sum = sum + students[i].getGrade();
        this.avg = sum / this.currentSize;
    }

    /**
     * get the day of the lab class
     * @return day field
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day set the day of the lab class
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * get the capacity of the lab class
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set the capacity of the lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}

