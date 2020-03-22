
/**
 * The Lab class represent a lab
 * 
 * @author sevda imany
 * @version 0.0
 */
public class Lab {
    //list of students
    private Student[] students;
    //the average of students grades
    private int avg;
    private String day;
    //capacity of the lab
    private int capacity;
    //current size of Lab
    private int currentSize;
/**
 * 
 * @param cap capacity of the Lab
 * @param d
 */
    public Lab(int cap, String d) {
        this.capacity = cap;
        this.day = d;
        currentSize = 0;
        students = new Student[cap];
    }
 /**
  * add std if the lab has capacity
  * @param std
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
 * get students list
 * @return student list
 */
    public Student[] getStudents() {
        return students;
    }
/**
 * set students
 */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvg() {
        return avg;
    }
/**
 * calculate students grade average
 */
    public void calculateAvg() {
        avg = 0;
        for (int i = 0; i < currentSize ; i++) {
            avg += students[i].getGrade();
        }
        avg /= students.length;
    }
/**
 * print the students id and grade and averege of all
 */
    public void print(){
        for(int i = 0; i < currentSize ; i++){
            students[i].print();
        }
        calculateAvg();
        System.out.println("Lab avg : " + avg);
    }
}