/**  * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 * @author Amirreza
 * @version 1.0
 */
public class Student
{
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
     * @param sID student ID
     */
    public Student(String fName, String lname, String sID)
    {
        this.firstName = fName;
        this.lastName = lname;
        this.id = sID;
        this.grade = 0;
    }

    /**  * get the first name of student
     *  @return firstName field
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     *  get the last name of student
     *  @return lastName field
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lName set last name of a student
     */

    public void setLastName(String lName)
    {
        lastName = lName;
    }

    /**
     * get the grade of student
     *  @return grade field
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     * @param grade set grade of a student
     */

    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    /**
     * get the id of student
     *  @return id field
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id set id of a student
     */

    public void setId(String id)
    {
        this.id = id;
    }
    /**
     * @param fName set first name of a student
     */

    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}
