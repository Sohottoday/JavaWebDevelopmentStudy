# 객체지향 프로그래밍



### 객체지향 프로그래밍

- 객체 지향 프로그래밍(Object Oriented Programming : OOP)
  - 객체를 기반으로 하는 프로그래밍
  - 객체를 정의하고, 객체의 기능을 구현하며 객체간의 협력을 구현
- 절차 지향 프로그래밍(Procedural Programming)
  - 시간이나 사건의 흐름에 따른 구현
  - C 언어

#### 객체(Object)

- 의사나 행위가 미치는 대상(사전적 의미)

- 구체적, 추상적 데이터의 단위

  사람, 자동차, 주문, 생산, 관리 등

#### 클래스(class)

- 객체를 코드로 구현한 것
- 객체 지향 프로그래밍의 가장 기본 요소
- 객체의 청사진(blueprint)
- 멤버 변수
  - 객체가 가지는 속성을 변수로 표현
  - 클래스의 멤버 변수
  - member variable, property, attribute
- 메서드
  - 객체의 기능을 구현
  - method, member function

- 클래스 사용하기

  - new 키워드를 사용하여 생성자로 생성

    `Student studentLee = new Student();`

- 클래스의 속성, 메서드 참조하기

  - 생성에 사용한 변수(참조변수)로 클래스의 속성, 메서드 참조

    `studentLee.studentName = "Lee";`

    `studentLee.showStudentInfo();`

- public class

  - 자바 파일 하나에 여러 개의 클래스가 존재할 수 있음
  - 단, public 클래스는 하나이고, public 클래스와 자바 파일 이름은 동일해야 함.



#### 함수(function)

- 하나의 기능을 수행하는 일련의 코드
- 함수는 호출하여 사용하고 기능이 수행된 후 값을 반환할 수 있음
- 함수로 구현된 기능은 여러 곳에서 호출되어 사용될 수 있음

- 함수 정의하기
  - 함수는 이름, 매개변수, 반환 값, 함수 몸체(body)로 구성 됨

``` java
int add(int num1, int num2){
    int result;
    result = num1 + num2;
    return result;
}
```



#### 메서드(method)

- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수

- 메서드를 구현함으로써 객체의 기능이 구현 됨

- 메서드의 이름은 사용하는 쪽(클라이언트 코드)에 맞게 명명하는 것이 좋음

  ex) getStudentName() (camel notation)



#### 인스턴스

- 클래스로부터 생성된 객체
- 힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성
- 클래스를 기반으로 new 키워드를 이용하여 여러개의 인스턴스를 생성



#### 생성자(constructor)

- 객체를 생성할 때 new 키워드와 함께 호출(객체 생성 외에는 호출할 수 없음)
- 인스턴스를 초기화 하는 코드가 구현 됨(주로 멤버 변수 초기화)
- 반환 값이 없음, 상속되지 않음
- 생성자는 클래스 이름과 동일

##### 기본 생성자(default constructor)

- 하나의 클래스에 반드시 하나 이상의 생성자가 존재해야 함
- 프로그래머가 생성자를 구현하지 않으면 컴파일러가 생성자 코드를 넣어준다. => 기본 생성자
- 기본 생성자는 매개 변수가 없고, 구현부가 없음
- 만약 클래스에 다른 생성자가 있는 경우 디폴트 생성자는 제공되지 않음



#### 참조 자료형(reference data type)

- 변수의 자료형

- 기본 자료형

  - int, long, float, double 등

- 참조 자료형

  - String, Date, Student 등

- 클래스형으로 변수를 선언함

  `String name;`

- 기본 자료형은 사용하는 메모리가 정해져 있지만, 참조 자료형은 클래스에 따라 다름



#### 접근 제어자(access modifier)

- 변수, 메서드, 생성자에 대한 접근 권한 지정
- public, private, protected, 안쓰는 경우(기본 접근 제어자)
- private을 사용하면 클래스 외부에서는 접근할 수 없음
- 정보 은닉(information hiding)
  - 외부에서 클래스 내부의 정ㅂ주에 접근하지 못하도록 함
  - private 키워드 활용
  - private 변수를 외부에서 접근하게 하려면 public 메서드 제공
  - 클래스 내부 데이터를 잘못 사용하는 오류 방지 가능
