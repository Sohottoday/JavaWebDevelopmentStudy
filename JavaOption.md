# Java 옵션들



### 내부 클래스

- 클래스 내부에 구현한 클래스(중첩된 클래스)
- 클래스 내부에서 사용하기 위해 선언하고 구현하는 클래스
- 주로 외부 클래스 생성자에서 내부 클래스를 생성

- 내부 클래스 유형

| 종류                 | 구현 위치                                         | 사용할 수 있는 외부 클래스 변수        | 생성 방법                                                    |
| -------------------- | ------------------------------------------------- | -------------------------------------- | ------------------------------------------------------------ |
| 인스턴스 내부 클래스 | 외부 클래스 멤버 변수와 동일                      | 외부 인스턴스 변수<br />외부 전역 변수 | 외부 클래스를 먼저 만든 후 내부 클래스 생성                  |
| 정적 내부 클래스     | 외부 클래스 멤버 변수와 동일                      | 외부 전역 변수                         | 외부 클래스와 무관하게 생성                                  |
| 지역 내부 클래스     | 메서드 내부에 구현                                | 외부 인스턴스 변수<br />외부 전역 변수 | 메서드를 호출할 때 생성                                      |
| 익명 내부 클래스     | 메서드 내부에 구현<br />변수에 대입하여 직접 구현 | 외부 인스턴스 변수<br />외부 전역 변수 | 메서드를 호출할 때 생성되거나, 인터페이스 타입변수에 대입할 때 new 예약어를 사용하여 생성 |



### 람다식

- 자바에서 함수형 프로그래밍(functional programming)을 구현하는 방식
- 클래스를 생성하지 않고 함수의 호출만으로 기능을 수행
- 함수형 인터페이스를 선언
- 자바 8부터 지원되는 기능



- 함수형 프로그래밍이란?
  - 순수 함수(pure function)를 구현하고 호출
  - 매개변수만을 사용하도록 만든 함수로 외부 자료에 부수적인 영향(side effect)가 발생하지 않도록 함
  - 입력 받은 자료를 기반으로 수행되고 외부에 영향을 미치지 않으므로 병렬처리 등에 가능
  - 안정적적인 확장성 있는 프로그래밍 방식



- 람다식 문법
  - 매개 변수 하나인 경우 괄호 생략 가능( 두개인 경우는 괄호를 생략할 수 없음)
    - `str -> {System.out.println(str);}`
  - 중괄호 안의 구현부가 한 문장인 경우 중괄호 생략
    - `str -> System.out.println(str);`
  - 중괄호 안의 구현부가 한 문장이라도 return문은 중괄호를 생략할 수 없음
    - `str -> return str.length();`        // 오류
  - 중괄호 안의 구현부가 반환문 하나라면 return과 중괄호를 모두 생략할 수 있음
    - `(x, y) -> x+y`        // 두 값을 더하여 반환
    - `str -> str.length()`        // 문자열 길이를 반환
- 함수를 변수처럼 사용하는 람다식
  - 프로그램에서 변수는
    - 자료형에 기반하여 선언하고 `int a;`
    - 매개변수로 전달하고 `int add(int x, int y);`
    - 메서드의 반환 값으로 사용 `return num;`
  - 람다식은 프로그램 내애서 변수처럼 사용할 수 있음



### 스트림(Stream)

- 자료의 대상과 관계없이 동일한 연산을 수행할 수 있는 기능(자료의 추상화)
- 배열, 컬렉션에 동일한 연산이 수행되어 일관성 있는 처리 가능
- 한번 생성하고 사용한 스트림은 재사용할 수 없음
- 스트림 연산은 기존 자료를 변경하지 않음
- 중간 연산과 최종 연산으로 구분 됨
- 최종 연산이 수행되어야 모든 연산이 적용되는 지연 연산



- 스트림 연산 - 중간 연산

  - 중간 연산 - filter(), map()

  - 조건에 맞는 요소를 추출(filter()) 하거나 요소를 변환 함(map())

  - 문자열의 길이가 5 이상인 요소만 출력 하기

    `sList.stream().filter(s -> s.length() >=5).forEach(s -> System.out.println(s));`

    ​        스트림 생성                      중간 연산                                                 최종 연산

  - 고객 클래스에서 고객 이름만 가져오기

    `customerList.stream().map(c -> c.getName()).forEach( s -> System.out.println(s));`

    ​         스트림 생성                                  중간 연산                                       최종 연산

- 스트림 연산 - 최종 연산

  - 스트림의 자료를 소모 하면서 연산을 수행

  - 최종 연산 후에 스트림은 더 이상 연산을 적용할 수 없음

  - forEach() : 요소를 하나씩 거내 옴

    count() : 요소의 개수

    sum() : 요소의 합

    이 외에 여러가지 최종연산이 있음

- reduce() 연산

  - 정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용

  - 최종 연산으로 스트림의 요소를 소모하며 연산 수행

  - 배열의 모든 요소의 합을 구하는 reduce() 연산

    `Arrays.stream(arr).reduce(0, (a, b) -> a + b);`

    ​                                                   초기값 0     전달되는 요소 a, b   각 요소가 수행해야 할 기능 a + b

  - 두번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행



