package objectex;

class Book implements Cloneable{		// ���� �����Ѱ��� ����ؾ��ϱ� ������ implements Cloneable�� �ʿ��ϴ�.
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
	protected Object clone() throws CloneNotSupportedException {		// �޸� ��ü�� �����ϴ� ���̴�.
		return super.clone();	
	}
	
	
}


public class ToStringTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("����", "�ڰ渮");
		
		System.out.println(book);
		
		String str = new String("����");		//string �� jdk Ŭ���� �ε� �� �ȿ� �⺻������ toString Ŭ������ ����Ǿ� �����Ƿ� �ּҰ��� �ƴ� �Է°��� ��µȴ�.
		System.out.println(str);
		
		Book book2 = (Book)book.clone();		// object ��ü�� �����ϴ� ���̹Ƿ� �ٿ�ĳ���� �ʿ�
		System.out.println(book2);				// ���� �����Ѱ��� ����ؾ��ϱ� ������ �����Ϸ��� Ŭ������ implements Cloneable�� �ʿ��ϴ�.
	}

}