- 접근 제한자의 가시성

|                        | 외부 클래스 | 하위 클래스 | 동일 패키지 | 내부 클래스 |
| ---------------------- | ----------- | ----------- | ----------- | ----------- |
| public                 | O           | O           | O           | O           |
| protected              | X           | O           | O           | O           |
| default(선언되지 않음) | X           | X           | O           | O           |
| private                | X           | X           | X           | O           |



#### this

- 자신의 메모리를 가리킴
- 생성자에서 다른 생성자를 호출함
- 인스턴스 자신의 주소를 반환

- 생성자에서 다른 생성자를 호출

``` java
public Person() {
    this("이름 없음", 1);
}

public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```



#### 객체 간 협력

- 객체 지향 프로그램은 객체를 정의하고 객체간의 협력을 구현한 프로그램
- 학생이 지하철이나 버스를 타고 학교 가는 과정에서 일어나는 협력



#### static 변수

- 여러 인스턴스가 하나의 값을 공유할 필요가 있음

- static 변수는 처음 프로그램이 로드될 때 데이터 영역에 생성됨

- 인스턴스의 생성과 상관 없이 사용할 수 있으므로 클래스 이름으로 참조

  `Student.serialNum = 100;`

  클래스 변수, 정적 변수라고도 함

- static 메서드 안에서 인스턴스 변수를 사용할 수는 없다.



##### static 응용 - singleton Pattern

- 단 하나만 존재하는 인스턴스 
- 생성자는 private으로
- static으로 유일한 객체 생성
- 외부에서 유일한 객체를 참조할 수 있는 public static get() 메서드 구현



#### 프로그램에서 변수의 유형

| 변수 유형                      | 선언 위치                                   | 사용 범위                                                    | 메모리      | 생성과 소멸                                                  |
| ------------------------------ | ------------------------------------------- | ------------------------------------------------------------ | ----------- | ------------------------------------------------------------ |
| 지역 변수<br />(로컬 변수)     | 함수 내부에 선언                            | 함수 내부에서만 사용                                         | 스택        | 함수가 호출될 때 생성되고 함수가 끝나면 소멸함               |
| 멤버 변수<br />(인스턴스 변수) | 클래스 멤버 변수로 선언                     | 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능 | 힙          | 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨 |
| static 변수<br />(클래스 변수) | static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능 | 데이터 영역 | 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨 |



### 배열

- 동일한 자료형의 순차적 자료 구조

- 배열 선언하기

  - `int[] arr = new int[10];`

    `int arr[] = new int[10];`



#### 객체 배열

- 참조 자료형 배열
- `Book[] library = new Book[5];`



##### 향상된 for문(enhanced for)

- 배열 요소의 처음부터 끝까지 모든 요소를 참조할 때 편리한 반복문

``` java
for(변수 : 배열){
    반복 실행문;
}
```



#### 다차원 배열

- 2차원 이상의 배열
- 지도, 게임, 평면이나 공간을 구현할 때 사용
- `int\[][] arr = new int \[2][3]`



#### ArrayList 클래스

- 자바에서 제공되는 객체 배열이 구현된 클래스
- 객체 배열을 사용하는데 필요한 여러 메서드들이 구현되어 있음
- 주요 메서드

| 메서드              | 설명                                                     |
| ------------------- | -------------------------------------------------------- |
| boolean add(E e)    | 요소 하나를 배열에 추가한다. E는 요소의 자료형을 의미    |
| int size()          | 배열에 추가된 요소 전체 개수를 반환                      |
| E get(int index)    | 배열의 index 위치에 있는 요소 값을 반환                  |
| E remove(int index) | 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환 |
| boolean isEmpty     | 배열이 비어 있는지 확인                                  |



### 상속과 다형성

#### 상속

