package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer custLee = new Customer();
		custLee.setCustomerID(10010);
		custLee.setCustomerName("이순신");
		custLee.bonusPoint = 1000;
		
		VIPCustomer custKim = new VIPCustomer();
		custLee.setCustomerID(10020);
		custLee.setCustomerName("김유신");
		custLee.bonusPoint = 10000;
		
		int priceLee = custLee.calcPrice(10000);
		int priceKim = custKim.calcPrice(10000);
		
		System.out.println(custLee.showCustomerInfo() + "지불 금액은 " + priceLee + "원 입니다.");
		System.out.println(custKim.showCustomerInfo() + "지불 금액은 " + priceKim + "원 입니다.");
		
		Customer custNo = new VIPCustomer();
		custNo.setCustomerID(10030);
		custNo.setCustomerName("노홍철");
		custNo.bonusPoint = 10000;
		
		System.out.println(custNo.showCustomerInfo() + "지불 금액은 " + custNo.calcPrice(10000) + "원 입니다.");
	}

}
