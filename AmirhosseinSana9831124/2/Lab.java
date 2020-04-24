public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * Create a new Lab with a given capacity and day.
     */
    public Lab(int cap, String d) {
        capacity = cap;
        students = new Student[cap];
        day = d;
        avg = 0;
        currentSize = 0;
    }

    /**
     * Add a student to Lab.
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
     * Print set of students and average.
     */
    public void print() {
        calculateAvg();
        System.out.println("Students:");
        for(int i = 0; i < currentSize; i ++)
            students[i].print();
        System.out.println("Average: " + avg);
    }

    /**
     * Get set of students.
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     * Set set of students.
     */
    public void setStudents(Student[] students) {
        this.students = students;
        capacity = students.length;
        currentSize = 0;
        for(Student s : students)
            if(s != null)
                currentSize ++;
    }

    /**
     * Get average
     */
    public int getAvg() {
        calculateAvg();
        return avg;
    }
    /**
     * Calculate average.
     */
    public void calculateAvg() {
        for(int i = 0; i < currentSize; i ++)
            avg += students[i].getGrade();
        avg /= currentSize;
    }

    /**
     * Get day
     */
    public String getDay() {
        return day;
    }
    /**
     * Set day
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * Get capacity
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * Set capacity
     */
    public void setCapacity(int capacity) {
        if(capacity < currentSize){
            System.out.println("invalid capacity");
            return;
        }
        Student[] tmp = new Student[capacity];
        for(int i = 0; i < currentSize; i ++)
            tmp[i] = students[i];
        students = tmp;
        this.capacity = capacity;
    }
}
