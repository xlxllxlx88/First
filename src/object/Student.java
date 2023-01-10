package object;


public class Student {

	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {		//equals() 메서드재정의
		if(obj instanceof Student) {
			Student std = (Student)obj;
			// 재정의한 equals() 메서드는 학생의 학번이 같으면 true 반환
			if(studentId == std.studentId) { 
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {				// 해시 코드 값을 학번을 반환하도록 재정의
		return studentId;
	}
}
