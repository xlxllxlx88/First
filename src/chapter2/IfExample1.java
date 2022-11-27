package chapter2;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 현재 7사
		// 8살 이상이면 학교 / 아니면 안가
		
		int age = 7;
		if(age >= 8) {
			System.out.println("학교 gogo");
		} else {
			System.out.println("학교 nono");
		}
		
		//gender 변수값이 f면 여성, 아니면 남성 출력
		
		char gender = 'f';
		if(gender == 'f') {
			System.out.println("여성");
		} else {
			System.out.println("남성");
		}
		
		System.out.println("입장료 계산 ***********************************");
		// 8살미만 1000 / 14살미만 2000 / 20살미만 2500 / 그이상 3000
		int age2 = 65;
		int charge;
		if(age2 < 8) {
			System.out.println("미취학");
			charge = 1000;
		} else if (age2 < 14) {
			System.out.println("초딩");
			charge = 2000;
		} else if (age2 < 20) {
			System.out.println("중고딩");
			charge = 2500;
		} else if (age2 >= 60) {
			System.out.println("경로우대");
			charge = 0;
		} else {
			System.out.println("성인");
			charge = 3000;
		}
		System.out.println("입장료는 " + charge + "입니다.");
		
		
		
		System.out.println("성적 계산 ***********************************");
		
		
		int score1= 58;
		char grade;
		
		if(score1 >= 90) {
			grade = 'A';
		} else if(score1 >= 80) {
			grade = 'B';
		} else if(score1 >= 70) {
			grade = 'C';
		}
		else if(score1 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("성적은 " + grade + "입니다.");
		
		
		
		
		
		
		
		
		
	}

}
