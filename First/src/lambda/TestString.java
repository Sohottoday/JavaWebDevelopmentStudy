package lambda;

public class TestString {

	public static void main(String[] args) {

		StringConImpl impl = new StringConImpl();
		impl.makeString("hello",  "world");			// �̷��� ������ ������ ����ϴ� ���
		
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);		// ���ٽ� ����
		concat.makeString("hello", "java");
	}

}
