class Run {

    // Driver function
    public static void main(String[] args) {

        // College Instance
        College college = new College("CE", "supervisor", 5);

        // Lab Instances
        Lab lab1 = new Lab(15, "Monday");
        Lab lab2 = new Lab(12, "Saturday");
        Lab lab3 = new Lab(20, "Wednesday");
        
        // Student Instances
        Student student1 = new Student("firstName1", "lastName1", "9831001", 17);
        Student student2 = new Student("firstName2", "lastName2", "9831002", 18);
        Student student3 = new Student("firstName3", "lastName3", "9831003", 16.98);
        Student student4 = new Student("firstName4", "lastNaem4", "9831004", 19);
        Student student5 = new Student("firstName5", "lastNaem5", "9831005", 19.25);
        Student student6 = new Student("firstName6", "lastNaem6", "9831006", 18.5);
        Student student7 = new Student("firstName7", "lastNaem7", "9831007", 20);
        Student student8 = new Student("firstName8", "lastNaem8", "9831008", 15.1);

        // Enroll Students into the labs
        lab1.enrollStudent(student1);
        lab1.enrollStudent(student2);
        lab1.enrollStudent(student3);
        lab2.enrollStudent(student4);
        lab2.enrollStudent(student5);
        lab2.enrollStudent(student6);
        lab3.enrollStudent(student7);
        lab3.enrollStudent(student8);

        lab1.calculateAvg();
        lab2.calculateAvg();
        lab3.calculateAvg();

        college.addLab(lab1);
        college.addLab(lab2);
        college.addLab(lab3);

        // Add Labs to the College
        college.setLabs(new Lab[] {lab1, lab2, lab3});

        // Print Lab's student details as well as the average grade for each lab
        college.print();
    }
}