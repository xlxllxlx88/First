package exception;

import java.io.FileInputStream;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}

}
