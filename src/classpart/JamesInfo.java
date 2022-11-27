package classpart;

public class JamesInfo {

	int age;
	String name;
	boolean married;
	int children;
	
	
	public static void main(String[] args) {
		JamesInfo person = new JamesInfo();
		person.age = 40;
		person.name = "James";
		person.married = true;
		person.children = 3;
		
		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name);
		System.out.println("결혼 여부 :" + person.married);
		System.out.println("자녀 수 :" + person.children);
	}

}
