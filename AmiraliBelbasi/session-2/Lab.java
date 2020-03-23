/**
 * simulates a lab of students
 * 
 * @author amirali belbasi
 */
public class Lab
{
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    private int gradeAverage;

    /**
     * constructs a lab
     * 
     * @param cap capacity of the lab
     * @param d   the day lab is being hold
     */
    public Lab(int cap, String d) {
        // initialing size of students array
        students = new Student[capacity];
        day = d;
        capacity = cap;
    }

    /**
     * enroll a student in lab
     * 
     * @param std a student object
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
     * prints information of lab students & average grade of the lab
     */
    public void print() {
        for (Student i : students) {
            i.print();
        }
        calculateAvg();
        System.out.println(gradeAverage);
    }

    /**
     * gets an array of students
     * 
     * @return array of students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * sets an array of students
     * 
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * gets average of students in a lab
     * 
     * @return average of students in a lab
     */
    public int getAvg() {
        return gradeAverage;
    }

    /**
     * calculates average grade of a lab & save it to gradeAverage field
     */
    public void calculateAvg() {
        for (Student i : students) {
            gradeAverage += i.grade;
        }
        gradeAverage /= students.lenght();
    }

    /**
     * gets the day lab is being hold
     * 
     * @return the day lab is being hold
     */
    public String getDay() {
        return day;
    }

    /**
     * sets the day lab is being hold
     * 
     * @param day the day lab is being hold
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * gets capacity of lab
     * 
     * @return capacity of lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets capacity of lab
     * 
     * @param capacity capacity of lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}