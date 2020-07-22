package inheritance;

public class VIPCustomer extends Customer{

	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		
		super();		// this가 자기 자신을 잠조한다고 하면 super는 상위 클래스를 참조, super() 로 괄호 안에 아무것도 없으면 상위 클래스의 기본 생성자 참조
		
		customerGrade = "VIP";		// private일 경우 접근할 수 없지만 protected로 주면 같은 패키지 내에서는 접근이 가능하다.
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = (int)(price * salesRatio);
		
	}
	
//	public VIPCustomer(int customerID, String customerName) {
//		super(customerID, customerName);
//		
//		customerGrade = "VIP";		
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//	}				상위 클래스에 기본 생성자는 존재하지 않을 때 이러한 방식으로 super 사용	
	
	
}
