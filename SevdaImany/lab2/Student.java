
/**
 * The Student class represent a student in a student administration system. it
 * holds the student details relevent to our context.
 * 
 * @author sevda
 * @version 0.0
 */
public class Student {
    // the student's first name
    private String firstName;
    // the student's last name
    private String lastName;
    // the student id
    private String id;
    //the grade
    private int grade;

    /**
     * creat a new student with a given name and ID number.
     * 
     * @param firstName first name of student
     * @param lastName last name of student 
     * @param id student ID
     */
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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
 *
 * @param firstName set first name of a student
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * get the last name of student
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }
/**
 * 
 * @param lastName set last name of a student
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * get the id
 * @return id field
 */
    public String getId() {
        return id;
    }
/**
 * 
 * @param id set id
 */
    public void setId(String id) {
        this.id = id;
    }
/**
 * get grade of student
 * @return grade field
 */
    public int getGrade() {
        return grade;
    }
/**
 * 
 * @param grade set grade
 */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    
    /**
     * print the student's lastName and id number to the output terminal
     */
    public void print(){
        System.out.println(lastName + ", student ID : "+ id + ", grade :" +grade );
    }

   
    

}