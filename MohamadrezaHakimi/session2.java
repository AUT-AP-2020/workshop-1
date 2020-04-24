/**
 * it holds student's data
 * @author mohamderezahakimi
 * @version 0.0
 */
class Student  {
    //student first name :
    private String firstName;
    //student's last name
    private String lastName;
    //id number:
    private String id;
    //student's grade:
    private int grade;
    //here is the constructor( we declare the primitive values)
    public Student(String fName, String lname, String sID){
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }
//if we want get student's grade or firstname or lastname or...  we must use this method because these are  private variables
    public int getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }
//here if we wan set values for fields we have to use these methods because they are private variables:
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
//printing students details:
    public void print(){
        System.out.println(lastName + ", student ID: " + id+",grade: "+grade);

    }
}
/**
 * this class , laboratory, is the class like laboratory in the university ,we have students and their detail and capacity for laboratory then we can add students and implements some function on their data
 * @author mohamadrezahakimi
 * @version 0.0
 */
class lab
{
//list of the students:
    private Student[] students;
//avg is the variables which holds average of the student's numbers:
    private int avg;
//it holds  the day which student is joined
    private String day;
//it holds the capacity of the laboratory
    private int capacity;
//it holds the number of students
    private int currentSize;
//sum is the sum of the grades
    private int sum;

    public lab(int cap,String d){
        capacity=cap;
        students=new Student[cap];
        day=d;
        avg=0;
        currentSize=-1;
        sum=0;

    }
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            currentSize++;
            students[currentSize] = std;
        } else {
            System.out.println("Lab is full!!!"); }
    }
    public void print() {
            for (int k=0;k<=currentSize;k++) {
                System.out.println(students[k].getLastName() + ", student ID: " + students[k].getId()+",grade: "+students[k].getGrade()+", average: "+avg);
        }
    }
    public Student[] getStudents() {
            return students;
    }
    public void setStudents(Student[] students) {
        this.students=students;
    }
    public int getAvg() {
        return avg;
    }
    public void calculateAvg() {
        for (int k=0;k<=currentSize;k++) {
            sum = sum + students[k].getGrade();
        }
        avg=(int)((sum)/(students.length));
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day=day;
    }
    public int getCapacity() {
        return capacity;

    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }
}
public class session2 {

    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.setGrade(20);
        std3.print();

        System.out.println("\n"+"\n");

        lab lab1=new lab(10,"doshanbe");
        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);
        lab1.enrollStudent(std3);
        lab1.calculateAvg();
        lab1.print();

    }
}








