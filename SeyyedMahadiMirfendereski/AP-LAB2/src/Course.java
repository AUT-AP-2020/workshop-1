/**
 * The Course class represents a Course in a education system.
 * @author Mahdi
 * @version 0.0
 */
public class Course {
    private String name ;
    private int vahed ;
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     *
     * @param name name of course
     * @param vahed it is TA or lab or general course or technical course or technical course with lab
     * @param day class day
     * @param capacity course capacity
     */
    public Course(String name, int vahed, String day, int capacity) {
        this.name = name;
        this.vahed = vahed;
        this.day = day;
        this.capacity = capacity;
        students=new Student[capacity];
        avg=0;
        currentSize=0;
    }

    /**
     * get the name of course
     * @return Name field
     */
    public String getName() {
        return name;
    }

    /**
     * get the first name of course
     * @return Name field
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get vahed
     * @return vahed
     */
    public int getVahed() {
        return vahed;
    }

    /**
     * set the vahed
     * @param vahed vahed field
     */
    public void setVahed(int vahed) {
        if(vahed<=4 && vahed>=0)
            this.vahed = vahed;
    }

    /**
     * get students
     * @return students array reference
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * set students array reference
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * get average
     * @return average
     */
    public int getAvg() {
        return avg;
    }

    /**
     * get class day
     * @return class day
     */
    public String getDay() {
        return day;
    }

    /**
     * set class day
     * @param day class day
     */
    public void setDay(String day) {
        this.day = day;
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
            this.capacity = capacity;
    }

    /**
     * get currentSize
     * @return currentSize field
     */
    public int getCurrentSize() {
        return currentSize;
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
            System.out.println("Course is full!!!");
        }
    }

    /**
     * print all students
     */
    public void print() {
        for (int i = 0 ; i<currentSize;i++) {
            System.out.println("std firstname: " + students[i].getFirstName()+ " std id:" + students[i].getId() + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Course AVG:" + avg);
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


}
