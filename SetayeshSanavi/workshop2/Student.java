/**
 *The Student class represents a student in a student administration system.
 *It holds the student detail relevant in our context.
 *
 *@author Setayesh
 *@version 0.0
 */
public class Student{
    ///////////////////////fields////////////

    //the student's first name
    private String firstName;
    //the student's last name
    private String lastName;
    //the student ID
    private String id;
    //the grade
    private int grade;

    //////////////////constructor///////////
    /**
     * create a new student with a given name and ID number.
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID studentID
     */
    public Student(String fName, String lName, String sID){
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;
    }

    /////////////////////method////////////
    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * @param fName set the first name of student
     */
    public void setFirstName(String fName){
        firstName = fName;
    }
    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade(){
        return grade;
    }
    /**
     * @param gd set the grade of student
     */
    public void setGrade(int gd){
        grade = gd;
    }

    /**
     * get the ID of student
     * @return id field
     */
    public String getId(){
        return id;
    }

    /**
     *
     * @param id set the ID of student
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * print the student last name and ID number to the output terminal.
     */
    public void print(){
        System.out.println(lastName + ", student ID:" + id + ", grade:" + grade);
    }

}