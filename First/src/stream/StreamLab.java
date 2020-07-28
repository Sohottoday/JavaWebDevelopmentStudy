package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamLab {

	public static void main(String[] args) {

		Person p1 = new Person(1, "�̼���", 40, 100);
		Person p2 = new Person(2, "������", 20, 100);
		Person p3 = new Person(3, "ȫ�浿", 13, 50);
		
		List<Person> customerList = new ArrayList<Person>();
		customerList.add(p1);
		customerList.add(p2);
		customerList.add(p3);
		
		System.out.println(p1);
		
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		int total = customerList.stream().mapToInt(c -> c.getMoney()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
