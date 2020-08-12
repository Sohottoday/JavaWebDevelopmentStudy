package collection;

public class MemberTreeSetTest {

	public static void main(String[] args) {

		MemberTreeSet manager = new MemberTreeSet();
		
		Member2 memberLee = new Member2(100, "Lee");
		Member2 memberKim = new Member2(200, "Kim");
		Member2 memberPark = new Member2(300, "Park");
		
		manager.addMember(memberLee);			// ��ü ��ü�� ��� ���ؾ� �ϴ��� ��������� �Ѵ�.
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
		System.out.println("----------------");
		manager.removeMember(100);
		
		manager.showAllMember();
		
	}

}
