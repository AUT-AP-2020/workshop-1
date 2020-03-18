class Main {

    // Driver function
    public static void main(String[] args) {
        
        // Student Instances
        Student student1 = new Student("firstName1", "lastName1", "9831001", 17);
        Student student2 = new Student("firstName2", "lastName2", "9831002", 18);
        Student student3 = new Student("firstName3", "lastName3", "9831003", 16);
        Student student4 = new Student("firstName4", "lastNaem4", "9831004", 19);

        // student1
        student1.print();
        student1.setFirstName("changed_firstName1");
        student1.print();
        System.out.println();

        // student2
        student2.print();
        student2.setLastName("changed_lastName2");
        student2.print();
        System.out.println();

        // student3
        student3.print();
        student3.setID("changed_ID_9831003");
        student3.print();
        System.out.println();

        // student4
        student4.print();
        student4.setGrade(16.75);
        student4.print();
        System.out.println();
    }

}