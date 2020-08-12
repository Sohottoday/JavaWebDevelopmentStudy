package collection;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
		// treeSet = new TreeSet<Member2>(new Member());		Comparator 로 비교할 경우 new Member()로 정렬해야 하기 때문에 꼭 써줘야 한다.
	}
	
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID){
		
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			if(member.getMemberID() == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "번호가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member2 member : treeSet) {
			System.out.println(member);
		}
	}
	
}
