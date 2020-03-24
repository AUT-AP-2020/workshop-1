public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;
    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        avg=0;
        currentSize=0;
    }
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!"); }
    }
    public void print() {
        System.out.printf("avg:%d day:%s capacity:%d current size:%d",avg,day,capacity,currentSize);
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students=students;
    }
    public void calculateAvg() {}
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
