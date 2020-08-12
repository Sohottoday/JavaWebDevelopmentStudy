package objectex;

class Book implements Cloneable{		// 복제 가능한것을 명시해야하기 때문에 implements Cloneable가 필요하다.
	String title;
	String author;
	
	@Override
	public String toString() {
		return author + "," + title;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {		// 메모리 자체를 복제하는 것이다.
		return super.clone();	
	}
	
	
}


public class ToStringTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");		//string 은 jdk 클래스 인데 그 안에 기본적으로 toString 클래스가 선언되어 있으므로 주소값이 아닌 입력값이 출력된다.
		System.out.println(str);
		
		Book book2 = (Book)book.clone();		// object 자체를 복제하는 것이므로 다운캐스팅 필요
		System.out.println(book2);				// 복제 가능한것을 명시해야하기 때문에 복제하려는 클래스에 implements Cloneable가 필요하다.
	}

}
