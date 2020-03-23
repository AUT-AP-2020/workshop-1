public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan","Edalat", "9031066");
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
        // lab class Test
        Student std4 = new Student("Mahdi", "Mir", "9723093");
        Student std5 = new Student("Ali", "Mohammadi", "9723000");
        Lab lab= new Lab(25,"AP Workshop");
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);
        lab.enrollStudent(std4);
        lab.enrollStudent(std5);
        std1.setGrade(18);
        std2.setGrade(18);
        std3.setGrade(19);
        std4.setGrade(20);
        std5.setGrade(20);
        lab.calculateAvg();
        lab.print();
        System.out.println(lab.getAvg());
        // course class Test
        Course ap=new Course("AP",3,"Saturday-Monday",60);
        ap.enrollStudent(std1);
        ap.enrollStudent(std2);
        ap.enrollStudent(std3);
        ap.enrollStudent(std4);
        ap.enrollStudent(std5);
        std1.setGrade(17);
        std2.setGrade(17);
        std3.setGrade(18);
        std4.setGrade(19);
        std5.setGrade(19);
        ap.calculateAvg();
        ap.print();
        System.out.println(ap.getAvg());
    }
}