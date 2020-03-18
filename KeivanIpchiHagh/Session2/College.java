/**
 * <h1>College Class</h1>
 * This class contains information about Labs as well as their current state
 * @author Keivan Ipchi Hagh
 * @version 1.0.0
 */
class College {

    /**
     * Indicates an array to store all Labs existing in the College
     */
    private Lab labs[];

    /**
     * Indicates the college name
     */
    private String collegeName;

    /**
     * Indicates the supervisor of the Labs
     */
    private String supervisor;

    /**
     * Indicates College maximum capacity
     */
    private int capacity;

    /**
     * Indicates Lab current student count
     */
    private int currentSize;

    /**
     * College Constructor
     * @param supervisor Supervisor
     */
    public College(String collegeName, String supervisor, int capacity) {
        this.collegeName = collegeName;
        this.supervisor = supervisor;
        this.capacity = capacity;
        labs = new Lab[capacity];   // Initalize
    }

    /**
     * Getter: Get Labs
     * @return Labs
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * Setter: Set Labs
     * @param labs Labs
     */
    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    /**
     * Getter: Get supervisor
     * @return Supervisor
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * Setter: Set supervisor
     * @param supervisor Supervisor
     */
    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * Setter: Set Colege name
     * @param collegeName College name
     */
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    /**
     * Getter: Get college name
     * @return College name
     */
    public String getCollegeName() {
        return collegeName;
    }

    /**
     * Setter: Set capacity
     * @param capacity capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Getter: Get capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Setter: Set current size
     * @param currentSize currentSize
     */
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    /**
     * Getter: Get current size
     * @return currentSize
     */
    public int getCurrentSize() {
        return currentSize;
    }

    /**
     * Add Lab to the college
     * @param lab Lab
     */
    public void addLab(Lab lab) {
        if (currentSize < capacity)
            labs[currentSize++] = lab;
        else
            System.out.println("College is full; Cannot add Lab.");
    }

    /**
     * Print each lab
     */
    public void print() {
        for (int i = 0; i < currentSize; i++)
            labs[i].print();
        System.out.println();
    }
}