/**
 * @throws class-Lab
 * a class to form a lab for Ap subject;
 * @author Sepehr Moghiseh
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * a constructor
     * @param cap
     * @param d
     */
    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        students=new Student[cap];
        currentSize=0;
    }

    /**
     * enrolling the students while the current size is lower than capacity.
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
 * print the information & the average of the lab.
 */
    public void print() {
        for (int i = 0; i <students.length ; i++) {
            System.out.println(students[i].getLastName() + ", student ID: " + students[i].getId() + ", grade: " + students[i].getGrade());
        }
        System.out.println("Average of the labs is "+avg);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students=students;
    }

    /**
     * calculate the Average of the lab
     */
    public void calculateAvg() {
        int sum=0;
        avg=0;
        for (int i = 0; i <students.length ; i++) {
            sum+=students[i].getGrade();
        }
        avg=sum/students.length;

    }
    public int getAvg() {
        return avg;
    }



    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day=day;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}
