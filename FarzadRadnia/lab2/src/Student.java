/**
 * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 *
 * @author Ehsan
 * @version 0.0
 */
public class Student {
    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    //the grade
    private float grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student ID
     */
    public Student(String fName, String lName, String sID){
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;
    }
    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * set the last name of student
     * @param lastName last name of student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Print the student’s last name and ID number to the
     output terminal.
     */
    public void print() {
        System.out.println(firstName + " " + lastName + ", student ID: "
                + id + ", grade: " + grade);
    }

    /**
     * get grade of student
     * @return float: grade of student
     */
    public float getGrade() {
        return grade;
    }


    /**
     * set the grade of student
     * @param grade grade of student
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }
}