package chapter2;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		 int dan = 2;
		 int times;
		 
		 for(dan = 3 ; dan <= 7; dan++) {
			 System.out.println(dan + "단");
			 for(times = 1; times <=9; times++) {
				 System.out.println(dan + "X" + times + "=" + dan*times);
			 }
		 }
		 
		 //홀수만 더하기
		 
		 int total = 0;
		 for(int num = 1; num <= 100; num++) {
			 if(num % 2 == 0) {
				 //짝수
				 continue;
			 } else {
				 total += num;
			 }
		 }
		 System.out.println("홀수 합 : " + total);
		 
		 
		 
		 for(int num3 = 1; num3 <= 100; num3++) {
			 if(num3 % 3 != 0) {
				 //짝수
				 continue;
			 } 
			 System.out.println("3의 배수: " + num3);
		 }
		 
		 
		 
		 int sa = 0;
		 for (int nb = 1; ; nb++) {
			 
			 sa += nb;
			 if(sa >= 500) {
				 System.out.println(sa);
				 System.out.println(nb);
				 break;
			 }
		 }

		 
		 
		
	}

}
