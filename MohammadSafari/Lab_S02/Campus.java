public class Campus {
    private Lab[] labs;
    private int totalLabs;
    private int reservedLabs;

    /**
     * Create a campus with some labs
     * @param totalLabs
     */
    public Campus(int totalLabs) {
        this.totalLabs = totalLabs;
        reservedLabs = 0;
        labs = new Lab[totalLabs];
    }

    /**
     * reserve lab from Campus
     * @param lab
     */
    public void reserveLab(Lab lab) {
        if (reservedLabs < totalLabs) {
            labs[reservedLabs] = lab;
            reservedLabs++;
        } else {
            System.out.println("Labs are completely Reserved!!");
        }
    }

    /**
     * print all labs info
     */
    public void print() {
        for (int i = 0; i < reservedLabs; i++)
            labs[i].print();
    }

    /**
     * Direct contanct with each lab
     * @return the labs 
     */
    public Lab[] getLabs() {
        return labs;
    }
    
}