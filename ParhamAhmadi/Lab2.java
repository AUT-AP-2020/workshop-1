 class Student 
{
    private String firstname;
    private String lastname;
    private String id;
    private int grade;
    /**
     * @param fname the firstname of student
     * @param lname the lastname of student
     * @param sID student number
     */
    public Student (String fname,String lname,String sID)
    {
        firstname=fname;
        lastname=lname;
        id=sID;
    }
    /**
     * @return the firstname
     */
    public String getFirstname() 
    {
        return firstname;
    }
    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) 
    {
        this.firstname = firstname;
    }
    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    public void print()
    {
        System.out.println(lastname+"student Id:"+id+"grade:"+grade);
    }
    
}

/**
 * ParhamAhmadi9831071
 */
class Lab 
{
    private int avg;
    private String day;
    private int capacity;
    private Student[] students;
    private int currentSize=0;
    
    /**
     * 
     * @param cap is the capacity
     * @param d is the day
     */
    public Lab(int cap,String d)
    {
        capacity=cap;
        day=d;
    }
    public void enrollStudent(Student std)
    {   
        if (currentSize==0)//we should new the students array;
        {
            students=new Student[capacity];
        }
        if (currentSize < capacity) {
        students[currentSize] = std;
        currentSize++;
        } else {
        System.out.println("Lab is full!!!");
        }
    }
    public void print()
    {
        for(int i=0 ; i<capacity ; i++)
        {
            System.out.println("name:"+students[i].getFirstname());
        }
        System.out.println("Average:"+avg);
    }
    public Student[] getStudents() 
    {
        return students;
    }
    
    // public void print() 
    // {
    //     for (int i = 0; i < students.length; i++) ///should use length insted of size();
    //     {   
    //         System.out.println("std fname: " + students[i].getFirstname()
    //         + " std id:" + students[i].getId()
    //         + " std grade:"+ students[i].getGrade());
    //     }
    //     System.out.println("Lab AVG:" + avg);
    //    }

    public void setStudents(Student[] students) 
    {
        this.students=students;
    }
    
    public int getAvg() 
    {
        return avg;
    }
    public void calculateAvg() 
    {
        int sum=0;
        for(int i=0; i<capacity ; i++)
        {
            sum+=students[i].getGrade();
        }
        avg=sum/capacity;
    }
    public String getDay() 
    {
        return day;
    }
    public void setDay(String day) 
    {
        this.day=day;
    }
    public int getCapacity() 
    {  
        return capacity;
    }
    public void setCapacity(int capacity) 
    {
        this.capacity=capacity;
    }
}
/**
 * Run
 * 
 */
 class Run
{
    public static void main(String[] args) 
    {
        //for the first part ;
        Student std1=new Student("Parham","Ahmadi","9831071");
        Student std2=new Student("Ahmad","Ahmadi","9831081");
        Student std3=new Student("Hossein","Hosseini","9826081");
        std1.print();
        std1.setGrade(15);
        std1.print();
    
        std2.print();
        std2.setGrade(11);
        std2.print();
    
        std3.print();
        std3.setGrade(18);
        std3.setFirstname("HamidReza");
        std3.print();
        ///////////
        //for the second part
        Student[] mysStudents=new Student[3];
        Lab myLab=new Lab(3,"Friday");
        myLab.enrollStudent(std1);
        myLab.enrollStudent(std2);
        myLab.enrollStudent(std3);
        myLab.calculateAvg();
        myLab.print();
    }
  
}