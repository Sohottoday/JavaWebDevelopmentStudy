package map;

public class Member implements Comparable<Member>{
//public class Member2 implements Comparator<Member2>
	@Override
	public int compareTo(Member member) {
		return (this.memberID - member.memberID) * (-1);
		// return this.memberName.compareTo(member.getMmberName());			// �̸� �������� ����
	}
	
	private int memberID;
	private String memberName;
	
	public Member() {}
	public Member(int memberID, String memberName) {
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
		return memberName + "ȸ������ ���̵�� " + memberID + "�Դϴ�.";
	}
	
	
	@Override
	public int hashCode() {
		return memberID;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return (this.memberID == member.memberID);
		}
		return false;
	}

	// @Override
	// public int compare(Member2 member1, Member2 member2) {		// ù��° ����� this, �ι�° ����� �Ѿ�� �Ű�����
	// return (member1.memberID - member2.memberID);
	// }
	
}
