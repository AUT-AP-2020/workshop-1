/**
 * This class represents a student in administration system
 * <p>This class holds details relevent to our context</p>
 * @author Keivan Ipchi Hagh
 * @version 1.0.0
 */
class Student {

    /**
     * Represents student's first name
     */
    private String firstName;

    /**
     * Represents student's last name
     */
    private String lastName;

    /**
     * Represents student's ID
     */
    private String ID;

    /**
     * Represents student's grade
     */
    private double grade;

    /**
     * Object Constructor
     * <p>Initialize object fields<p>
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param ID Student's ID
     * @param grade Student's grade
     */
    public Student(String firstName, String lastName, String ID, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.grade = grade;
    }

    /**
     * Setter: Set first name
     * @param firstName Student's first name
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     * Getter: Get first name
     * @return Student's last name
     */
    public String getFirstName() { return firstName; }

    /**
     * Setter: Set last name
     * @param lastName Student's last name
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     * Getter: Get last name
     * @return Student's last name
     */
    public String getLastName() { return lastName; }

    /**
     * Setter: Set ID
     * @param ID Student's ID
     */
    public void setID(String ID) { this.ID = ID; }

    /**
     * Getter: Get ID
     * @return Studen't ID
     */
    public String getID() { return ID; }

    /**
     * Setter: Set grade
     * @param grade Student's grade
     */
    public void setGrade(double grade) { this.grade = grade; }

    /**
     * Getter: Get grade
     * @return Student's grade
     */
    public double getGrade() { return grade; }

    /**
     * Print student's information
     */
    public void print() {
        System.out.println("Student Name: '" + this.firstName + " " + this.lastName + "' (" + this.ID + ") | Grade: '" + this.grade + "'");
    }
}