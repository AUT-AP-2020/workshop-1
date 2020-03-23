package APLAB;

import java.util.ArrayList;

public class Faculty {
    ArrayList<Lab> labs;

    /**
     * constructor which is only initializing the ArrayList
     */
    public Faculty() {
        labs = new ArrayList<>();
    }

    /**
     *
     * @return the labs ArrayList
     */
    public ArrayList<Lab> getLabs() {
        return labs;
    }

    /**
     *
     * @param labs will be changed
     */
    public void setLabs(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    /**
     *
     * @param lab is added to the labs
     */
    public void addLab(Lab lab) {
        labs.add(lab);
    }

    /**
     *
     * @param idx is index of the lab to be removed
     */
    public void removeLab(int idx) {
        labs.remove(idx);
    }

    /**
     * prints the labs
     */
    public void print() {
        System.out.println("Number of labs is " + labs.size());
        for (Lab tmp : labs)
            tmp.print();
    }

    /**
     *
     * @param idx is the index of the lab
     * @param std is added to the lab number idx
     */
    public void addStudent(int idx, Student std) {
        labs.get(idx).enrollStudent(std);
    }

}
