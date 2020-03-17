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
     * @param lastNameThe student's last name
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
     * @param lastNameThe student's last name
     * @param id          The student's ID
     */
    public Student(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
}