- 클래스에서 상속의 의미

  - 새로운 클래스를 정의할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능이 확장되는 클래스를 구현
  - `class B extends A`

- 상속을 사용하는 경우

  - 상위 클래스는 하위 클래스보다 일반적인 개념과 기능을 가짐

  - 하위 클래스는 상위 클래스보다 구체적인 개념과 기능을 가짐

  - ex) 사람 -> 포유류

    `class Mammal`

    `class Human extends Mammal`

  - extends 뒤에는 단 하나의 class만 사용할 수 있음

  - Java는 single inheritance만을 지원

##### 하위 클래스가 생성되는 과정

- 하위 클래스가 생성될 때 상위 클래스가 먼저 생성됨
- 상위 클래스의 생성자가 호출되고 하위 클래스의 생성자가 호출 됨
- 하위 클래스의 생성자에서는 무조건 상위 클래스의 생성자가 호출되어야 함
- 하위 클래스에서 상위 클래스의 생성자를 호출하는 코드가 없는 경우 컴파일러는 상위 클래스 기본 생성자를 호출하기 위한 `super()`를 추가함
- `super()`로 호출되는 생성자는 상위 클래스의 기본 생성자
- 만약 상위 클래스의 기본 생성자가 없는 경우(매개변수가 있는 생성자만 존재 하는 경우) 하위 클래스는 명시적으로 상위 클래스의 생성자를 호출해야 함



- 상속에서의 메모리 상태
  - 상위 클래스의 인스턴스가 먼저 생성이 되고, 하위 클래스의 인스턴스가 생성됨



##### 상속은 어네 사용할까?

- IS-A 관계(is a relationship : inheritance)

  - 일반적인(general) 개념과 구체적인(specific) 개념과의 관계
  - 상위 클래스 : 일반적인 개념 클래스(ex : 포유류)
  - 하위 클래스 : 구체적인 개념 클래스(ex : 사람, 원숭이, 고래 ...)
  - 단순히 코드를 재사용하는 목적으로 사용하지 않음

- HAS-A 관계(composition) 

  - 한 클래스가 다른 클래스를 소유한 관계

  - 코드 재사용의 한 방법

    ex) Student가 Subject를 포함한 관계



##### 상위 클래스로의 묵시적 형 변환(업캐스팅)

- 상위 클래스 형으로 변수를 선언하고 하위 클래스 인스턴스를 생성할 수 있음

- 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로 묵시적 형변환이 가능

- 상속관계에서 모든 하위 클래스는 상위 클래스로 묵시적 형 변환이 됨

  그 역(반대)은 성립하지 않음

- `Customer vc = new VIPCustomer();`

- 이러한 경우 VIPCustomer() 생성자의 호출로 인스턴스는 모두 생성 되었지만 타입이 Customer이므로 접근할 수 있는 변수나 메서드는 Customer임



- 클래스 계층구조가 여러 단계인 경우

  - Primate aHumman = new Human();

    Mammal mHuman = new Human();

  - Human은 내부적으로 상위 자료형을 모두 내포하고 있다.



#### 메서드 오버라이딩

- 하위 클래스에서 메서드를 재정의 하는것
- 오버라이딩(overriding)
  - 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의할 수 있음

##### @override 애노테이션(Annotation)

- 재정의된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러 발생
- 애노테이션은 컴파일러에게 특정한 정보를 제공해주는 역할
- 주로 사용되는 자바에서 제공되는 애노테이션

| 애노테이션           | 설명                                                         |
| -------------------- | ------------------------------------------------------------ |
| @Override            | 재정의된 메서드라는 정보 제공                                |
| @FunctionalInterface | 함수형 인터페이스라는 정보 제공                              |
| @Deprecated          | 이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용됨    |
| @SuppressWarnings    | 특정 경고가 나타나지 않도록 함<br />ex) @SuppressWarnings("deprecation")는 @Deprecated가 나타나지 않도록 함 |



