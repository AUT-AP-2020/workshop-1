import java.util.Date;

/**
 * The Student class reprsenets a student in a student administration system.
 * It holds the studnet details relevant in our context.
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.0.0
 */
class Student
{
            /* Fields */

    // the student's first name
    private String firstName;

    // the student's last name
    private String lastName;

    // the student ID
    private String id;

    // the grade
    private float grade;




        /* Constructor */

    /**
     * Create a new {@code Student} with a given name and ID number.
     * 
     * @param firstName : first name of the student
     * @param lastName : last name of the student
     * @param id : student ID
     */
    public Student(String firstName, String lastName, String id) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 0.0f;
    }
    


            /* Methods */

    // * setter methods *

    /**
     * Set the student first name
     * @param firstName : the first name of the student
     */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    /**
     * Set the student last name
     * @param lastName : the last name of the student
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /**
     * Set the student ID
     * @param id : the student ID
     */
    public void setId(String id) 
    {
        this.id = id;
    }

    /**
     * Set the grade of the student
     * @param grade : the grade of the student
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }


    // * getter methods *

    /**
     * @return the first name of the student
     */
    public String getFirstName() 
    {
        return this.firstName;
    }

    /**
     * @return the last name of the student
     */
    public String getLastName() 
    {
        return this.lastName;
    }

    /**
     * @return the student ID
     */
    public String getId() 
    {
        return this.id;
    }

    /**
     * @return the student grade
     */
    public float getGrade() 
    {
        return this.grade;
    }



    /**
     * Print the student's name, ID number and grade in standard output (Terminal)
     */
    public void print()
    {
        System.out.println("\n<--------------------------------------------------->\n");
        System.out.println("Student Name: " + firstName + " " + lastName + " .");
        System.out.println("Student ID: " + id + " .");
        System.out.println("Student Grade: " + grade + " .");
        System.out.println("\n<--------------------------------------------------->\n");
    }
}

/**
 * The Lab class is a simple student administration systme.
 * It holds students, average studentes grades and the day of making changes.
 * Lab has a limited number of students.
 * 
 * @author Mohammad Mahdi Malmasi
 * @version 0.0.0
 */
class Lab 
{
            /* Fields */
            
    // the lab's students
    private Student[] students;

    // the average lab's studentes grades
    private float avrg;

    // the day of making changes
    private String day;

    // the lab student capacity
    private int capacity;

    // the number of the added students
    private int currentSize;




         /* Constructor */

    public Lab(int capacity)
    {
        this.capacity = capacity;

        this.students = new Student[capacity];
        this.avrg = 0;
        this.currentSize = 0;

        Date today = new Date();
        this.day = today.toString().split(" ")[0];
    }




            /* Methods */



    // * setter method *

    /**
     * set the capacity of the Lab
     * @param capacity the capacity of the Lab
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }



    // * getter methods *

    /**
     * @return the students of the lab
     */
    public Student[] getStudents() 
    {
        return students;
    }

    /**
     * @return the average lab's studentes grades
     */
    public float getAvrg() 
    {
        calculateAvg();
        return avrg;
    }

    /**
     * @return the day of making changes
     */
    public String getDay() 
    {
        return day;
    }

    /**
     * @return the capacity of the lab
     */
    public int getCapacity() 
    {
        return capacity;
    }

    /**
     * @return the current number of the lab's students
     */
    public int getCurrentSize() 
    {
        this.currentSize = students.length;
        return currentSize;
    }





    /**
     * This method add the given student to the lab
     * 
     * @param std : student to add
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

    // this method calculate the average lab's studentes grades
    private void calculateAvg()
    {
        // this value holds the sum of the students grades
        float sum = 0;

        for (Student student : students)
        {
            if (student != null)
                sum += student.getGrade();
        }

        this.avrg = sum/this.currentSize;
    }

    /**
     * This method print the lab's students info and the lab avrg in the standard output (Terminal)
     */
    public void print() 
    {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  THE LAB STUDENTS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Student student : students)
        {
            if (student != null) 
                student.print();
        }

        calculateAvg();
        System.out.println("The Lab Avrg: " + this.avrg + "\n\n\n");
    }
}

public class WorkShop2
{
    public static void main(String[] args) 
    {
        Student std1 = new Student("Mohammad Mahdi", "Malmasi", "9831139");
        Student std2 = new Student("Ali", "Ghasemi", "9831000");

        std1.setGrade(18.45f);
        std2.setGrade(20f);

        std1.print(); 

        Lab lab = new Lab(3);
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);

        lab.print();
    }
}