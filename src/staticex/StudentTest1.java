package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.setStudentName("고로케");
		System.out.println(student1.serialNum);
		student1.serialNum++;
		
		Student student2 = new Student();
		student2.setStudentName("고로니");
		System.out.println(student2.serialNum);
		
		System.out.println("■■■■■■■■");
		System.out.println(student1.serialNum);


	}

}
