/**
 * this is a class for students details
 */
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * this is a method to sure that the id is included with exactly 7 nums.
     *
     * @param id
     */
    public void setId(String id) {
        if (id.length() == 7) {
            this.id = id;
        } else {
            System.out.println("Wrong Input!");
        }
    }

    /**
     * this is a method to show student's details
     */
    public void print() {
        System.out.println(lastName + ",student ID: " + id + ", grade: " + grade);
    }
}
