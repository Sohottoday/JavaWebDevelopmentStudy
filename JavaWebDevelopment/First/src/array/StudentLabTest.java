package array;

public class StudentLabTest {

	public static void main(String[] args) {

		StudentLab stdLee = new StudentLab("Lee");
		StudentLab stdKim = new StudentLab("Kim");
		StudentLab stdCho = new StudentLab("Cho");
		
		stdLee.addBook("�¹���1");
		stdLee.addBook("�¹���2");
		
		stdKim.addBook("����1");
		stdKim.addBook("����2");
		stdKim.addBook("����3");
		
		stdCho.addBook("�ظ�����1");
		stdCho.addBook("�ظ�����2");
		stdCho.addBook("�ظ�����3");
		stdCho.addBook("�ظ�����4");
		stdCho.addBook("�ظ�����5");
		stdCho.addBook("�ظ�����6");
		
		stdLee.showBookList();
		stdKim.showBookList();
		stdCho.showBookList();
	}

}
