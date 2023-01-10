package object;

public class Book {

	int bookNumber;
	String bookTitle;
	
	Book(int num, String title) {
		this.bookNumber = num;
		this.bookTitle = title;
	}
	
	@Override
	public String toString() {
		return bookTitle + "," + bookNumber;
	}
}
