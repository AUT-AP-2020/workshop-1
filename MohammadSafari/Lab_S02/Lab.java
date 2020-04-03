// Objects are sent in call-by-value mode
public class Lab {
    // fields

    // array of students
    private Student[] students;
    // keep avrage grade
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * 
     * @param cap the maximum capacity of Lab
     * @param d   the day
     */
    public Lab(int cap, String d) {
        this.capacity = cap;
        this.day = d;
        // default starting size
        this.currentSize = 0;
        // allocating memory for enrollment array
        students = new Student[capacity];
    }

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * print some info about lab and each student
     */
    public void print() {
        for (int i = 0; i < currentSize; i++)
            students[i].print();

        // ***the correct form of given imperfect code***

        // for (int i = 0; i < students.length; i++) {
        // System.out.println("std fname: " + students[i].getFirstName() + " std id:" +
        // students[i].getId()
        // + " std grade:" + students[i].getGrade());
        // }
        //System.out.println("Lab AVG:" + avg);

        this.calculateAvg();
        System.out.println("The average grade of Lab is " + avg + ".");
    }

    /**
     * @return the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students the students to set
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return the avg
     */
    public int getAvg() {
        // calculates before returning average
        this.calculateAvg();
        return avg;
    }

    /**
     * calculates average grade of total class
     * 
     * @see #print()
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i = 0; i < currentSize; i++)
            sum += students[i].getGrade();
        avg = (int) (sum / currentSize);
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
