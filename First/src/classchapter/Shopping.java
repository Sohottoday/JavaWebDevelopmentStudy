package classchapter;

public class Shopping {
	String orderNum;
	String orderID;
	String orderDate;
	String orderName;
	String itemNum;
	String orderAddr;
	
	
	public static void main(String[] args) {

		Shopping sp = new Shopping();
		sp.orderNum = "201907210001";
		sp.orderID = "abc123";
		sp.orderDate = "2019�� 7�� 21��";
		sp.orderName = "ȫ���";
		sp.itemNum = "PD0345-12";
		sp.orderAddr = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + sp.orderNum);
		System.out.println("�ֹ��� ���̵� : " + sp.orderID);
		System.out.println("�ֹ� ��¥ : " + sp.orderDate);
		System.out.println("�ֹ��� �̸� : " + sp.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + sp.itemNum);
		System.out.println("��� �ּ� : " + sp.orderAddr);
		
	}

}
