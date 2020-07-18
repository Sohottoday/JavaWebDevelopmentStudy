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

