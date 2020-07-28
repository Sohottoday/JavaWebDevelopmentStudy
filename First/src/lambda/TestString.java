package lambda;

public class TestString {

	public static void main(String[] args) {

		StringConImpl impl = new StringConImpl();
		impl.makeString("hello",  "world");			// 이러한 과정이 기존에 사용하던 방식
		
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);		// 람다식 적용
		concat.makeString("hello", "java");
	}

}
