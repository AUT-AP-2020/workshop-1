import java.util.ArrayList;

public class Faculty {
    ArrayList<Lab> listlabs;

    /**
     * constructor which is only initializing the ArrayList
     */
    public Faculty() {
        listlabs = new ArrayList<>();
    }

    /**
     *
     * @param index is the index of the lab
     * @param std is added to the lab number index
     */
    public void addStudent(int index, Student std) {
        listlabs.get(index).enrollStudent(std);
    }

    /**
     *
     * @param labs will be changed
     */
    public void setLabs(ArrayList<Lab> labs) {
        listlabs = labs;
    }

    /**
     *
     * @return the labs ArrayList
     */
    public ArrayList<Lab> getLabs() {
        return listlabs;
    }

    /**
     *
     * @param lab is added to the labs
     */
    public void addLab(Lab lab) {
        listlabs.add(lab);
    }

    /**
     *
     * @param index is index of the lab to be removed
     */
    public void removeLab(int index) {
        listlabs.remove(index);
    }

    /**
     * prints the labs
     */
    public void print() {
        System.out.println("Number of labs is " + listlabs.size());
        for (Lab tmp : listlabs)
            tmp.print();
    }

}