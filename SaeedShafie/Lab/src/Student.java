public class Student   {
    public String firstName;
    public String lastName;
    public String id;
    public int grade;

    public Student(String fname, String lname, String sid) {
        firstName = fname;
        lastName = lname;
        id = sid;
        grade = 0;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fname) {
        firstName = fname;
    }

    public void setGrade(int inputGrade)
    {
        grade = inputGrade;
    }
}