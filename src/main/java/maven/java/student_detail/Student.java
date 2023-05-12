package maven.java.student_detail;

public class Student {

	private int rollNumber;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	//Getter and Setter
	
	public int getRollNumber(){
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getdateOfBirth() {
		return dateOfBirth;
	}
	
	public void setdateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	// Method to print student details
    public void printStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
	
}
