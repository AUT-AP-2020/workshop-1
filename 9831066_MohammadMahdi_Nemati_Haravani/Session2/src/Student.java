public class Student {

    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    // the grade
    private float grade;

    /**
     * Create a new student with a given name and ID number. *
     *
     * @param fName first name of student
     * @param lName last name of student
     * @param sID   student ID
     */
    public Student(String fName, String lName, String sID) {
        if(new IdNumberCheck().IdCheck(sID)) {
            firstName = fName;
            lastName = lName;
            id = sID;
            grade = 0;
        }
    }

    /**
     * get the first name of student * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * @param grade set grade of a student
     */
    public void setGrade(float grade) {
        if(grade>=0 && grade<=20) {
            this.grade = grade;
        }
    }

    /**
     * get grade of a student * @return grade of student
     */
    public float getGrade() {
        return grade;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: " + id + ", grade: " + grade);
    }

    /**
     * get ID of a student
     */
    public String getId() {
        return id;
    }
}
