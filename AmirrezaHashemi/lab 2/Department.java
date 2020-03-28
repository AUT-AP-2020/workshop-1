import java.util.ArrayList;

/**
 * The Department class represents a department.
 *
 * @author Amirreza Hashemi
 * @version 1.0
 */
public class Department {
    // Department's labs
    private ArrayList<Lab> labs;
    // The Department's name
    private String name;

    /**
     * Create a new Department with a given name.
     *
     * @param name the name of department
     */
    public Department(String name) {
        this.name = name;
        labs = new ArrayList<Lab>();
    }

    /**
     * Add the lab to Department's labs
     *
     * @param lab the lab
     */
    public void addLab(Lab lab) {
        labs.add(lab);
    }

    /**
     * Print Name of Department and Department's labs information
     */
    public void print() {
        System.out.println("Department's name : " + name);
        System.out.println("Department's labs : ");
        for (Lab lab : labs) {
            lab.print();
        }
    }

    /**
     * Gets labs of department.
     *
     * @return the labs of department
     */
    public ArrayList<Lab> getLabs() {
        return labs;
    }

    /**
     * Sets labs of department.
     *
     * @param labs the labs
     */
    public void setLabs(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    /**
     * Gets name of department.
     *
     * @return the name of department.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of department.
     *
     * @param name the name of department
     */
    public void setName(String name) {
        this.name = name;
    }
}

