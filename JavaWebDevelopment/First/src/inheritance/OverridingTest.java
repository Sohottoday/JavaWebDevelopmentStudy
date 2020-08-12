package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer custLee = new Customer();
		custLee.setCustomerID(10010);
		custLee.setCustomerName("�̼���");
		custLee.bonusPoint = 1000;
		
		VIPCustomer custKim = new VIPCustomer();
		custLee.setCustomerID(10020);
		custLee.setCustomerName("������");
		custLee.bonusPoint = 10000;
		
		int priceLee = custLee.calcPrice(10000);
		int priceKim = custKim.calcPrice(10000);
		
		System.out.println(custLee.showCustomerInfo() + "���� �ݾ��� " + priceLee + "�� �Դϴ�.");
		System.out.println(custKim.showCustomerInfo() + "���� �ݾ��� " + priceKim + "�� �Դϴ�.");
		
		Customer custNo = new VIPCustomer();
		custNo.setCustomerID(10030);
		custNo.setCustomerName("��ȫö");
		custNo.bonusPoint = 10000;
		
		System.out.println(custNo.showCustomerInfo() + "���� �ݾ��� " + custNo.calcPrice(10000) + "�� �Դϴ�.");
	}

}
