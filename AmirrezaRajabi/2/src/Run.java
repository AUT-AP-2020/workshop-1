public class Run {

    public static void main(String[] args)
    {
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
        Lab lab = new Lab(3,"a");
        lab.enrollStudent(std1);
        lab.enrollStudent(std2);
        lab.enrollStudent(std3);
        lab.print();
        College c = new College("Ce");
        c.addLab(lab);
        c.print();
        c.removeLab(lab);
        c.print();
    }
}
