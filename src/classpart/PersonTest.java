package classpart;

public class PersonTest {

	public static void main(String[] args) {

		Person personTest = new Person();
		personTest.name = "고로케";
		personTest.height = 50F;
		personTest.weight = 4.9;
		
		System.out.println("이름 :" + personTest.name);
		System.out.println("키 :" + personTest.height);
		System.out.println("몸무게 :" + personTest.weight);
		
		Person personTest2 = new Person("고로니", 41, 5.1);
		System.out.println("이름 :" + personTest2.name);
		System.out.println("키 :" + personTest2.height);
		System.out.println("몸무게 :" + personTest2.weight);
		
		/*
		 * 객체 : 어떤 대상
		 * 클래스 : 객체를 프로그래밍하기 위한 코드
		 * 인스턴스 : 클래스가 메모리에 생성된 상태
		 * 멤버변수 : 클래스의 속성
		 * 메서드 : 멤버변수를 이용하여 클래스의 기능 구현
		 * 참조변수: 메모리에 생성된 인스턴스의 변수명
		 * 참조값 : 인스턴스 메모리 주소
		 * 
		 * */
		

	}

}
