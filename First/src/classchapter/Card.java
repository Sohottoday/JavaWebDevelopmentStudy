package classchapter;

public class Card {

	public static int cardStart = 10000;
	private int cardNumber;
	
	
	Card() {
		cardStart++;
		cardNumber = cardStart;
		
	}
	
	
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
}
