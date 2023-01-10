package object;

public class StringEquals {
	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);		// false : 두 스트링 인스턴스의 주소 값은 다름
		System.out.println(str1.equals(str2));	// true : String 클래스의 equals 메소드가 재정의 됨 / 두 인스턴스의 문자열 값이 같은지 비교하여 출력
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);			// false : 두 정수 인스턴스의 주소 값은 다름 
		System.out.println(i1.equals(i2));		// true : Integer 클래스의 equals 메소드가 재정의 됨 / 두 인스턴스의 정수 값이 같은지 비교하여 출력
	}

}
