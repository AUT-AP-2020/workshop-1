import java.util.ArrayList;

/**
 * college is somewhere to manage the Labs.
 * hold some info about labs .
 * @author farzad
 * @version 0.0
 */
public class College {
    // name of College
    private String name;
    // all labs of college
    private ArrayList<Lab> labs;


    /**
     * constructor of college
     * @param name the name of this college
     */
    public College(String name)
    {
        this.name = name;
        labs = new ArrayList<>();
    }

    /**
     * add a lab to this college
     * @param capacity capacity of this Lab
     * @param name the name of Lab
     * @param day the days when the lab is held on.
     */
    public void addLab (int capacity,String name, String day)
    {
        labs.add( new Lab(capacity,day,name) );
    }


    /**
     * prints all labs with their students by format of " labsName: list of students "
     */
    public void printLabsStudents()
    {
        int countLab = 1;

        for(Lab lab : labs)
        {
            System.out.println("#" + countLab + "#- " + lab.getName() + " :");
            lab.print();
            countLab ++;
        }
    }

    /**
     * creat and add a student to Lab.
     * @param indexOfLab index of lab where the student is going to join.
     * @param fName first name of student
     * @param lName last name of student
     * @param ID id number of student
     * @param grade grade of this student
     */
    public void addStudent(int indexOfLab,String fName,String lName, String ID, int grade)
    {
        if(indexOfLab >= 0 && indexOfLab<labs.size()) {
            Student student = new Student(fName, lName, ID);
            labs.get(indexOfLab).enrollStudent(student);
            student.setGrade(grade);
        }

    }

    /**
     * get specific lab of this college
     * @param index index of lab.
     * @return Lab: the wanted lab.
     */
    public Lab getLab(int index) {
        return labs.get(index);
    }

}
