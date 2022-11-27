package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
	
		Student1 student1 = new Student1();
		student1.setStudentName("고로케");
		System.out.println(student1.serialNum);
		System.out.println(student1.studentName + " 학번 : " + student1.studentID);
		//student1.serialNum++;
		
		Student1 student2 = new Student1();
		student2.setStudentName("고로니");
		System.out.println(student2.serialNum);
		System.out.println(student2.studentName + " 학번 : " + student2.studentID);
	}
}
