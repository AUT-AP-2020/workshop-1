public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    public int currentSize;
    public Lab(int cap , String d){
        students = new Student[cap];
        currentSize = 0;
        capacity = cap;
        day = d;
    }

    public void enrollStudent(Student std){
        if(currentSize < capacity){
            students[currentSize] = std;
            currentSize++;
        }
        else{
            System.out.println("Lab is full!!!");
        }
    }
    public void print(){
        for(int i = 0;i < currentSize;i++){
            System.out.println(students[i].firstName+""+ students[i].lastName+" grade : "+students[i].grade);
        }
        System.out.print(avg);

    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    // a method that returns the class average
    public int getAvg() {
        return avg;
    }
    // a method that calculates the average of the class using the students grades
    public void calculateAvg() {
        int sum = 0;
        for(int i = 0;i<currentSize;i++){
            sum += students[i].grade;
        }
        avg = sum/students.length;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String newDay) {
        day = newDay;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int newCapacity){
        capacity = newCapacity;
    }
}

