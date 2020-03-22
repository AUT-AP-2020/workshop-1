
public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("melika", "bagheri", "9831011");
        Student std2 = new Student("negin", "kheirmand", "9831009");
        Student std3 = new Student("sevda", "imany", "9831010");
        Lab lab = new Lab(3,"monday");
        Lab lab2 = new Lab(6,"sunday");
        College ce = new College("CE");
        lab.enrollStudent(std1);
        lab2.enrollStudent(std2);
        lab2.enrollStudent(std3);
        ce.addLab(lab);
        ce.addLab(lab2);

        std1.setGrade(15);

        std2.setGrade(20);
        std2.print();

        std3.setFirstName("saina");
        std3.setGrade(13);

        lab.print();
        ce.print();
        
    }
}