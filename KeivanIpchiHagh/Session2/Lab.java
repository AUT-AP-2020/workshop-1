import java.text.DecimalFormat;

/**
 * <h1>Lab Class</h1>
 * This class contains information about class and its participants as well as their current state
 * @author Keivan Ipchi Hagh
 * @version 1.0.0
 */
class Lab {

    /**
     * Indicates an array to store all students enrolled for the Lab
     */
    private Student[] students;
    /**
     * Indicates the average score of the Lab
     */
    private double avg;
    /**
     * Current day
     */
    private String day;
    /**
     * Indicates Lab maximum capacity
     */
    private int capacity;
    /**
     * Indicates Lab current student count
     */
    private int currentSize;

    /**
     * Lab Contructor
     * <p>Inidialize object fields</p>
     * @param capacity
     * @param day
     */
    public Lab(int capacity, String day) {
        this.capacity = capacity;
        this.day = day;
        this.currentSize = 0;   // Initial value
        students = new Student[capacity];   // Initialzie student array
    }

    /**
     * Enroll Students
     * <p>If there is room available, add the student to the Lab; otherwise, print an error</p>
     * @param student Student Obj
     */
    public void enrollStudent(Student student) {
        if (currentSize < capacity)
            students[currentSize++] = student;
        else
            System.out.println("Lab is full; Cannot add student.");
    }

    /**
     * Setter: Set average score
     * @param students average score
     */
    public void setStudents(Student[] students) { this.students = students; }

    /**
     * Getter: Get students array
     * @return Students array
     */
    public Student[] getStudents() { return students; }

    /**
     * Setter: Set average score
     * @param avg average score
     */
    public void setAvg(double avg) { this.avg = avg; }

    /**
     * Getter: Get average score
     * @return average score
     */
    public double getAvg() { return avg; }

    /**
     * Setter: Set capacity
     * @param capacity Maximum number of students in the Lab
     */
    public void setCapacity(int capacity) { this.capacity = capacity; }

    /**
     * Getter: Get capacity
     * @return Maximum number of students in the Lab
     */
    public int getCapacity() { return capacity; }

    /**
     * Setter: Set current Size
     * @param currentSize Number of students in the Lab
     */
    public void setCurrentSize(int currentSize) { this.currentSize = currentSize; }

    /**
     * Getter: Get current Size
     * @return Number of students in the Lab
     */
    public int getCurrentSize() { return currentSize; }

    /**
     * Setter: Set day
     * @param day Current day
     */
    public void setDay(String day) { this.day = day; }

    /**
     * Getter: Get day
     * @return Current day
     */
    public String getDay() { return day; }

    /**
     * Calculate average score
     * <p>Loops though the array and sums all the grades for each student. Then, set the average score</p>
     */
    public void calculateAvg() {
        double avgScore = 0;

        for (int i = 0; i < currentSize; i++)
            avgScore += students[i].getGrade();
        
        // Format precision
        DecimalFormat format = new DecimalFormat("#0.000");
        this.avg = Double.valueOf(format.format(avgScore / currentSize));
    }

    /**
     * Print Lab student's information as well as the overall grade
     * <p><i><b>'students.size()' cannot be used, beacuse some elements may not have been initialized yet! (They are NULL)</b></i></p>
     */
    public void print() {        
        for (int i = 0; i < currentSize; i++)
            students[i].print();

        System.out.println("Student's average score: " + this.avg + "\n");
    }
}