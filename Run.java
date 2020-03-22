public class Run {

    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("ALi", "Akbarpoor", "9931002");
        Student std5 = new Student("Reza", "Ahmadi", "9931004");
        Lab lab1 = new Lab(6, "Monday");
        Lab lab2 = new Lab(10, "Friday");
        Department ce = new Department("CE");
        std4.setGrade(5);
        std5.setGrade(19);
        std1.setGrade(15);
        std1.print();
        std2.setGrade(11);
        std2.print();
        std3.setFirstName("HamidReza");
        std3.setGrade(20);
        std3.print();
        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);
        lab1.enrollStudent(std3);
        lab1.calculateAvg();
        lab1.print();
        lab2.enrollStudent(std4);
        lab2.enrollStudent(std5);
        lab2.calculateAvg();
        ce.addLab(lab1);
        ce.addLab(lab2);
        ce.print();


    }
}
