package collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{		// �����������ķ� �ٲٱ� ���� �������̵�

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("ȫ�浿");
		treeSet.add("�Ӳ���");
		treeSet.add("�念��");
		
		for(String str : treeSet) {
			System.out.println(str);			// �����ټ����� ���ĵǾ� �ֵ�.
		}
	}

}
