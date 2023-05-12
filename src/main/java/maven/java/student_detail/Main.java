package maven.java.student_detail;

public class Main {

	public static void main( String[] args )
    {
		
		//Creating Student Objects
		Student student1 = new Student();
		student1.setRollNumber(1);
		student1.setfirstName("JOHN");
		student1.setlastName("DOE");
		student1.setdateOfBirth("1999-01-01");
		
		
		Student student2 = new Student();
        student2.setRollNumber(2);
        student2.setfirstName("Palak");
        student2.setlastName("Patel");
        student2.setdateOfBirth("1993-09-17");

        // Print student details
        System.out.println("Student 1 Details:");
        student1.printStudentDetails();

        System.out.println("\nStudent 2 Details:");
        student2.printStudentDetails();
    
    
    }
	
}
