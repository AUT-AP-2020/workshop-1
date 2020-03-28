/**
 * The Student class represents a student in a student
 * administration system.
 * It holds the student details relevant in our context.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 */
public class Student {
    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    //the grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lname last name of student
     * @param sID   student ID
     */
    public Student(String fName, String lname, String sID) {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    /**
     * get the first name of student
     *
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * Gets last name of a student.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name of a student.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets id of a student.
     *
     * @return the id of a student
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id of a student.
     *
     * @param id the id of a student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets grade of a student.
     *
     * @return the grade of a student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Sets grade of a student.
     *
     * @param grade the grade of a student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Print the student’s last name and ID number to the
     * output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }
}
