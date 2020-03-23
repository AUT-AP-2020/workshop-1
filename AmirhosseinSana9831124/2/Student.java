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
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lname last name of student
     * @param sID student ID
     */
    public Student(String fName, String lname, String sID){
        firstName = fName;
        lastName = lname;
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
     * @param firstName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }
    /**
     * get the Last name of student
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName set last name of a student
     */
    public void setLastName(String lName) {
        lastName = lName;
    }
    /**
     * get the id of student
     * @return id field
     */
    public String getId() {
        return id;
    }
    /**
     * @param id set id of a student
     */
    public void setId(String id) {
        if(id.length() != 7){
            System.out.println("invalid id");
            return;
        }
        for(int i = 0; i < 7; i ++)
            if(id.charAt(i) < '0' || id.charAt(i) > '9'){
                System.out.println("invalid id");
                return;
            }
        this.id = id;
    }

    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade() {
        return grade;
    }
    /**
     * @param grade set grade of a student
     */
    public void setGrade(int grade) {
        if(grade > 20 || grade < 0){
            System.out.println("invalid grade");
            return;
        }
        this.grade = grade;
    }


    /**
     * Print the student’s last name and ID number to the
     output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }

}