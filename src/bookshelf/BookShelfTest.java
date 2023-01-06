package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue shelf = new Bookshelf();
		shelf.enQueue("태백산맥1");
		shelf.enQueue("태백산맥2");
		shelf.enQueue("태백산맥3");
		
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
		System.out.println(shelf.deQueue());
	}

}
