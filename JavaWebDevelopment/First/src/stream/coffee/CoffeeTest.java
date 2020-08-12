package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new KenyaAmericano();
		americano.brewing();
		
		Coffee kenyaLatte = new Latte(new KenyaAmericano());
		kenyaLatte.brewing();
		
		Coffee kenyaMocha = new Mocha(new Latte(new KenyaAmericano()));
		kenyaMocha.brewing();
	}

}
