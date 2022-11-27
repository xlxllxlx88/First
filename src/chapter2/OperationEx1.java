package chapter2;

public class OperationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 90;
		int engScore = 70;
		
		// 총점
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		//평균
		double avgScore = totalScore /2.0;
		System.out.println(avgScore);
		
		
		
		int gameScore = 150;
		int lastScore1 = ++gameScore;
		int lastScore2 = --gameScore;
		System.out.println(lastScore1);
		System.out.println(lastScore2);
		
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		int num = 10;
		boolean isEven;
		isEven = (num%2) == 0 ? true : false;
		System.out.println(isEven);
		
		
		
		System.out.println("연습문제 ----------------------------------------");
		
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch1;
		ch1 = (myAge > teacherAge) ? 't' : 'f';
		System.out.println(ch1);
		
		int aa;
		aa = -5 + 3 * 10 /2;
		System.out.println(aa);
	}

}
