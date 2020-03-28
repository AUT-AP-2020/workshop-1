
/**The Student class represents a student in
 * a student administration system.
 * It holds the student details relevant in our context.
 * @author Mohamad Hasannejadi
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
    
    /** * Create a new student with a given name and ID number.
     * 
     * @param fName first name of student 
     * @param lname last name of student  
     * @param sID student ID */ 
    public Student(String fName, String lName, String sID){ 
        firstName = fName; 
        lastName = lName; 
        id = sID; 
        grade = 0; 
    }
    /** 
     * get the first name of student 
     * @return firstName field */
    public String getFirstName() { 
        return firstName; 
    } 
    /** 
    * @param firstName set first name of a student */ 
    public void setFirstName(String fName) {
         firstName = fName; 
        }
    /** 
     * get the last name of student 
     * @return lastName field */
    public String getlastName() { 
        return lastName; 
    } 
    /** 
    * @param lastName set last name of a student */ 
    public void setlastName(String lName) {
         lastName = lName; 
        }
    /** 
     * get the student number 
     * @return sID field */
    public String getID() { 
        return id; 
    } 
    /** 
    * @param sID set id of a student */ 
    public void setID(String sID) {
        id = sID; 
        }

    /** 
     * get grade of student 
     * @return grade field */
    public int getGrade() { 
        return grade; 
    } 
    /** 
    * @param sGrade set grade a student */ 
    public void setGrade(int sGrade) {
         grade = sGrade; 
        }
    
    /** 
    Print the student’s last name and ID number to the output terminal. */ 
    public void print() { 
        System.out.println(firstName +" "+ lastName + ", student ID: " + id + ", grade: " + grade); 
    }
}