package collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("ȫ�浿");
		treeSet.add("�Ӳ���");
		treeSet.add("�念��");
		
		for(String str : treeSet) {
			System.out.println(str);			// �����ټ����� ���ĵǾ� �ֵ�.
		}
	}

}
