package innerClass;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
		//static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass num = " + num);
			System.out.println("OutClass sNum = " + sNum);
		}
		
	}

	public void usingClass() {
		// TODO Auto-generated method stub
		
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스이용하여 내부 클래스호출");
		outClass.usingClass();
	}

}
