package ws1;

public class Student {
    //the student's first name
    private String firstName;
    //the student's last name
    private String lastName;
    //the student ID
    private String id;
    //the grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     * @param fName first name of student
     * @param lName last name of student
     * @param sID student id
     */
    public Student(String fName , String lName , String sID){
        firstName = fName;
        lastName = lName;
        id = sID;
        grade = 0;
    }

    /**
     * get the first name of a student
     * @return first name field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName set first name of a student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
