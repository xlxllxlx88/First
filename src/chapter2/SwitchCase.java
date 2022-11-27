package chapter2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rank =1;
		char medal;
		switch(rank) {
			case 1 : medal = 'G';
				break;
			case 2 : medal = 'S';
				break;
			case 3 : medal = 'B';
				break;
			default : medal = 'a';
				break;
		}
		System.out.println(rank + "등 : 메달색은 " + medal);
		
		
		System.out.println("****************건물주");
		int f =5;
		String s;
		switch(f) {
		case 1 : s = "약국";
		break;
		case 2 : s = "정형외과";
		break;
		case 3 : s = "피부과";
		break;
		case 4 : s = "치과";
		break;
		default : s = "헬스클럽";
		break;
		}
		System.out.println(f + "층은 " + s + "입니다.");
	}

}
