package cooperation;

public class Subway {

	public String lineNumber;			// 지하철 노선 번호
	public int passengerCount;			// 승객 수 
	public int money;					// 수입 액
	    
	// 지하철 노선 초기화
	public Subway(String lineNumber){	
		this.lineNumber = lineNumber;   
	}
	    
	// 승객이 탄 경우 
	public void take(int money){		
		this.money += money;			// 수입 증가
		passengerCount++;				// 승객 수 증가
	} 
	    
	// 지하철 정보 출력
	public void showInfo(){
		System.out.println(lineNumber + "의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
	}
}
