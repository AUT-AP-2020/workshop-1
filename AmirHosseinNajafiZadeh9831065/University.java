package com.myPack;

/**
 * This class holds the information of labs
 * and the name of the university and some methods for
 * accessing them
 */
public class University {
    //The name of the university
    private String name;
    //The maximum number of labs
    private int capacity;
    //The number of current labs
    private int currentSize;
    //The list to hold the labs
    private Lab[] labs;

    /**
     * the constructor of the class
     * @param name the name of university
     * @param capacity the maximum number of labs
     */
    public University(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        currentSize = 0;
        labs = new Lab[capacity];
    }

    /**
     * A method to add a library
     * @param lab the instance from lab class
     */
    public void enrollLab(Lab lab) {
        if (currentSize < capacity) {
            labs[currentSize] = lab;
            currentSize++;
        } else {
            System.out.println("University is full!!!");
        }
    }

    //Cause the Student list is private we need to creat methods to access the list
    //from outside the class

    /**
     * to add a student to the class
     * @param i the index of the lab
     * @param std the instance of a student class
     */
    public void enrollStudent(int i, Student std) {
        labs[i].enrollStudent(std);
    }

    /**
     * to print a single lab information
     * @param i the index of lab in array
     */
    public void print(int i){
        labs[i].print();
    }

    /**
     * to print all the labs
     */
    public void printall(){
        System.out.println(name + " : ");
        for(int i = 0; i < currentSize; i++){
            System.out.print(i + 1 + " : ");
            labs[i].print();
        }
    }
}
