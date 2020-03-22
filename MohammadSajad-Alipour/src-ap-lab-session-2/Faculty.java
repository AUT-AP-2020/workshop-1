import java.util.ArrayList;
import java.util.Iterator;

/**
 * this is a class to manage labs in a faculty
 */
public class Faculty {
    private String name;
    private ArrayList<Lab> labs;

    public Faculty(String name){
        this.name=name;
        labs=new ArrayList<Lab>();
    }

    /**
     * this is a method to add a lab into faculty
     * @param labToAdd
     */
    public void addLab(Lab labToAdd){
        labs.add(labToAdd);
    }

    /**
     * this is a method to remove a lab in a faculty
     * @param labToRemove
     */
    public void removeLab(Lab labToRemove){
        Iterator<Lab> it=labs.iterator();
        while(it.hasNext()){
            Lab lab=it.next();
            if(lab.equals(labToRemove)){
                it.remove();
                return;
            }
        }
        System.out.println("Didn't found this lab to remove");
    }

    /**
     * this is a method to show labs in a faculty
     */
    public void print(){
        int i=1;
        for(Lab lab:labs){
            System.out.println("Lab "+i);
            lab.print();
            i++;
        }
    }
    public ArrayList<Lab> getLabs() {
        return labs;
    }
}
