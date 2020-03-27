/**
 * This Student Class Represent a Student in a Student Managing System
 *
 * @author EhsanFakhraie
 * @version 0.0
 */
public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int grade;

    /**
     * @param firstName first name of student
     * @param lastName  last name of student
     * @param id        id of student
     */
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName firstName of student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName familyName of student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    /**
     * @param id id of student
     */
    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * @param grade grade of student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return student info as a string
     */
    @Override
    public String toString() {
        return lastName+", student Id:"+id+", grade:"+grade;   //To change body of overridden methods use File | Settings | File Templates.
    }
}

