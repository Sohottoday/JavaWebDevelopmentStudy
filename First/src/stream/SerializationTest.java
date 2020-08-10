package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Serializable{
//class Person implements Externalizable : Serializable �� ������ �� �ִ� �������̽��� ������ Externalizable�� ������ �� �ִ� �������̽��� �����Ѵ�.
// writeExternal�� readExternal�� �����Ѵ�. �а� ���°��� ���� ������ �� �ִ�.
	String name;
	transient String job;		// transient �� ����ϸ� ����ȭ ���� �ʴ´�.
	
	public Person1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + "," + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {

		Person1 personLee = new Person1("�̼���", "�����Ͼ�");
		Person1 personKim = new Person1("������", "������");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person1 p1 = (Person1)ois.readObject();
			Person1 p2 = (Person1)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch(IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}