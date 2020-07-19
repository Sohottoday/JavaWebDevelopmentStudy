package classchapter;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	
	public static Company getInstance() {		// 위의 변수가 private로 설정되어 있기 때문에 인스턴스 객체를 생성할 수 없다. 따라서 메서드 자체를 static으로 주어 불러올 수 있게 만든다.
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
