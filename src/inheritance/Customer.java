package inheritance;

public class Customer {

	//클래스 속성을 멤버 변수로 선언
	protected int customerID;			//고객아이디
	protected String customerName;	//고객명
	protected String customerGrade;	//고객등급
	int bonusPoint;					//보너스 포인트
	double bonusRatio;				//적립비율
	
	//디폴트 생성자
	public Customer() {
		customerGrade = "SILVER";	//기본등급
		bonusRatio = 0.01;			//보너스 포인트 기본 적립 비율
	}
	
	//보너스 포인트 적립, 지불 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//보너스 포인트 계산
		return price;
	}
	
	//고객정보를 반환하는 메서드
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}
