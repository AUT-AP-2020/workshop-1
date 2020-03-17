package com.amirparsa.salmankhah;

public class Faculty {
    //Faculty's lab
    private Lab[] labs;
    //Max number of labs
    private int capacity;
    //Current number of labs
    private int currentNumOfLabs;

    /**
     * Main constructor with a parameter
     * @param capacity Max number of labs
     */
    public Faculty(int capacity){
        currentNumOfLabs = 0;
        labs = new Lab[capacity];
        this.capacity = capacity;
    }

    /**
     * add a lab to the faculty
     * @param lab the lab which is going to be added
     */
    public void addLab(Lab lab){
        if (currentNumOfLabs < capacity) {
            labs[currentNumOfLabs] = lab;
            currentNumOfLabs++;
        } else
            System.out.println("Faculty is full!!!");
    }

    /**
     * Print details of the faculty labs
     */
    public void print(){
        for(int i=0;i<currentNumOfLabs;i++){
            System.out.println("Lab " + (i+1) + ":");
            labs[i].print();
        }
    }

    /**
     * Capacity getter
     * @return an integer - capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Current number of labs getter
     * @return an integer - current number of labs
     */
    public int getCurrentNumOfLabs() {
        return currentNumOfLabs;
    }

    /**
     * Labs getter
     * @return an array of the labs
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * Capacity stter
     * @param capacity Max number of labs
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * labs setter
     * @param labs an array of the labs
     */
    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }
}
