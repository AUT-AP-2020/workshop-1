/** * The Student class represents a student in a student administration system.
* It holds the student details relevant in our context.
 * @author Sepehr
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
    public Student(String firstName,String lastName,String id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.grade=0;

    }

    /**
     * return the value.
     * @return grade.
     */
    public int getGrade() {
        return grade;
    }

    /**
     * return the value
     * @return firstName.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * return the value
     * @return the Id.
     */
    public String getId() {
        return id;
    }

    /**
     * return the value
     * @return the lastName.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * a class to set the firstName;
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * a clas to set the grade.
     * @param grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * a method to set the id.
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * a method to set the lastName.
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * a method to print the information.
     */
    public void print(){
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }
}
