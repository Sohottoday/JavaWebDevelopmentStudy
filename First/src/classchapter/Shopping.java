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
		sp.orderDate = "2019년 7월 21일";
		sp.orderName = "홍길순";
		sp.itemNum = "PD0345-12";
		sp.orderAddr = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + sp.orderNum);
		System.out.println("주문자 아이디 : " + sp.orderID);
		System.out.println("주문 날짜 : " + sp.orderDate);
		System.out.println("주문자 이름 : " + sp.orderName);
		System.out.println("주문 상품 번호 : " + sp.itemNum);
		System.out.println("배송 주소 : " + sp.orderAddr);
		
	}

}
