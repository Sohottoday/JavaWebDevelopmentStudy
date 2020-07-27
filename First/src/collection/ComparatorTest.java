package collection;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{		// 내림차순정렬로 바꾸기 위한 오버라이딩

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * (-1);
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("홍길동");
		treeSet.add("임꺽정");
		treeSet.add("장영실");
		
		for(String str : treeSet) {
			System.out.println(str);			// 가나다순으로 정렬되어 있따.
		}
	}

}
