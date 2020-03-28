/**  The Lab class represents a lab in a lab
 administration system.
 * It holds the Lab details relevant in our context.
 * @author Amirreza
 * @version 1.0
 */
public class Lab
{
    //vector of students of lab
    private Student[] students;
    //the Average of Student's grade
    private int avg;
    //code of lab (college + 3 digit)
    private String code;
    //day of class
    private String day;
    //capacity of laboratory
    private int capacity;
    //numbers of lab's students
    private int currentSize;

    /**
     * Create a new lab with a given capacity and day.
     * @param d  day of lab
     * @param  cap capacity of lab
     */
    public Lab(int cap , String d)
    {
        day = d;
        capacity = cap;
        avg = 0;
        currentSize = 0;
        students = new Student[capacity];
    }

    /**
     * enroll student in lab
     * @param std student add to lab
     */
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        }
        else
        {
            System.out.println("Lab is full!!!");
        }
    }
    /**
     * get the  students of lab
     *  @return students field
     */
    public Student[] getStudents()
    {
        return students;
    }
    /**
     * set the  students of lab
     */
    public void setStudents(Student[] students)
    {
        this.students = students;
    }
    /**
     *  calculate the avg of students of lab
     *  @return avg field
     */
    public void culculateAvg()
    {
        int i = 0;
        for (int j = 0;j < currentSize;j++)
        {
            i = i + students[j].getGrade();
        }
        this.avg = i / currentSize;
    }
    /**
     * get the  code of lab
     *  @return code field
     */
    public String getCode()
    {
        return code;
    }
     /**
     * get the  avg of lab
     *  @return avg field
     */
    public  int getAvg ()
    {
        return avg;
    }
    /**
     * get the  day of lab
     *  @return day field
     */
    public String getDay()
    {
        return day;
    }
    /**
     * set the  day of lab
     *  @param  day set the day of lab
     */
    public void setDay(String day)
    {
        this.day = day;
    }
    /**
     * get the  capacity of lab
     *  @return capacity field
     */
    public int getCapacity()
    {
        return capacity;
    }
    /**
     * set the  capacity of lab
     *  @param  capacity  set the  capacity of lab
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void print()
    {
        int i;
        for (i = 0; i < currentSize; i++)
        {
            System.out.println("std fname: " + students[i].getFirstName() + " std id:" + students[i].getId() + " std grade:" + students[i].getGrade());
        }
        culculateAvg();
        System.out.println("Lab AVG:" + avg);
    }
}
