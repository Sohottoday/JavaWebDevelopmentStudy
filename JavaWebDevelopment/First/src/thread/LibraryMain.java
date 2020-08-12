package thread;

import java.util.ArrayList;

class FastLibrary{
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("�ظ�����1");
		books.add("�ظ�����2");
		books.add("�ظ�����3");
		books.add("�ظ�����4");
		books.add("�ظ�����5");
		books.add("�ظ�����6");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		
		Thread t = Thread.currentThread();
		if(books.size() == 0) {
			System.out.println(t.getName() + "waiting start");
			wait();
			System.out.println(t.getName() + "waiting end");
		}
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + "lend");
		return title;
	}
	
	public synchronized void returnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		notify();
		
		System.out.println(t.getName() + ":" + title + "return");
	}
}

class Student extends Thread {
	
	public void run() {
		
		
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) return ;
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		
	}

}