public class Student {
    private int grade;
    private String name;
    private String lastName;
    private String id;
    public Student(String fName, String lname, String sID) {

        name = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }
    public String getFirstName() {
        return name;
    }
    public String getlasttName() {
        return lastName;
    }
    public String getid() {
        return id;
    }
    public int getGrade() {
        return grade;
    }
    public void setFirstName(String fName) {
        name = fName;
    }
    public void setLastNameName(String Name) {
       lastName = Name;
    }
    public void setIdName(String Id) {
        id = Id;
    }
    public void setGrade(int gr) {
        grade = gr;
    }
    public void print() {
        System.out.println(lastName + ", student ID: "

+ id + ", grade: " + grade);}
}
