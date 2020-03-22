import java.util.Arrays;
import java.util.Objects;

/**
 * this is a class to manage students in a lab
 */
public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(int cap, String d) {
        this.capacity = cap;
        this.currentSize = 0;
        this.day = d;
        this.avg = 0;
        this.students = new Student[cap];
    }

    /**
     * this is a method to enroll students in a lab
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
     * this is a method to show students details in a lab
     */
    public void print() {
        /**
         * Here is a better way to implement
         */
//        for(Student student:students){
//            student.print();
//        }
//        calculateAvg();
//        System.out.println("Average = "+this.avg);

        for (int i = 0; i < currentSize; i++) {
            System.out.println("std fname: " + students[i].getFirstName() + " std id:" + students[i].getId() + " std grade:" + students[i].getGrade());
        }
        calculateAvg();
        System.out.println("Lab AVG:" + avg);

    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getAvg() {
        return avg;
    }

    /**
     * this is a method to calculate average grades of students
     */
    public void calculateAvg() {
        int sum = 0;
        for (int i=0;i<currentSize;i++) {
            sum += students[i].getGrade();
        }
        this.avg = sum / currentSize;
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

    /**
     * this is a method to understand if student is called by reference or value
     * the answer is call by reference
     * @param student
     */
    public void testingCallByReferenceMethod(Student student) {
        student.setGrade(40);
    }

    /**
     * this is a method to check equality of labs
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lab lab = (Lab) o;
        return avg == lab.avg &&
                capacity == lab.capacity &&
                currentSize == lab.currentSize &&
                Arrays.equals(students, lab.students) &&
                Objects.equals(day, lab.day);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(avg, day, capacity, currentSize);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }
}
