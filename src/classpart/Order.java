package classpart;

public class Order {

	long ordNo;
	String id;
	String date;
	String name;
	String prdtNo;
	String address;
	
	public static void main(String[] args) {
		Order order = new Order();
		
		order.ordNo = 201803120001L;
		order.id = "abc123";
		order.date = "2018년 3월 12일"; 
		order.name = "홍길순";
		order.prdtNo = "PD345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + order.ordNo);
		System.out.println("주문자 아이디: " + order.id);
		System.out.println("주문 날짜: " + order.date);
		System.out.println("주문자 이름: " + order.name);
		System.out.println("주문 상품 번호: " + order.prdtNo);
		System.out.println("배송 주소: " + order.address);
	}
}
