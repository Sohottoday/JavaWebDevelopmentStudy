package collection;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("임꺽정");
		treeSet.add("장영실");
		
		for(String str : treeSet) {
			System.out.println(str);			// 가나다순으로 정렬되어 있따.
		}
	}

}
