/**
 * simulates a lab of students
 * 
 * @author amirali belbasi
 */
public class Lab {
    private Student[] students;
    private double avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * constructs a lab
     * 
     * @param cap capacity of the lab
     * @param d   the day lab is being hold
     */
    public Lab(final int cap, final String d) {
        // initialing size of students array
        capacity = cap;
        students = new Student[capacity];
        day = d;
        currentSize = students.length - 1;
    }

    /**
     * enroll a student in lab
     * 
     * @param std a student object
     */
    public void enrollStudent(final Student std) {
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
            if (i == null)
                continue;
            i.print();
        }
        calculateAvg();
        System.out.println("average of lab: " + avg);
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
    public void setStudents(final Student[] students) {
        this.students = students;
    }

    /**
     * gets average of students in a lab
     * 
     * @return average of students in a lab
     */
    public double getAvg() {
        return avg;
    }

    /**
     * calculates average grade of a lab & save it to avg field
     */
    public void calculateAvg() {
        avg = 0;
        for (final Student i : students) {
            avg += i.getGrade();
        }
        avg /= capacity;
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
    public void setDay(final String day) {
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
    public void setCapacity(final int capacity) {
        this.capacity = capacity;
    }
}