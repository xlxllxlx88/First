package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;	//vIP상담원아이디
	double saleRatio;
	
	//디폴트 생성자
	public VIPCustomer() {
		customerGrade = "VIP";	//기본등급
		bonusRatio = 0.05;			//보너스 포인트 기본 적립 비율
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
