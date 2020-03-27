public class testRun {
    public static void main(String[] args) {

        Lab CE1 = new Lab(2,"Saturday");
        Lab CE2 = new Lab(5,"Sunday");
        Lab CE3 = new Lab(4,"Monday");
        Student std1 = new Student("Saeed","Shafie", "9831036");
        Student std2 = new Student("Ali","Alizadeh","9831037");
        Student std3 = new Student("Reza","Rezapour","9831038");
        Student std4 = new Student("Mamad","Mamadpour","9831039");
        Student std5 = new Student("Hooman","Hoomani","9831040");


        CE1.enrollStudent(std1);
        CE1.enrollStudent(std2);
        CE1.enrollStudent(std3);
        CE1.calculateAvg();
        CE1.print();
    }
 }
