/**
 * the class Student represent a Student in a faculty 
 * holds information about the student
 * @author NeginKheirmand
 * @version 1.0
 */



package ir.ac.aut;

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
     * getter method
     * @return grade
     */
    public int getGrade(){
        return grade;
    }


    /**
     * getter method for the id
     * @return id
     */
    public String getId(){
        return id;
    }

    /**
     * setter method
     * @param grade
     */
    public void setGrade(int grade){
        this.grade=grade;
        return;
    }


    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }


    /**
     * Print the student’s last name and ID number to the
     output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "+ id + ", grade: " + grade);
    }


}