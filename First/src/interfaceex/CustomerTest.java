package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		System.out.println("------------");
		
		Sell seller = customer;
		seller.sell();
		seller.order(); 		// ���⼭�� order�� ȣ���� �� ������ ȣ��Ǵ°� instance�� �� order�̴�.
	}

}
