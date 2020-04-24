

public class Run {
	
	 public static void main(String[] args) {
		 Student std1 = new Student("Ehsan","Edalat", "9031066");
		 Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
		 Student std3 = new Student("Ahmad", "Asadi", "9031054");
		 Student std4 = new Student("Seyed", "Gholami", "9931062");
		 Student std5 = new Student("Farhad", "Alizade", "9931063");
		 Student std6 = new Student("Vahid", "Afshar", "9931064");
		
		 //std1.print();
		 std1.setGrade(15);
		 //std1.print();
		
		 //std2.print();
		 std2.setGrade(11);
		 //std2.print();
		
		 //std3.print();
		 std3.setFirstName("HamidReza");
		 //std3.print();
		 
		 std4.setGrade(18);		 
		 std5.setGrade(12);		 
		 std6.setGrade(14);

		 College college = new College();
		 college.addLab(new Lab(8, "28-1-2022 Sunday"));
		 college.addLab(new Lab(10, "17-3-2022 Saturday"));
		 
		 college.getLab(0).enrollStudent(std1);
		 college.getLab(0).enrollStudent(std2);
		 college.getLab(0).enrollStudent(std3);
		 
		 college.getLab(1).enrollStudent(std4);
		 college.getLab(1).enrollStudent(std5);
		 college.getLab(1).enrollStudent(std6);
		 
		 college.print();
	 }
}




