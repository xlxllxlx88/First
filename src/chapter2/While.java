package chapter2;

public class While {
	public static void main(String[] args) {
		
		int num =1;
		int sum =0;
		
		while(num <=50) {
			sum += num;
			num++;
		}
		
		System.out.println("합" + sum);
		
		//for문
		int i;
		
		for(i = 1, sum = 0  ; i <= 10 ; i++ ) {
			sum += i;
		}
		
		System.out.println("합" + sum);
		
		
		int j;
		for (j = 1; j <= 10; j++) {
			System.out.println("안녕" + j);
		}
		
		
	}

}
