package array;

public class StudentLabTest {

	public static void main(String[] args) {

		StudentLab stdLee = new StudentLab("Lee");
		StudentLab stdKim = new StudentLab("Kim");
		StudentLab stdCho = new StudentLab("Cho");
		
		stdLee.addBook("태백산맥1");
		stdLee.addBook("태백산맥2");
		
		stdKim.addBook("토지1");
		stdKim.addBook("토지2");
		stdKim.addBook("토지3");
		
		stdCho.addBook("해리포터1");
		stdCho.addBook("해리포터2");
		stdCho.addBook("해리포터3");
		stdCho.addBook("해리포터4");
		stdCho.addBook("해리포터5");
		stdCho.addBook("해리포터6");
		
		stdLee.showBookList();
		stdKim.showBookList();
		stdCho.showBookList();
	}

}