### 예외 처리

- 오류란 무엇인가?
  - 컴파일 오류 : 프로그램 코드 작성 중 발생하는 문법적 오류
  - 실행 오류 : 실행 중인 프로그램이 의도 하지 않은 동작을 하거나(bug) 프로그램이 중지 되는 오류(runtime error)
- 자바는 예외 처리를 통하여 프로그램의 비정상 종료를 막고 log를 남길 수 있음

- 오류와 예외 클래스

  - 시스템 오류(error) : 가상 머신에서 발생, 프로그래머가 처리 할 수 없음

    동적 메모리를 다 사용한 경우 , stack over flow 등

  - 예외(Exception) : 프로그램에서 제어할 수 있는 오류

    읽으려는 파일이 없는 경우, 네트워크나 소켓 연결 오류 등

    자바 프로그램에서는 예외에 대한 처리를 수행

- 예외 클래스
  - 모든 예외 클래스의 최상위 클래스는 Exception 클래스
    - 입출력 예외 처리 (IOException) - FileNotFoundException, SocketException
    - 실행 오류 예외 처리(RuntimeException) - ArithmeticException, IndexOutofBoundsException
- try - catch 문으로 예외 처리 하기

``` java
try {
    예외가 발생 할 수 있는 코드 부분
} catch(처리할 예외 타입 e) {
    try 블록 안에서 예외가 발생했을 때 수행되는 부분
}
```

- try - catch - finally 문으로 예외 처리 하기

``` java
try {
    예외가 발생할 수 있는 코드 부분
} catch(처리할 예외 타입 e) {
    try 블록 안에서 예외가 발생했을 때 수행되는 부분
} finally {
    예외 발생 여부와 상관 없이 항상 수행 되는 부분
        리소스를 정리하는 코드를 주로 씀
}
```

- try - with - resources 문
  - 리소스를 자동으로 해체 하도록 제공해주는 구문
  - 해당 리소스가 AutoCloseable을 구현한 경우 close()를 명시적으로 호출하지 않아도 try{} 블록에서 오픈된 리소스는 정산적인 경우나 예외가 발생한 경우 모두 자동으로 close()가 호출 됨
  - 자바 7부터 제공 ㅗ딤
  - FileInputStream 의 경우 AutoCloseable을 구현하고 있음

- AutoCloseable 인터페이스 사용하기
  - AutoCloseable 인터페이스를 구현한 클래스를 만들고 close()가 잘 호출되는지 확인해본다

``` java
public class AutoCloseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
```

- 향상된 try - with - resources 문

  - 자바 9에서 제공되는 구문

  - 자바 9 이전

  ``` java
  AutoCloseObj obj = new AutoCloseObj();
  try(AutoCloseObj obj2 = obj)
      throw new Exception();
  } catch(Exception e) {
      System.out.println("예외 부분");
  }
  ```

  - 자바 9 이후

  ``` java
  AutoCloseObj obj = new AutoCloseObj();
  try(obj) {			// 외부에서 선언한 변수를 그대로 쓸 수 있음
      throw new Exception();
  } catch(Exception e) {
      System.out.println("예외 부분");
  }
  ```



- 예외 처리 미루기
  - throws를 사용하여 예외 처리 미루기
  - try{} 블록으로 예외를 처리하지 않고, 메서드 선언부에 throws를 추가
  - 예외가 발생한 메서드에서 예외 처리를 하지 않고 이 메서드를 호출한 곳에서 예외 처리를 한다는 의미
  - main() 에서 throws를 사용하면 가상머신에서 처리 됨

- 다중 예외 처리하기

  - 하나의 try{} 블록에서 여러 예외가 발생하는 경우 catch{} 블록 한곳에서 처리하거나 여러 catch{} 블록으로 나누어 처리할 수 있음
  - 가장 최상위 클래스인 Exception 클래스는 가장 마지막 블록에 위치해야 함

- 사용자 정의 예외

  - JDK에서 제공되는 예외 클래스 외에 사용자가 필요에 의해 예외 클래스를 정의하여 사용
  - 기존 JDK 클래스에서 상속받아 예외 클래스를 만듬

  ``` JAVA
  public class IDFormatException extends Exception {
      public IDFormatException(String message){		// 생성자의 매개변수로 예외 상황 메시지를 받음
          super(message);
      }
  }
  ```

- throw 키워드로 예외를 발생 시킴



### 자바 입출력

#### 입출력 스트림

- 네트워크에서 자료의 흐름이 물과 같다는 의미에서 유래
- 다양한 입출력 당치에 독립적으로 일관성 있는 입출력 방식 제공
- 입출력이 구현 되는 곳에서 모두 I/O 스트림을 사용 : 키보드, 파일 디스크, 메모리 등

- 입출력 스트림 구분
  - I/O 대상 기준 : 입력 스트림, 출력 스트림
  - 자료의 종류 : 바이트 스트림, 문자 스트림
  - 스트림의 기능 : 기반 스트림, 보조 스트림
  - 입출력을 동시에 하는 스트림은 존재하지 않는다.

