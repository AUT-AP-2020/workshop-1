package APLAB;

public class Lab {
    // the array of studs for use
    private Student[] students;
    // this could be float or double but not int!
    private double avg;
    // idk why we have this, probably the number of days that we spent till now
    private String day;
    // the maximum capacity of the class
    private int capacity;
    // our current number of studs in the lab
    private int currentSize;

    /**
     *
     * @param cap is the initial capacity of the LAB
     * @param d is the initial day
     */

    public Lab(int cap, String d) {
        this.day = d;
        this.capacity = cap;
        currentSize = 0;
        avg = 0;
        students = new Student[cap];
    }

    /**
     *
     * @param std is the student to add
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity)
            students[currentSize++] = std;
        else
            System.out.println("Lab is full!!!");
    }

    /**
     * this method prints the lab
     * tooye code eshtebahe dade shode bayad students.size be currentSize taghir kone
     */
    public void print() {
        for (int i = 0; i < currentSize; i++)
            students[i].print();
        calculateAvg();
        System.out.println("The average of the lab is " + avg);
    }

    /**
     *
     * @return students array
     */
    public Student[] getStudents() {
        return this.students;
    }

    /**
     *
     * @param students will be changed to another array!
     */
    public void setStudents(Student[] students) {
        if (capacity >= 0)
            System.arraycopy(students, 0, this.students, 0, capacity);
    }

    /**
     *
     * @return the current average
     */
    public double getAvg() {
        calculateAvg();
        return avg;
    }

    /**
     * calculates the average of the grades in the lab
     */
    public void calculateAvg() {
        avg = 0;
        for (int i = 0; i < currentSize; i++)
            avg += students[i].getGrade();
        avg /= (double)currentSize;
    }

    /**
     *
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     *
     * @param day will be changed
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     *
     * @return the maximum capacity of the LAB
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @return the currentSize of the LAB
     */
    public int getCurrentSize() {
        return currentSize;
    }

    /**
     *
     * @param capacity will set to a new one
     */
    public void setCapacity(int capacity) {
        if (capacity >= 0)
            this.capacity = capacity;
        else
            System.out.println("capacity can't be a negative number!");
    }
}
