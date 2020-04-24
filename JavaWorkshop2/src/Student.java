/**
 * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 *
 * @author Ali
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
     * the constructor
     * @param firstName
     * @param lastName
     * @param id
     * @param grade
     */

    public Student(String firstName, String lastName, String id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        setId(id);
        setGrade(grade);
    }

    /**
     *  to set id of the student
     * @param id
     */
    public void setId(String id) {
        if (id.length() == 7)
            this.id = id;
    }

    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName set first name of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Print the student’s last name and ID number to the
     output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }

    /**
     * set the grade of the student
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }
}