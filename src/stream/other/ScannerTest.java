package stream.other;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름 : ");
		String nm = sc.nextLine();
		System.out.println("직업 : ");
		String job = sc.nextLine();
		System.out.println("사번 : ");
		String num = sc.nextLine();

		System.out.println("===사원 정보===");
		System.out.println("이름 : " + nm);
		System.out.println("직업 : " + job);
		System.out.println("사번 : " + num);
	}

}
