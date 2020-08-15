# Springboot



#### 3-tier Architecture

1. Presentation : 사용자와 소통하는 부분 : front-end
2. Business : 사용자와 소통한 결과 : back-end
3. Data Source : 처리한 것들이 저장되는 공간 : Database



#### Layered Architecture

1. UI Layer
2. Application Layer
3. Domain Layer
4. Infrastructure Layer

- 위의 Layer는 아래의 Layer를 사용할 수 있지만 아래의 Layer는 위의 Layer를 사용할 수 없다.
- 이처럼 사용하는 이유는 프로그램의 복잡도를 낮추기 위함



## 프로젝트 생성

### Spring Initializr

1. Spring.io 사이트에 접속 후 project에 있는 springboot 메뉴 선택

2. Quick start 의 Spring Initializr

3. Gradle Projec, Java, 최적화 되어있는 버전 등 선택 후 아래 정보 입력

4. Artifact는 보통 프로젝트 이름

5. Dependencies 가 가장 중요한데 사용할 것들을 작성한다.

   Spring Web Starter(Spring Web)

   Spring Boot DevTools

   Lombok(도메인 모델들을 코드를 적게 작성하기 위함)

6. 모두 작성하면 Generate 클릭 -> 프로젝트 파일이 다운받아진다.



### Test Driven Development(TDD)

- 테스트 주도 개발(목표 주도 개발, 사용자 중심 개발, 인터페이스 중심 개발)
- Red, Green, Refactoring 의 3가지 과정을 통해 제작

![image](https://user-images.githubusercontent.com/58559786/90196536-05b35e80-de07-11ea-8385-7cc419f29c8d.png)



### Rest API

- REpresentational State Transfer
- CRUD
  - Create - Post
  - Read - Get
  - Update - Put/Patch
  - Delete - Delete
- URI / URL
- Resource 분류
  - Collection : 여러개(Read(List), Create)
  - Member : 그 안에 속한 개별적인 리소스 (Read(Detail), Update, Delete)







