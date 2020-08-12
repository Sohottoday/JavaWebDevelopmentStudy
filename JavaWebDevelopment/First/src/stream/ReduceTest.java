package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = {"안녕하세요", "hello", "nihao", "반갑스무니다"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());		// 위의 식이 복잡하므로 BinaryOperator을 참조하는 class를 만들어서 오버라이딩 후 사용할 수 있다.
	}

}
