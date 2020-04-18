package ir.ac.aut;

public class Lab {
    //array of students
    private Student[] students;
    //avg of the grades of the students in this lab
    private int avg;
    //string day
    private String day;
    //capacity of this lab
    private int capacity;
    //unt currentSize
    private int currentSize;
    //constructor
    public Lab(int cap, String d) {
        capacity=cap;
        day=d;
        students=new Student[capacity];
    }

    /**
     *method for enrollin the students
     * @param std
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * method for printing info about the studnets in the class and
     * the avg of the lab
     */
    public void print() {
        calculateAvg();
        System.out.printf("The avg of the class is %d\n", avg);
        for(int i=0; i<currentSize; i++){
            students[i].print();
        }

    }

    /**
     * method of kind getter
     * @return students
     */
    public Student[] getStudents() {
        return  students;
    }

    /**
     * method of kind setter
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students=students;
        currentSize=students.length;
    }

    /**
     * getter method
     * @return avg of the class
     */
    public int getAvg() {
        return  avg;
    }

    /**
     * method for calculating (updating the avg)
     */
    public void calculateAvg() {
        int sum=0;
        for(int i=0; i<currentSize; i++){
            sum+=students[i].getGrade();
        }
        sum/=currentSize;
        avg=sum;
        return;
    }

    /**
     * getter method
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * setter method
     * @param day
     */
    public void setDay(String day) {
        this.day=day;
        return;
    }

    /**
     * getterv method for the capacity field
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *setter method for the capacity field(we have to check if the value passed
     * its ok)
     * @param capacity
     * */
    public void setCapacity(int capacity) {
        if(this.capacity<capacity){
            System.out.printf("cannot change the capacity since some data may be lost\n");
            return;
        } else if(this.capacity==capacity){
            return;
        } else{
            this.capacity=capacity;
            Student newStudents [];
            newStudents= new Student[capacity];
            for(int i=0; i<currentSize; i++){
                newStudents[i]=students[i];
            }
            students=newStudents;
            return;
        }
    }
}