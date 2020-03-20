/**
 * Test class for system
 * @author Ali Ansari
 * @version 1.0.0
 */
public class Run {
    public static void main(String[] args) {
        College ce = new College("CE",2);

        Lab fp = new Lab(4,"Sunday");
        Lab ap = new Lab(3,"Monday");
        Lab aap=new Lab(3,"Tuesday");

        Student ali = new Student("Ali","Ansari","9831136",18);
        Student parsa = new Student("Parsa","Salmankhah","9831034",20);
        Student parham = new Student("Parham","Moonesi","9831063",19);
        Student amir=new Student("Amireza","Rajabi","9831120",17);
        Student bagher=new Student("Bagher","Sharifi","9831115",18);
        Student sajjad=new Student("Sajjad","Alipoor","9831023",18);

        fp.enrollStudent(ali);
        fp.enrollStudent(parsa);
        fp.enrollStudent(amir);
        fp.enrollStudent(bagher);
        //lab is full
        fp.enrollStudent(sajjad);

        ap.enrollStudent(parham);
        ap.enrollStudent(ali);
        ap.enrollStudent(parsa);
        //lab is full
        ap.enrollStudent(sajjad);


        fp.calculateAvg();
        ap.calculateAvg();

        ce.addLab(fp);
        ce.addLab(ap);
        //college is full
        ce.addLab(aap);

        ce.print();
    }
}
