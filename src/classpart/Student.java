package classpart;

public class Student {

	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		String printName = studentAhn.studentName;
				
		
		System.out.println(printName);
		System.out.println(studentAhn.getStudentName());
	}
}
