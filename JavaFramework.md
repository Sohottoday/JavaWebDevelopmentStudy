## 컬렉션 프레임 워크

- 프로그램 구현에 필요한 자료구조와 알고리즘을 구현해 놓은 라이브러리
- java.util 패키지에 구현되어 있음
- 개발에 소요되는 시간을 절약하고 최적화된 라이브러리를 사용할 수 있음
- Collection 인터페이스와 Map 인터페이스로 구성



### 제네릭 프로그래밍

- 변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형을 변환 될 수 있도록 프로그래밍 하는 방식
- 실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식
- 자료형 매개 변수 T
  - 여러 참조 자료형으로 대체 될 수 있는 부분을 하나의 문자로 푷ㄴ

``` java
public class GenericPrinter<T> {		// 제네릭 클래스,   T : type의 약자, 자료형 매개변수
    private T material;

	public void setMaterial(T material) {
        this.material = material;
    }

	public T getMaterial() {
        return material;
    }
}
```

- <T extends 클래스>
  - T 대신에 사용될 자료형을 제한하기 위해 사용
  - Material에 정의 된 메서드를 궁유할 수 있음
- 자료형 매개 변수가 두 개 이상일 때

``` java
public class Point<T, V> {
    T x;
    V y;
    
    Point(T X, v Y){
        this.x = x;
        this.y = y;
    }
    
    public T getX() {
        return x;
    }
    
    public V getY(){
        return y;
    }					// 제너릭 메서드들
}
```

- 메서드의 매개 변수를 자료형 매개 변수로 사용하는 메서드

``` java
public class GenericMethod {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2){
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();
        
        double width = right - left;
        double height = bottom - top;
        
        return width * height;
    }
}

// 지역변수와 똑같이 메서드 안에서만 의미가 있다.
```

- 즉 메서드 내에서의 자료형 매개 변수는 메서드 내에서만 유효함(지역 변수와 같은 개념)

``` java
class Shape<T> {
    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2){
        .....
    }
}

// Shape의 T와 makeRectangle의 T는 전혀 다른 의미
```



### Collection 인터페이스

- 하나의 객체의 관리를 위해 선언된 인터페이스로 필요한 기본 메서드가 선언되어 있음
- 하위에 List, Set 인터페이스가 있음

| 분류            | 설명                                                         |
| --------------- | ------------------------------------------------------------ |
| List 인터페이스 | 순서가 있는 자료 관리, 중복 허용. <br />이 인터페이스를 구현한 클래스는 ArrayList, Vector, LinkedList, Stack, Queue등이 있음 |
| Set 인터페이스  | 순서가 정해져 있지 않음, 중복을 허용하지 않음.<br />이 인터페이스를 구현한 클래스는 HashSet, TressSet 등이 있음 |

- Array : 논리적으로나 물리적으로나 연속적으로 연결되어 있음, 데이터 찾기가 편리, 데이터 추가는 복잡

  LinkedList : 논리적으로는 연결되어 있으나 물리적으로 연결되어 있지는 않음, 데이터 추가가 편리



### Map 인터페이스

- 쌍으로 이루어진 객체를 관리하는데 필요한 여러 메서드가 선언되어 있음
- Map을 사용하는 객체는 key-value 쌍으로 되어 있고 key는 중복될 수 없음

