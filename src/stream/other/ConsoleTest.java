package stream.other;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console cs = System.console();
		
		System.out.println("이름 : ");
		String nm = cs.readLine();
		System.out.println("직업 : ");
		String job = cs.readLine();
		System.out.println("비밀번호 : ");
		char[] num = cs.readPassword();
		String strNum = new String(num);
		
		System.out.println("===개인정보===");
		System.out.println("이름 : " + nm);
		System.out.println("직업 : " + job);
		System.out.println("비밀번호 : " + strNum);
		
	}

}
