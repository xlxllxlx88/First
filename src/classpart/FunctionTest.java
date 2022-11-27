package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 50;
		int num2 = 20;
		
		int sumResult = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sumResult + "입니다.");
		
		int minusResult = minus(num1, num2);
		System.out.println(num1 + " - " + num2 + " = " + minusResult + "입니다.");
		
	}
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

}
