package ws1;


public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Lab lab = new Lab(4 , "15");
        std1.setGrade(15);
        std2.setGrade(11);
        std3.setGrade(20);
        Student std4 = new Student("Mohammad", "Rahimian", "9831027");
        Student std5 = new Student("Hasan", "Tavakoli", "9831000");
        std4.setGrade(16);
        std5.setGrade(12);
        //capacity is 4 so std5 won't be enrolled
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);
        lab.enrollStudent(std4);
        lab.enrollStudent(std5);

        lab.print();




    }
}
