/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 *
 * @author Erfan
 * @version 0.0
 */
public class Student {
    // the student's first name
    private String firstName;
    // the student's last name
    private String lastName;
    // the student's id
    private String id;
    // the grade
    private int grade;
/**
 * Create a new student with a given name and ID number.
 *
 * @param fName first name of student
 * @param lName last name of student
 * @param sID student ID
 */
public Student(String fName, String lName, String sID){
    firstName = fName;
    lastName = lName;
    id = sID;
    grade = 0;
}

/**
 * get the first name of student
 * @return firstName field
 */
public String getFirstName(){
    return firstName;
}

/**
 * @param firstName set first name of a student
 */
public void setFirstName(String fName){
    firstName = fName;
}

/**
 * get the last name of student
 * @return lastName field
 */
public String getLastName(){
    return lastName;
}

/**
 * @param lastName set first name of a student
 */
public void setLastName(String lName){
    lastName = lName;
}

/**
 * get the ID of student
 * @return id field
 */
public String getId(){
    return id;
}

/**
 * @param id set ID of a student
 */
public void setId(String Id){
    if (id.length() == 7)
        id = Id;
}

/**
 * get the grade of student
 * @return grade field
 */
public int getGrade(){
    return grade;
}

/**
 * @param grade set grade of a student
 */
public void setGrade(int Grade){
    this.grade = Grade;
}

/**
 * Print the student's last name and ID number to the output terminal.
 */
public void print(){
    System.out.println(lastName + ", student UD: " + id + ", grade: " + grade);
}


}
