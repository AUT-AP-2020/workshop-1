/**
 * The Student class represents a student in a student administration system. It
 * holds the student details relevant in our context.
 * 
 * @author Ehsan
 * @version 0.0
 */
class Student {
    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    // the grade
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
     * gets the first name of student
     * 
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets the first name of student
     * 
     * @param firstName first name of student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * gets the last name of student
     * 
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets the last name of student
     * 
     * @param firstName last name of student
     */
    public void setLastName(String lName) {
        lastName = lName;
    }

    /**
     * gets the id of student
     * 
     * @return id field
     */
    public String getId() {
        return id;
    }

    /**
     * sets id of hte student
     * 
     * @param studentId id of student
     */
    public void setId(String studentId) {
        id = studentId;
    }

    /**
     * gets grade of the student
     * 
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }

    /**
     * sets grade of the student
     * 
     * @param studentGrade grade of student
     */
    public void setGrade(int studentGrade) {
        grade = studentGrade;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}