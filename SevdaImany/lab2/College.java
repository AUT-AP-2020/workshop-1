import java.util.ArrayList;

public class College{
    ArrayList<Lab> labs;
    private String name;

    public College(String name) {
        this.name = name;
        labs = new ArrayList<Lab>();
    }
    
    public void addLab(Lab lab) {
        labs.add(lab);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void print(){
        System.out.println("college name: "+ name);
        System.out.println("college's labs: ");
        for(Lab k : labs)
          k.print();
    }
}