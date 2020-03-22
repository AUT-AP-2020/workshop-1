public class Daneshkadeh {
    private Lab[] labs;
    private int size;

    public Daneshkadeh(int size)
    {
        this.size = size;
        labs = new Lab[size];
    }

    public void print()
    {
        for (int i = 0; i < size; i++)
            System.out.println("Class day: " + labs[i].getDay() + "Class capacity: " + labs[i].getCapacity());
    }

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}

    public void setLab (Lab[] labs) {this.labs = labs;}

    public Lab[] getLab() {return labs;}
}
