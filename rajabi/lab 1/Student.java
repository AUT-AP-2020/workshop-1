package com.company;

/**
  * The Student class represents a student in a student administration system.
  * It holds the student details relevant in our context.
  * @author Mohammad Javad (Rajabi2001)
  * @version 1.0
  * @since 27/03/2020
  */

public class Student {

    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    //the grade
    private int grade;

    /**
     * Create a new student with a given name and ID number.
     * @param fName first name of student
     * @param lname last name of student
     * @param sID student ID
     */

    public Student (String fName, String lname, String sID){
        firstName = fName;
        lastName = lname;
        id=sID;
        grade=0;
    }

    /**
     get student firstName
     @return firstName field
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * get student lastName
     * @return lastName field
     */

    public String getLastName() { return lastName; }

    /**
     * get student id
     * @return the student id
     */

    public String getId() { return id; }

     /**
      * @param z set the student grade */

    public void setGrade(int z){grade=z; }

    /**
     * get student grade
     * @return grade field
     */

    public double getGrade() {return grade ;}

}