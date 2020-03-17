package com.amirparsa.salmankhah;

/**
 * Represents a student
 *
 * @author Amirparsa Salmankhah
 * @version 1.0
 */
public class Student {
    //The student's first name
    private String firstName;
    //The student's last name
    private String lastName;
    //The student's ID
    private String id;
    //The student's grade
    private int grade;

    /**
     * Main constructor with 4 parameters
     *
     * @param firstName   The student's first name
     * @param lastName student's last name
     * @param id          The student's ID
     * @param grade       The student's grade
     */
    public Student(String firstName, String lastName, String id, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    /**
     * Additional constructor with 3 parameters
     *
     * @param firstName   The student's first name
     * @param lastName student's last name
     * @param id          The student's ID
     */
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setId(id);
    }

    /**
     * first name getter
     *
     * @return a String : The student's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name setter
     *
     * @param firstName The student's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name getter
     *
     * @return a String : The student's Last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * last name setter
     *
     * @param lastName The student's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * ID getter
     *
     * @return a String : The student's ID
     */
    public String getId() {
        return id;
    }

    /**
     * ID setter
     *
     * @param id The student's ID
     */
    public void setId(String id) {
        if(id.length()==7)
            this.id = id;
        else
            System.out.println("invalid ID");
    }

    /**
     * Grade getter
     *
     * @return an integer : The student's grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * grade setter
     *
     * @param grade The student's grade
     */
    public void setGrade(int grade) {
        if(grade>=0 || grade<=20)
            this.grade = grade;
        else
            System.out.println("Invalid grade");
    }

    public void print(){
        System.out.println(lastName + ", Student ID: " + id + ", Student grade: " + grade);
    }
}
