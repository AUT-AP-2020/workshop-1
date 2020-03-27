/**
 * This class represent a lab class with student and etc
 */
public class Lab {

    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     * Constructor of Lab Instanse
     *
     * @param capacity max capacity of a lab
     * @param day      day of lab
     */
    public Lab(int capacity, String day) {
        this.capacity = capacity;
        this.day = day;
        students=new Student[capacity];
    }

    /**
     *
     * @param student student which is enrolling in lab
     */
    public void enrollStudent(Student student) throws Exception {
        if(currentSize < capacity){
            students[currentSize]=student;
            currentSize++;
        }else {
            throw new Exception("Lab is full");
        }
    }


    @Override
    public String toString() {
        calculateAvg();
        String result="";
        for(Student student :students)  {
            result+="std fname: "+student.getFirstName()+" "+student.getLastName()+
                    " std id:"+student.getId()+
                    "std grade:"+student.getGrade()+'\n';
        }
        result+="Lab AVG:"+avg+'\n';
        return result;   //To change body of overridden methods use File | Settings | File Templates.
    }

    /**
     * @return students array
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @return average grade of students
     */
    public int getAvg() {
        calculateAvg();
        return avg;
    }

    /**
     * calculate average of class
     */
    public void calculateAvg(){
        int sum=0;
        for(Student student :students)
            sum+=student.getGrade();
        avg=sum/currentSize;
    }

    /**
     * @return day of lab
     */
    public String getDay() {
        return day;
    }

    /**
     * @return capacity of class
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * @param day day of lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @param students array of students attending
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     *
     * @param capacity capacity of class
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
