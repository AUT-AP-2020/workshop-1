/** The Lab class represents a lab parameters such as capacity and current size of 
 * lab class and some information of students such as average grade of them
 * 
 * @author Mohammad Hasannejadi
 * @version 1.0
 */

 public class Lab { 
    private Student[] students; 
    private int avg; 
    private String day; 
    private int capacity; 
    private int currentSize; 
    /**
     * first assign for capacity and day
     * @param cap capacity
     * @param d day
     */
    public Lab(int cap, String d) {
        students = new Student[100];
        capacity = cap;
        day = d;
    } 
    /**
     * arrive a student to array of students from class Run
     * @param std input student
     */
    public void enrollStudent(Student std) { 
        if (currentSize < capacity) {
            students[currentSize] = std; 
            //System.out.println(currentSize);
            currentSize++; 
        } 
        else { 
            System.out.println("Lab is full!!!"); 
        } 
    }
    
    /**
     * print all information of lab such as students and average of lab
     */
    public void print() {
        int i;
        for(i=0;i<currentSize;i++){
            System.out.println(students[i].getFirstName() +" "+ students[i].getlastName()  + ", student ID: " + students[i].getID() + ", grade: " + students[i].getGrade());
        }
        calculateAvg();
        System.out.println("average: "+avg);
    }
    /**
     * getter array of students
     * @return array of students
     */ 
    public Student[] getStudents() {
        return students;
    } 
    /**
     * setter of students
     * @param students array students
     */
    public void setStudents(Student[] students) {
        int i;
        for(i=0;i<capacity;i++){
            this.students[i] = students[i];
        }
    } 
    /**
     * getter of average
     * @return average of class
     */
    public int getAvg() {
        return avg;
    } 
    /**
     * calculate average from all grades
     */
    public void calculateAvg() {
        int i,grades = 0 ;
        for(i=0;i<currentSize;i++){
            grades += students[i].getGrade(); 
        }
        avg = grades/currentSize;
       
    } 
    /**
     * getter of day
     * @return day
     */
    public String getDay() {
        return day;
    } 
    /**
     * setter of day 
     * @param day day field
     */
    public void setDay(String day) {
        this.day = day;
    } 
    /**
     * getter of capacity
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    } 
    /**
     * setter of capacity
     * @param capacity capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }   
}