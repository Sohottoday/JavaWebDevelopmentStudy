package classchapter;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {		// ���� ������ private�� �����Ǿ� �ֱ� ������ �ν��Ͻ� ��ü�� ������ �� ����. ���� �޼��� ��ü�� static���� �־� �ҷ��� �� �ְ� �����.
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
