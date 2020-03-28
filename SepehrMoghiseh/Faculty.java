/**
 * @throws class-Faculty a class to organize the labs & their students.
 * @author Sepehr Moghiseh
 * @version 1.0.0
 *
 */
public class Faculty {
    private Lab[] labs;
    private int capacity;
    private int currentNumOfLabs;

    /**
     * constructor
     *
     * @param capacity
     */
    public Faculty(int capacity) {
        currentNumOfLabs = 0;
        labs = new Lab[capacity];
        this.setCapacity(capacity);
    }

    /**
     * add a lab to the Faculty collection.
     *
     * @param lab
     */
    public void addLab(Lab lab) {
        if (currentNumOfLabs < capacity) {
            labs[currentNumOfLabs] = lab;
            currentNumOfLabs++;
        } else
            System.out.println("Faculty is full!!!");
    }

    /**
     * Print the information of the student & average of them within any lab.
     */
    public void print() {
        for (int i = 0; i < currentNumOfLabs; i++) {
            System.out.println("Lab " + (i + 1) + ":");
            labs[i].print();
        }
    }

    /**
     * @return return the capacity where it has called.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return return the currentNumOfLabs where it has called.
     */
    public int getCurrentNumOfLabs() {
        return currentNumOfLabs;
    }

    /**
     * @return return the getLabs where it has called.
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * @param capacity
     */
    public void setCapacity(int capacity) {
        if (capacity > 0)
            this.capacity = capacity;
        else
            System.out.println("Invalid capacity");
    }

    /**
     * @param labs
     */
    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }
}