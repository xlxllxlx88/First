package collection.arrayList;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	// ArrayList 선언
	private ArrayList<Member> arrayList;
	
	// Member형으로 선언한 ArrayList생성
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	// ArrayList에 회원을 추가하는 메서드 
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		// 반복문이 끝날 때까지 아이디를 못찾은 경우
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList ) {
			System.out.println(member);
		}
		System.out.println();
	}
}
