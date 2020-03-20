/**
 * a Lab is like a StudentClass were hold some Students.
 * @author farzad
 * @version 0.0
 */
public class Lab {

    //all students of Lab
    private Student[] students;
    // average of grades.
    private float avg;
    // the day which the class is to be held.
    private String day;
    // capacity of Lab for students
    private int capacity;
    // currents amount of students in Lab.
    private int currentSize;
    // name of Lab
    private String name;


    /**
     * simple constructor of Lab
     * @param cap capacity of Lab
     * @param d days when the Lab is holding on.
     * @param name the name of Lab
     */
    public Lab(int cap, String d,String name)
    {
        capacity = cap;
        day = d;
        this.name = name;
        students = new Student[cap];
    }

    /**
     * add a student to Lab if it's not already full of students.
     * @param std student to be added
     */
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        }
        else
        {
            System.out.println("Lab is full!!!");
        }
    }


    /**
     * prints the Lab's details which  includes " 1-number of lab in list  2-students of lab    3-average of students"
     */
    public void print()
    {
        int counter = 1;
        for(Student tempStudent : students)
        {
            System.out.print(counter + "- ");
            tempStudent.print();
            counter++;
        }
        calculateAvg();
        System.out.println("average = " + avg);
    }


    /**
     * get Students of lab.
     * @return Student[]: all students of lab
     */
    public Student[] getStudents() {return students;}

    /**
     * set Students if is possible.
     * @param students all students that are going to be in class
     */
    public void setStudents(Student[] students) {this.students = students;}

    /**
     * get average grade of students .
     * @return float: average of students.
     */
    public float getAvg() {
        calculateAvg();
        return avg;
    }


    private void calculateAvg()
    {
        float sum = 0;
        for(Student tempStudent : students)
        {
            sum += tempStudent.getGrade();
        }
        avg =  sum / currentSize;
    }

    /**
     * get days when the lab is held on.
     * @return String: the days of lab
     */
    public String getDay() {return day;}

    /**
     * set days of lab
     * @param day days of lab
     */
    public void setDay(String day) {this.day = day;}

    /**
     * get the amount of lab's capacity.
     * @return int: lab's capacity.
     */
    public int getCapacity() {return capacity;}

    /**
     * set the capacity for lab.
     * @param capacity the capacity of lab.
     */
    public void setCapacity(int capacity) {this.capacity = capacity;}

    /**
     * get the name of lab.
     * @return String name of lab.
     */
    public String getName() {
        return name;
    }
}