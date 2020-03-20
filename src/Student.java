/**
 * Student class define a student
 * @author Ali Ansari
 * @version 1.0.0
 */
public class Student {
    private String fName;
    private String lName;
    private String id;
    private int grade;

    /**
     * Constructor for Students' Object
     * @param fName Student's first name
     * @param lName Student's last name
     * @param id Student's ID
     * @param grade Student's grade
     */
    public Student(String fName, String lName, String id, int grade) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.grade = grade;
    }

    /**
     * Getter for First Name
     * @return Student's First Name
     */
    public String getFirstName() {
        return fName;
    }

    /**
     * Setter for First Name
     * @param fName The student's First Name
     */
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * Getter for Last Name
     * @return Student's Last Name
     */
    public String getLName() {
        return lName;
    }

    /**
     * Setter for last name
     * @param lName Student's Last Name
     */
    public void setLName(String lName) {
        this.lName = lName;
    }

    /**
     * Getter for ID
     * @return Student's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for ID
     * @param id Student's ID
     */
    public void setId(String id) {
        if(id.length()==7)
            this.id = id;
        else
            System.out.println("ID is'nt correct");
    }

    /**
     * Getter for grade
     * @return Student's grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * Setter for grade
     * @param grade Student's grade
     */
    public void setGrade(int grade) {
        if(grade>=0 || grade<=20)
            this.grade = grade;
        else
            System.out.println("Grade is'nt correct");
    }

    public void print(){
        System.out.println("Name:"+fName+" "+lName + " ID: " + id + " Grade: " + grade);
    }
}
