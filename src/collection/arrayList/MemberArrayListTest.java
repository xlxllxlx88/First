package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memArrList = new MemberArrayList();
	
		// 새로운 회원 인스턴스 생성
		Member mem1 = new Member(1001, "고로케");
		Member mem2 = new Member(1002, "고로니");
		Member mem3 = new Member(1003, "김누누");
		Member mem4 = new Member(1004, "도로시");
		
		// ArrayList에 회원 추가
		memArrList.addMember(mem1);
		memArrList.addMember(mem2);
		memArrList.addMember(mem3);
		memArrList.addMember(mem4);
		
		// 전체 회원 출력
		memArrList.showAllMember();
		
		// 김누누 회원 삭제
		memArrList.removeMember(mem3.getMemberId());
		
		// 김누누 회원 삭제 후 전체 회원 출력
		memArrList.showAllMember();
		
		
	}

}
