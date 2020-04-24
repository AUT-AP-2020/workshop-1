

/**
 * Lab class
 *
 */
public class Lab {

	private Student[] students;
	private int avg;
	private String day;
	private int capacity;
	private int currentSize;
	
	/**
	 * Create a new Lab
	 * @param cap Capacity
	 * @param d Day
	 */
	public Lab(int cap, String d) {
		capacity = cap;
		students = new Student[capacity];
		day = d;
		currentSize = 0;
		avg = 0;
	}
	/**
	 * Enrolls the given student at Lab's students list.
	 * @param std Student to enroll
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
	 * Prints the list of students and their average grade at the end.
	 */
	public void print() {
		System.out.println(day+" "+currentSize+"/"+capacity);
		for(int i=0;i<currentSize;i++)
			students[i].print();
		System.out.println("Average of Lab's Students is: "+ avg);
	}
	
	/** 
	 * @return The list of Lab's students
	 */
	public Student[] getStudents() {
		return students;
	}
	
	/**
	 * Copies the given list on the Lab's current students list. 
	 * @param students the list to copy
	 */
	public void setStudents(Student[] students) {
		this.students = students;
		this.currentSize = students.length;
	}
	
	/**
	 * 
	 * @return The Lab's precalculated students average. 
	 */
	public int getAvg() {
		return this.avg;
	}

	/**
	 * Calculates and update the Lab's average.
	 */
	public void calculateAvg() {
		int sum = 0;
		for(int i=0;i<currentSize;i++)
			sum += students[i].getGrade();
		avg = (int) Math.round(1.0*sum/currentSize);
	}
	/**
	 * 
	 * @return The day of Lab
	 */
	public String getDay() {
		return day;
	}
	/**
	 * Sets the day of Lab
	 * @param day Day to set
	 */
	public void setDay(String day) {
		this.day = day;
	}
	
	/**
	 * 
	 * @return Capacity field
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 *	Sets the Capacity of the Lab 
	 * @param capacity integer number to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Checks if this object's content is equal to the given object
	 */
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Lab)) return false;
		Lab lab = (Lab)obj;
		return this.day.equals(lab.day) && this.capacity == lab.capacity;
	}
}