- 형 변현과 옵라이딩 메서드 호출

  `Customer vs = new VIPCustomer();`

  `vc.calcPrice(10000);`

  - 위 코드에서 calcPrice() 메서드는 어느 메서드가 호출 될 것인가?

    자바에서는 항상 인스턴스(위에서는 VIPCustomer)의 메서드가 호출됨



- 가상 메서드(virtual method)
  - 메서드의 이름과 메서드 주소를 가진 가상 메서드 테이블에서 호출될 메서드의 주소를 참조



#### 다형성(ploymorphism)

- 하나의 코드가 여러 자료형으로 구현되어 실행되는 것

  같은 코드에서 여러 실행 결과가 나옴

- 정보은닉, 상소고가 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나

- 객체지향 프로그래밍의 유연성, 재활용성, 유지보수성에 기본이 되는 특징

- 다형성의 사용으로 갖는 장점

  - 다양한 여러 클래스를 하나의 자료형(상위 클래스)으로 선언하거나 형변환 하여 각 클래스가 동일한 메서드를 오버라이딩 한 경우, 하나의 코드가 다양한 구현을 실행할 수 있음
  - 유사한 클래스가 추가되는 경우 유지보수에 용이하고 각 자료형 마다 다른 메서드를 호출하지 않으므로 코드에서 많은 if문이 사라짐



#### 다운캐스팅

- 하위 클래스로 형 변환

- 묵시적으로 상위 클래스 형변환된 인스턴스가 원래 자료형(하위 클래스)으로 변환되어야 할 때 다운캐스팅이라 함

- 하위 클래스로의 형 변환은 명시적으로 되어야 함

- Customer vc = new VIPCustomer();	   => 묵시적

  VIPCustomer vCustomer = (VIPCustomer)vc;        => 명시적



### 추상 클래스

- 추상 메서드를 포함한 클래스
- 추상 메서드
  - 구현 코드가 없이 선언부만 있는 메서드
- abstract 예약어 사용
- 추상 클래스는 new(인스턴스화) 할 수 없음
- cf) concrete class
- 추상 클래스 구현

``` java
public abstrac class Computer{
    public abstract void display();
    public abstract void typing();
    ...
}
```

- 메서드와 클래스에 abstract 키워드 사용
- 추상 메서드가 포함된 클래스는 추상 클래스로 선언
- 모든 메서드가 구현되었다고 해도 클래스에 abstract 키워드를 사용하면 추상 클래스
- 보통 기울기체로 표현한다.



- 추상 클래스 사용하기

  - 추상 클래스는 주로 상속의 상위클래스로 사용됨

  - 추상 메서드 : 하위 클래스가 구현해야 하는 메서드

  - 구현된 메서드 : 하위 클래스가 공통으로 사용하는 기능의 메서드

    하위 클래스에 따라 재정의 할 수 있음



##### 템플릿 메서드

- 템플릿 : 틀이나 견본을 의미

- 템플릿 메서드 : 추상 메서드나 구현된 메서드를 활용하여 전체의 흐름(시나리오)를 정의 해 놓은 메서드

  final로 선언하여 재정의 할 수 없게 함

- 템플릿 메서드 패턴 

  - 디자인 패턴의 일종
  - 프레임 워크에서 많이 사용되는 설계 패턴
  - 추상 클래스로 선언된 상의 클래스에서 추상 메서드를 이용하여 전체 구현의 흐름을 정의하고 구체적인 각 메서드 구현은 하위 클래스에 위임
  - 하위 클래스가 다른 구현을 했다고 해서 템플릿 메서드에 정의된 시나리오 대로 수행됨

``` java
public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    
    public void startCar() {
        System.out.println("시동을 켠다");
    }
    
    public void turnOff(){
        System.out.println("시동을 끈다");
    }
    
    final public void run() {		// 이 부분이 템플릿 메서드
        startCar();
        drive();
        stop();
        turnOff();
    }
}
```



##### final 예약어

- final 변수는 값이 변경될 수 없는 상수

  `public static final double PI = 3.14;`

  오직 한 번만 값을 할당할 수 있음

- final 메서드는 하위 클래스에서 재정의(overriding)할 수 없음

