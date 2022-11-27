package cooperation;

public class Bus {
	int busNumber;					// 버스 번호
	int passengerCount;			// 승객 수
	int money;						// 버스의 수입
		    
	// 버스 번호를 매개변수로 받는 생성자
	public Bus(int busNumebr){   
		this.busNumber = busNumebr;
	}
		
	// 승객이 낸 돈을 받음
	public void take(int money){  
		this.money += money;		// 버스의 수입 증가
		passengerCount++;			// 승객 수 증가
	}
	
	// 버스 정보를 출력하는 함수
	public void showInfo(){		
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
	}


}
