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



#### List 인터페이스

- Collection 하위 인터페이스
- 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
- 배열의 기능을 구현하기 위한 메서드가 선언됨
- ArrayList, Vector, LinkedList
- ArrayList와 Vector
  - 객체 배열 클래스
  - Vector는 자바2부터 제공된 클래스
  - 일반적으로 ArrayList를 더 많이 사용
  - Vector는 멀티쓰레드 프로그램에서 동기화를 지원
  - 동기화(synchronization) : 두 개의 쓰레드가 동시에 하나의 리소스에 잡근할 때 순서를 맞추어서 데이터의 오류를 방지
  - capacity와 size는 다른 의미 : capacity(배열의 용량), size(존재하는 요소 개수)
- ArrayList와 LinkedList
  - 둘 다 자료의 순차적 구조를 구현한 클래스
  - ArrayList는 배열을 구현한 클래스로 논리적 순서와 물리적 순서가 동일
  - LinkedList는 논리적으로 순차적인 구조지만, 물리적으로는 순차적이지 않을 수 있음



#### Stack과 Queue

- Stack
  - Last In First Out(LIFO) : 맨 마지막에 추가 된 요소가 가장 먼저 꺼내지는 자료구조
  - 이미 구현된 클래스가 제공 됨
  - ArrayList나 LinkedList로 구현 할 수 있음
  - 게임에서 무르기, 최근 자료 가져오기 등
- Queue
  - First In First Out(FIFO) : 먼저 저장된 자료가 먼저 꺼내지는 자료구조
  - 선착순, 대기열 등을 구현할 때 가장 많이 사용되는 자료 구조
  - ArrayList나 LinkedList로 구현 할 수 있음



#### Set 인터페이스

- Collection 하위의 인터페이스
- 중복을 허용하지 않음
- List는 순서기반의 인터페이스지만, Set은 순서가 없음
- get(i) 메서드가 제공되지 않음(Iterator로 순회)
- 저장딘 순서와 출력순서는 다를 수 있음
- 아이디, 주민번호, 사번 등 유일한 값이나 객체를 관리할 때 사용
- HashSet, TreeSet 클래스

- Iterator로 순회하기

  - Collection의 개체를 순회하는 인터페이스

  - iterator() 메서드 호출

    `Iterator ir = memberArrayList.iterator();`

  - Iterator에 선언된 메서드

    - `boolean hashNext()` : 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
    - `E next()` : 다음에 있는 요소를 반환

- HashSet 클래스

  - Set 인터페이스를 구현한 클래스
  - 중복을 허용하지 않으므로 저장되는 객체의 동일함 여부를 알기 위해 equals()와 hashCode() 메서드를 재정의 해야 함

- TreeSet 클래스

  - 객체의 정렬에 사용되는 클래스

  - 중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬함

  - 내부적으로 이진 검색 트리(binary search tree)로 구현되어 있음

  - 이진 검색 트리에 자료가 저장될 때 비교하여 저장될 위치를 정함

  - 객체 비교를 위해 Comparable이나 Comparator 인터페이스를 구현해야 함

  - Comparable 인터페이스와 Comparator 인터페이스

    - 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스

    - Comparable은 comparaTo() 메서드를 구현

      매개 변수와 객체 자신(this)을 비교

    - Comparator는 compare() 메서드를 구현

      두 개의 매개 변수를 비교

      TreeSet 생성자에 Comparator가 구현된 객체를 매개변수로 전달

      `TreeSet<Member> treeSet = new TreeSet<Member>(new Member());`

    - 일반적으로 Comparable을 더 많이 사용

    - 이미 Comparable이 구현된 경우 Comparator를 이용하여 다른 정렬 방식을 정의할 수 있음

  







### Map 인터페이스

- 쌍으로 이루어진 객체를 관리하는데 필요한 여러 메서드가 선언되어 있음
- Map을 사용하는 객체는 key-value 쌍으로 되어 있고 key는 중복될 수 없음

- 검색을 위한 자료 구조

- key를 이용하여 값을 저장하거나 검색, 삭제 할 때 사용하면 편리

  내부적으로 hash 방식으로 구현 됨

  `index = hash(key)` 		// index는 저장 위치

- key가 되는 객체는 객체의 유일성함의 여부를 알기 위해 equals()와 hashCode() 메서드를 재정의 함



#### HashMap 클래스

- Map 인터페이스를 구현한 클래스 중 가장 일반적으로 사용하는 클래스
- HashTable 클래스는 자바 2부터 제공된 클래스로 Vector처럼 동기화를 제공
- pair 자료를 쉽고 빠르게 관리할 수 있음



#### TreeMap 클래스

- key 객체를 정렬하여 key-value를 pair로 관리하는 클래스
- key에 사용되는 클래스에 Comparable, Comparator 인터페이스를 구현
- java에 많은 클래스들은 이미 Comparale이 구현되어 있음
- 구현된 클래스를 key로 사용하는 경우는 구현할 필요 없음

``` java
public final class Integer extends Number implements Comparable<integer> {
    ...
        public int compareTo(Integer anotherInteger) {
        	return compare(this.value, anotherInteger.value);
	    }
}
```