- final 클래스는 더 이상 상속되지 않음

  ex) java의 String 클래스

- public static final 상수 값 정의하여 사용하기
  
  - 프로젝트 구현 시 여러 파일에서 공유해야 하는 상수 값은 하나의 파일에 선언하여 사용하면 편리

``` java
public class Define{
    public static final int MIN = 1;
    public static final int MAX = 99999;
	public static final int ENG = 1001;
    public static final int MATH = 2001;
}

public class UsingDefine{
    public static void main(String[] args){
        System.out.println("최소값은 " + Define.MIN + "입니다.");
        System.out.println("수학 과목 코드값은 " + Define.MATH + "입니다.");
        System.out.println("영어 과목 코드값은 " + Define.ENG + "입니다.");
    }
}
```

- 위와 같이 static으로 선언하여 메모리 소모를 최소화 하여 쉽게 불러올 수 있다.



##### 인터페이스

- 어떤 object에 대한 명세(어떤것을 제공할 것인가? 어떤 역할을 하는 것이다. 하는 설명서와 같은 역할)

- 인터페이스의 요소
  - 추상 메서드 : 모든 메서드는 추상 메서드
  - 상수 : 선언된 모든 변수는 상수로 처리 됨
  - 디폴트 메서드 : 기본 구현을 가지는 메서드, 구현하는 클래스에서 재정의 할 수 있음(java 8)
  - 정적 메서드 : 인스턴스 생성과 상관없이 인터페이스 타입으로 호출하는 메서드(java 8)
  - private 메서드 : 인터페이스 내에서 사용하기 위해 구현한 메서드, 구현하는 클래스에서 재정의할 수 없음(java 9)
- 인터페이스 선언과 구현

``` java
public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;			// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수(final)로 변환됨

	int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);		//인터페이스에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨
}
```

- 인터페이스를 구현한 클래스는 인터페이스 타입으로 변수를 선언하여 인스턴스를 생성할 수 있음
- 인터페이스는 구현 코드가 없기 때문에 타입 상속이라고도 함



- 인터페이스의 역할
  - 인터페이스는 클리이언트 프로그렘에 어떤 메서드를 제공하는지 알려주는 명세(specification) 또는 약속
  - 한 객체가 어떤 인터페이스의 타입이라 함은 그 인터페이스의 메서드를 구현했다는 의미
  - 클라이언트 프로그램은 실제 구현내용을 몰라도 인터페이스의 정의만 알면 그 객체를 사용할 수 있음
  - 인터페이스를 구현해 놓은 다양한 객체를 사용함 - 다형성
    - JDBC를 구현한 오라클, MSSQL 라이브러리 등
- 인터페이스와 strategy pattern
  - 인터페이스를 활용하면 다양한 정책이나 알고리즘을 프로그램의 큰 수정 없이 적용, 확장할 수 있음
- 여러개의 인터페이스 구현
  - 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스를 구현할 수 있음
  - 디폴트 메서드의 이름이 중복 ㅗ디는 경우에는 재정의 함
- 인터페이스 상속
  - 인터페이스 간에도 상속이 가능
  - 구현이 없으므로 extends 뒤에 여러 인터페이스를 상속받을 수 있음
  - 구현 내용이 없으므로 타입 상속(type inheritance)라고 함
- 인터페이스 구현과 클래스 상속 함께 사용이 가능하다.

``` java
public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) {
        shelf.add(title);		//배열에 요소 추가
    }
    
    @Override
    public String deQueue() {
        return shelf.remove(0);		//맨 처음 요소를 배열에서 삭제하고 반환
    }
    
    @Override
    public int getSize() {
        return getCount();		//배열 요소 개수 반환
    }
}
```



### Object 클래스

- 모든 클래스의 최상위 클래스
- java.lang.Object 클래스
- 모든 클래스는 Object 클래스에서 상속 받음
- 모든 클래스는 Object 클래스의 메서드를 사용할 수 있음
- 모든 클래스는 Object 클래스의 일부 메서드를 재정의 하여 사용할 수 있음



