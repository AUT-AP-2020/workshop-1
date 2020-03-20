/**
 * Lab class define a lab
 * @author Ali Ansari
 * @version 1.0.0
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * Constructor for lab
     * @param capacity Capacity of the lab
     * @param d Day of the lab
     */
    public Lab(int capacity, String d) {
        currentSize = 0;
        avg = 0;
        this.setCapacity(capacity);
        this.day = d;
        students = new Student[capacity];
    }

    /**
     * Add students to the lab
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
     * Print students and their average
     */
    public void print() {
        System.out.println("Lab:"+this.day);
        for (int i = 0; i < currentSize; i++)
            students[i].print();
        System.out.println("Average: " + avg);
    }

    /**
     * Getter for students
     * @return an array of Students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Setter for students
     * @param students An array of Students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * Getter for average
     * @return Average
     */
    public int getAvg() {
        return avg;
    }

    /**
     * Calculate average of lab
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i = 0; i < currentSize; i++)
            sum += students[i].getGrade();
        avg = sum / currentSize;
    }

    /**
     * Getter for Day
     * @return Day of the lab
     */
    public String getDay() {
        return day;
    }

    /**
     * Setter for Day
     * @param day Day of the lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Getter for Capacity
     * @return Capacity of lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Setter for capacity
     * @param capacity Capacity of the lab
     */
    public void setCapacity(int capacity) {
        if(capacity>=0)
            this.capacity = capacity;
        else
            System.out.println("Capacity is'nt correct");
    }
}
