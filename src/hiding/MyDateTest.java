package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2022);
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(29, 2, 2022);
		System.out.println(date2.isValid());
	}
	
}
