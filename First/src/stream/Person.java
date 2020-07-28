package stream;

public class Person {

	private int num;
	private String name;
	private int age;
	private int money;
	
	public Person() {}
	public Person(int num, String name, int age, int money){
		this.num = num;
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public String toString() {
		return name + "," + age + "," + money;
	}
}
