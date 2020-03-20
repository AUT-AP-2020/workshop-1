/**
 * College class define a college
 * @author Ali Ansari
 * @version 1.0.0
 */
public class College {
    private String name;
    private Lab[] labs;
    private int capacity;
    private int currentLabs;

    /**
     * Constructor for College
     * @param name Name of College
     * @param capacity Capacity of College
     */
    public College(String name, int capacity) {
        currentLabs=0;
        this.name = name;
        this.capacity = capacity;
        labs=new Lab[capacity];
    }

    /**
     * Add a lab to College
     * @param lab The lab
     */
    public void addLab(Lab lab){
        if (currentLabs < capacity) {
            labs[currentLabs] = lab;
            currentLabs++;
        }
        else
            System.out.println("College is full!!!");
    }

    /**
     * Print College labs
     */
    public void print(){
        System.out.println("College Name:"+this.name);
        for (int i=0;i<currentLabs;i++){
          labs[i].print();
        }
    }

}
