package array;

import java.util.ArrayList;

public class StudentLab {
	
	String studentName;
	ArrayList<BookLab> bookList;
	
	public StudentLab(String studentName) {
		this.studentName = studentName;
		
		bookList = new ArrayList<BookLab>();
	}
	
	public void addBook(String bookName) {
		BookLab bookLab = new BookLab(bookName);
		
		bookList.add(bookLab);
	}
	
	public void showBookList() {
		System.out.print(studentName + "학생이 읽은 책은 : ");
		for(BookLab bookLab : bookList) {
			System.out.print(bookLab.getBookName() + " ");
		}
		System.out.println("입니다.");
	}
}
