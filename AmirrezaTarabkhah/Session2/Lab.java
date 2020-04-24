public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(int cap, String d) {
        capacity = cap;
        students = new Student[capacity];
        day = d;
    }
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        }
        else
            System.out.println("Lab is full!!!");
    }
    public void print()
    {
        for (int i = 0; i < currentSize; i++)
        {
            System.out.println("std fname: " + students[i].getFirstName()  + " std id:" + students[i].getId()  + " std grade:"+ students[i].getGrade());
        }
        System.out.println("Lab AVG:" + avg);
    }

    public Student[] getStudents() {return students;}

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getAvg() {return avg;}

    public void calculateAvg() {
        for (int i = 0; i < currentSize; i++)
            avg += students[i].getGrade();
        avg /= currentSize;
    }

    public String getDay() {return day;}

    public void setDay(String day) {
        this.day = day;
    }

    public int getCapacity() {return capacity;}

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}