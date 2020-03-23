/**
 * The Lab class represents a Lab in a education system.
 * @author Mahdi
 * @version 0.0
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     *
     * @param cap capacity field
     * @param d day field
     */
    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        students=new Student[capacity];
    }
    /**
     * enroll new student
     * @param std new student
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
     * print all students
     */
    public void print() {
        for (int i = 0 ; i<currentSize;i++) {
            System.out.println("std firstname: " + students[i].getFirstName()+ " std id:" +students[i].getId() + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Lab AVG:" + avg);
    }
    /**
     * get students
     * @return students array reference
     */
    public Student[] getStudents() {
        return students ;
    }
    /**
     * set students array reference
     * @param students
     */
    public void setStudents(Student[] students) {
        if(students!=null)
            this.students=students;
    }
    /**
     * get average
     * @return average
     */
    public int getAvg() {
        calculateAvg();
        return  avg ;
    }
    /**
     * calculating average
     */
    public void calculateAvg() {
        int sum =0 ;
        for(int i = 0 ; i<currentSize;i++){
            sum = sum + students[i].getGrade();
        }
        avg=sum/currentSize;
    }
    /**
     * get class day
     * @return class day
     */
    public String getDay() {

        return day ;
    }
    /**
     * set class day
     * @param day class day
     */
    public void setDay(String day) {

        this.day=day ;
    }
    /**
     * get class capacity
     * @return capacity field
     */
    public int getCapacity() {

        return capacity;
    }
    /**
     * set class capacity
     * @param capacity class capacity
     */
    public void setCapacity(int capacity) {
        if(capacity>0)
            this.capacity=capacity;
    }
}
