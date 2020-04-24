package APLAB;

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
     * @param sID   student ID
     */
    public Student(String fName, String lname, String sID) {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    /**
     * get the first name of student
     *
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
    * @param lastName set last name of student
    */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param grade set grade of student
     * */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @param id set id of the student
     * also tests if it's length is 7 and contains only digits
     */
    public void setId(String id) {
        boolean ok = true;
        for (int i = 0; i < id.length(); i++)
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                ok = false;
                break;
            }
        if (id.length() != 7)
            ok = false;
        if (!ok)
            return;
        this.id = id;
    }

    /**
     * @return lastName field
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @return id field
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @return grade number
     */

    public int getGrade() {
        return grade;
    }

    /**
     * Print the student’s last name and ID number to the
     * output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }
}
