public class Run{
    public static void main(String[] args){
        Student std1 = new Student("setayesh","sanavi","9628024");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("ehsan","edalat","9031066");

//        std1.print();
        std1.setGrade(15);
//        std1.print();

//        std2.print();
        std2.setGrade(11);
//        std2.print();

//        std3.print();
        std3.setFirstName("HamidReza");
//        std3.print();
        Lab lab1 = new Lab(2,"monday");

        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);
        lab1.print();
        lab1.enrollStudent(std3);
        lab1.print();
    }
}