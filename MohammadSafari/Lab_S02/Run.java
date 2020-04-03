public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(11);
        std2.print();
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        Lab Test1 = new Lab(3, "Monday");
        Test1.enrollStudent(std1);
        Test1.enrollStudent(std2);
        Test1.enrollStudent(std3);
        Test1.print();
        ///////////////////////////////
        Campus TestCampus = new Campus(3);
        TestCampus.reserveLab(Test1);
        Lab Test2 = new Lab(12, "Saturday");
        Student std4 = new Student("Mohammad", "Safari", "9831138");
        std4.setGrade(20);
        Test2.enrollStudent(std4);
        Test2.enrollStudent(std1);
        TestCampus.reserveLab(Test2);
        TestCampus.print();

    }
}