##### toString() 메서드

- `toString()` 메서드의 원형

  `getClass().getName() + '@' + Integer.toHexString(hashCode())`

- 객체의 정보를 String으로 바꾸어 사용할 때 유용함

- 자바 클래스중에는 이미 정의된 클래스가 많음

  ex) String, Integer, Calendar 등

- 많은 클래스에서 재정의하여 사용



##### equals() 메서드

- 두 객체의 동일함을 논리적으로 재정의 할 수 있음

- 물리적 동일함 : 같은 주소를 가지는 객체

  논리적 동일함 : 같은 학번의 학생, 같은 주문 번호의 주문

- 물리적으로 다른 메모리에 위치한 객체라도 논리적으로 동일함을 구현하기 위해 사용하는 메서드

``` java
Student studentLee = new Student(100, "이순신");
Student studentLee2 = studentLee;
Student studentSoon = new Student(100, "이순신");
// 물리적으로 다른 위치에 있지만 논리적으로 같은 학생임을 증명해야 함.
```



##### hashCode() 메서드

- hashCode() 메서드의 반환 값 : 인스턴스가 저장된 가상머신의 주소를 10진수로 반환
- 두 개의 서로 다른 메모리에 위치한 인스턴스가 동일하다는 것은?
  - 논리적으로 동일 : equals()의 반환값이 true
  - 동일한 hashCode 값을 가짐 : hashCode()의 반환 값이 동일



##### clone() 메서드

- 객체의 복사본을 만듦
- 기본 틀(prototype)으로 부터 같은 속성 값을 가진 객체의 복사본을 생성할 수 있음
- 객체지향 프로그램의 정보은닉에 위배되는 가능성이 있으므로 복제할 객체는 cloneable 인터페이스를 명시해야 함
  - private 까지 모두 복제하게 되므로 조심해야 함.



### Class 클래스

- 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성됨
- class 파일에는 객체의 정보(멤버변수, 메서드, 생성자 등)가 포함되어 있음
- Class클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음



##### Class 클래스 가져오기

1. `String s = new String();`

   `Class c = s.getClass();`

2. `Class c = String.Class;`

3. `Class c = Class.forName("java.lang.String");`		// 동적 로딩



##### reflection 프로그래밍

- Class 클래스로부터 객체의 정보를 가져와 프로그래밍 하는 방식
- 로컬에 객체가 없고 자료형을 알 수 없는 경우 유용한 프로그래밍
- java.lang.reflect 패키지에 있는 클래스 활용



##### newInstance() 메서드

- Class 클래스 메서드
- new 키워드를 사용하지 않고 인스턴스를 생성



##### forName() 메서드와 동적 로딩

- Class 클래스 static 메서드

- 동적 로딩이란?

  - 컴파일 시에 데이터 타입이 모두 binding되어 자료형이 로딩되는 것
  - (static loding)이 아니라 실행 중에 데이터 타입을 알고 binding 되는 방식

- 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함

- 컴파일 타임에 체크할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외

  (ClassNotFoundException)이 발생할 수 있음



##### String 클래스

- String 클래스 선언하기

- `String str1 = new String("abc");` 	//인스턴스로 생성됨

  `String str2 = "abc";`                              // 상수풀에 있는 문자열을 가리킴

- String은 immutable
  - 한번 선언되거나 생성된 문자열을 변경할 수 없음
  - String 클래스의 concat() 메서드 혹은 "+"를 이용하여 String을 연결하는 경우 문자열은 새로 생성 됨
- StringBuilder 와 StringBuffer
  - 가변적인 char[] 배열을 멤버변수라 가지고 있는 클래스
  - 문자열을 변경하거나 연결하는 경우 사용하면 편리한 클래스
  - StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(Synchronization)이 보장됨
  - 단일 쓰레드 프로그래밍에서는 StringBuilder를 사용하는 것이 더 좋음
  - toString() 메서드로 String 반환



##### Wrapper 클래스

- 기본 자료형에 대한 클래스
- boolean, byte, char, short, int, long, float, double



