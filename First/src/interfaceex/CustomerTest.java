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
		seller.order(); 		// 여기서도 order를 호출할 수 있지만 호출되는건 instance의 의 order이다.
	}

}