- 입출력 스트림과 출력 스트림

  - 입력 스트림 : 대상으로부터 자료를 읽어들이는 스트림
  - 출력 스트림 : 대상으로 자료를 출력하는 스트림
  - 스트림의 예
    - 입력 스트림 : FileInputStream, FileReader, BufferedInputStream, BufferedReader 등
    - 출력 스트림 : FileOutputStream, FileWriter, BufferedOutputStream, BufferedWriter 등

- 바이트 단위 스트림과 문자 단위 스트림

  - 바이트 단위 스트림 : 바이트 단위로 자료를 읽고 씀(동영상, 음악파일 등)
  - 문자 단위 스트림 : 문자는 2바이트씩 처리 해야 함
  - 스트림의 예
    - 바이트 스트림 : FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream 등
    - 문자 스트림 : FileReader, FileWriter, BufferedReader, BufferedWriter 등

- 기반 스트림과 보조 스트림

  - 기반 스트림 : 대상에 직접 자료를 읽고 쓰는 기능의 스트림

  - 보조 스트림 : 직접 읽고 쓰는 기능은 없고 추가적인 기능을 제공해주는 스트림

    ​						기반 스트림이나 또 다른 보조 스트림을 생성자의 매개변수로 포함

  - 스트림의 예

    - 기반 스트림 : FileInputStream, FileOutputStream, FileReader, FileWriter 등
    - 보조 스트림 : InputStreamReader, OutputStreamWriter, BufferedInputStream, BufferedOutputStream 등



#### 표준 입출력

- System 클래스의 표준 입출력 멤버

``` java
public class System{
    public static PrintStream out;		// 표준 출력 스트림
    public static InputStream in;		// 표준 입력 스트림
    public static PrintStream err;		// 표준 에러 스트림
}
```

- System.in 사용하여 입력 받기
  - 한 바이트씩 읽어 들임
  - 한글과 같은 여러 바이트로 된 문자를 읽기 위해서는 InputStreamReader와 같은 보조 스트림을 사용해야 함

- Scanner 클래스
  - java.util 패키지에 있는 입력 클래스
  - 문자뿐 아니라 정수, 실수 등 다양한 자료형을 읽을 수 있음
  - 생성자가 다양하여 여러 소스로부터 자료를 읽을 수 있음
    - Scanner(File source) : 파일을 매개변수로 받아 Scanner를 생성
    - Scanner(InputStream source) : 바이트 스트림을 매개변수로 받아 Scanner를 생성
    - Scanner(String source) : String을 매개변수로 받아 Scanner를 생성

- Console 클래스
  - System.in을 사용하지 않고 콘솔에서 표준 입출력이 가능
  - 이클립스와 연동 X
  - Console 클래스의 메서드
    - `String readLine()` : 문자열 읽음
    - `char[] readPassword()` : 사용자에게 문자열을 보여주지 않고 읽음
    - `Reader reader()` : Reader클래스를 반환
    - `PrintWriter writer()` : PrintWriter 클래스를 반환



#### 바이트 단위 스트림

- InputStream : 바이트 단위 입력 스트림 최상위 클래스

  OutputStream : 바이트 단위 출력 스트림 최상위 클래스

- 추상 메서드를 포함한 추상 클래스로 하위 클래스가 구현하여 사용

- 주요 하위 클래스

  - FileInputStream : 파일에서 바이트 단위로 자료를 읽습니다.
  - ByteArrayInputStream : Byte 배열 메모리에서 바이트 단위로 자료를 읽습니다.
  - FileInputStream : 기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
  - FileOutputStream : 바이트 단위로 파일에 자료를 씁니다.
  - ByteArrayOutputStream : Byte 배열에 바이트 단위로 자료를 씁니다.
  - FileOutputStream : 기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스

- FileInputStream과 FileOutputStream 사용하기
  - 파일에 한 바이트씩 자료를 읽고 쓰는데 사용(한 바이트씩이므로 문자 X)
  - 입력 스트림은 파일이 없는 경우 예외 발생
  - 출력 스트림은 파일이 없는 경우 파일 생성하여 출력



#### 문자 단위 스트림

- Reader : 문자 단위로 읽는 최상위 스트림
- Writer : 문자 단위로 쓰는 최상위 스트림
- 추상 메서드를 포함한 추상 클래스로 하위 클래스가 상속받아 구현
- 하위 클래스
  - FileReader : 파일에서 문자 단위로 읽는 스트림 클래스
  - InputStreamReader : 바이트 단위로 읽은 자료를 문자로 변환해 주는 보조 스트림 클래스
  - BufferedReader : 문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공해 주는 보조 스트림
  - FileWriter : 파일에 문자 단위로 출력하는 스트림 클래스
  - OutputStreamWriter : 파일에 바이트 단위로 출력한 자료를 문자로 변환해 주는 보조 스트림
  - BufferedWriter : 문자로 쓸 때 배열을 제공하여 한꺼번에 쓸 수 있는 기능을 제공해 주는 보조 스트림
- FileReader와 FileWriter
  - 파일에 문자를 읽고 쓸 때 가장 많이 사용하는 클래스
  - 문자의 인코딩 방식을 지정할 수 있음





