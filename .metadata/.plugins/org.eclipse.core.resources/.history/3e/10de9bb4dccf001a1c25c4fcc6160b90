package collection;

public class Member2 implements Comparable<Member2>{
//public class Member2 implements Comparator<Member2>
	@Override
	public int compareTo(Member2 member) {
		return (this.memberID - member.memberID) * (-1);
		// return this.memberName.compareTo(member.getMmberName());			// 이름 기준으로 정렬
	}
	
	private int memberID;
	private String memberName;
	
	public Member2() {}
	public Member2(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberID + "입니다.";
	}
	
	
	@Override
	public int hashCode() {
		return memberID;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
			return (this.memberID == member.memberID);
		}
		return false;
	}

	// @Override
	// public int compare(Member2 member1, Member2 member2) {		// 첫번째 멤버는 this, 두번째 멤버는 넘어온 매개변수
	// return (member1.memberID - member2.memberID);
	// }
	
}
