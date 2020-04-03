/**
 * The Student class represents a student in a student administration system. It
 * holds the student details relevant in our context.
 * 
 * @author Mohammad
 * @version 0.0
 */
public class Student {
    // fields

    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    // the grade
    private int grade;

    // constructors

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
        // id = sID;
        this.setId(sID);
        grade = 0;
    }

    // methods

    // Accessors and Mutators

    /**
     * get the first name of student
     * 
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
        System.out.println("ID is" + (isIdValid(7) ? "" : " not ") + " Valid!");
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
        System.out.println("Grade is" + (isGradeValid(0, 20) ? "" : " not ") + " Valid!");
    }

    // validation checking methods

    public boolean isIdValid(int length) {
        return (this.id.length() == length) ? true : false;
    }

    public boolean isGradeValid(int bottomBound, int topBound) {
        return (this.grade >= bottomBound && this.grade <= topBound) ? true : false;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }

}