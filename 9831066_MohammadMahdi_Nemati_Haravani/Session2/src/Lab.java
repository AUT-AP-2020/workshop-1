public class Lab {
    private Student[] students;
    private float avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * Create a new lab with a given cap number and day string. *
     *
     * @param cap size of lab member
     * @param day time of lab
     */
    public Lab(int cap, String day) {
        if(cap>0){
            students = new Student[cap];
            this.day = day;
            capacity = cap;
            currentSize = 0;
        } else {
            System.out.println("the capacity size is invalid");
        }
    }

    /**
     * @param std add new student member to the lab
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
     * Print the all students last name and ID number to the output terminal.
     */
    public void print () {
        calculateAvg();
        for (int i = 0; i < currentSize; i++) {
            System.out.println("std fname: " + students[i].getFirstName() +
                    " std id:" + students[i].getId() +
                    " std grade: " + students[i].getGrade());
        }
        System.out.println("Lab AVG:" + avg);
    }

    /**
     * get students list
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students set new list of students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * get avg of lab * @return avg of lab
     */
    public float getAvg() {
        return avg;
    }

    /**
     * calculate average of all students grade
     */
    public void calculateAvg() {
        avg = 0;
        for (int i = 0; i < currentSize; i++) {
            avg += students[i].getGrade();
        }
        avg /= capacity;
    }

    /**
     * get day for lab
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day set day of lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * get capacity of lab * @return capacity of lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set capacity of lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

