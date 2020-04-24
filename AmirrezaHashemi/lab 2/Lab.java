/**
 * The Lab class represents a lab.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 */
public class Lab {
    // The lab's students;
    private Student[] students;
    //average of lab's students
    private int avg;
    //The lab's day
    private String day;
    //The lab's capacity
    private int capacity;
    //The lab's current size
    private int currentSize;

    /**
     * Create a new Lab with given capacity and day.
     *
     * @param cap the capacity
     * @param d   the day
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        students = new Student[cap];
        avg = 0;
        currentSize = 0;
    }


    /**
     * add a student to lab.
     *
     * @param std the student
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
     * Get students of lab.
     *
     * @return the students of lab.
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Sets students of lab.
     *
     * @param students the students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * Gets day of lab.
     *
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * Sets day of lab.
     *
     * @param day the day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Gets capacity of lab.
     *
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Gets average of lab.
     *
     * @return the avg
     */
    public int getAvg() {
        return avg;
    }

    /**
     * Sets capacity of lab.
     *
     * @param capacity the capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Print lab's day,lab's student and lab's average.
     */
    public void print() {
        System.out.println("Lab's day : " + day);
        System.out.println("Lab's students : ");

        for (int i = 0; i < currentSize; i++) {
            students[i].print();
        }
        System.out.println("Lab's average : " + avg);

    }

    /**
     * Calculate average of lab's students.
     */
    public void calculateAvg() {
        if (currentSize == 0)
            System.out.println("There is no student");
        else {
            for (int i = 0; i < currentSize; i++) {
                avg += students[i].getGrade();
            }
            avg /= currentSize;
        }
    }

}
