public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("mahdi", "nemati", "9031062");

        std1.print();
        std1.setGrade(20);
        std1.print();

        std2.print();
        std2.setGrade(15);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        Lab lab = new Lab(5, "Saturday");
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std4);
        lab.print();

        Faculty testCode = new Faculty();
        Lab lab2 = new Lab(7, "Friday");
        lab2.enrollStudent(std1);
        lab2.enrollStudent(std3);
        testCode.addLab(lab);
        testCode.addLab(lab2);
        testCode.print();
        testCode.addStudent(0, std3);
        testCode.addStudent(1, std4);
        testCode.print();
    }
}