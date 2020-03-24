package ir.ac.aut;

import java.util.ArrayList;

public class University {
    private ArrayList<Lab> labs;
    //since the number of labs could change -> dynamic memory -> ArrayList

    public University()
    {
        labs= new ArrayList<>();
    }

    public void addLab(Lab newLab){
        labs.add(newLab);
        return;
    }

    public boolean removeLab(Lab beRemoved){
        for(int i=0; i<getNumLabs(); i++){
            if(labs.get(i).equals(beRemoved)){
                labs.remove(i);
                return true;
            }
        }
        return false;
    }

    public Lab getLab(int index){
        return labs.get(index);
    }

    public int getNumLabs(){
        return labs.size();
    }

    public void printInfoLabs(){
        if(getNumLabs()!=0) {
            System.out.println("this Faculty has " + getNumLabs() + " labs");
            for (int i = 0; i < getNumLabs(); i++) {
                System.out.println((i + 1) + ") ");
                labs.get(i).print();
                System.out.println();
            }
            return;
        }
        System.out.println("no Labs in this Faculty");
    }
}
