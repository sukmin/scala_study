# scala study 1회
## 스터디의 목표
두꺼운책으로 빠싹하게 아는 것이 목표가 아니라, 얉고 쉬운 한권의 책을 끝까지 봐서 scala를 입문하자.

## scala란?
### 누가 만들었나?
스위스 로잔 연방 공과대학교의 마틴 오더스키(Martin Odersky)가 개발
https://en.wikipedia.org/wiki/Martin_Odersky
파스칼을 만든 니클라우스 비르트의 제자이고, Java의 제네릭 설계에 참여하였는데 이때 느꼈던 Java의 단점들을 수정하고 추후 프로그램 언어를 연구할 목적으로 개발

### scala이름의 의미는?
스칼라는 확장 가능한(scalable) 언어라는 의미로 작명되었다.
이 이름대로 scala를 확장해 도메인 특화 언어로 만들 수 있다.
또한 중의적으로 scala는 이탈리아어로 계단을 의미하는데 더 나은 프로그래밍 언어로 나아가는 계단 역할을 하는 의미도 있다고 한다.

### 도메인 특화 언어(DSL)이란?
#### 새로운 타입을 키워가기
내장 타입을 원래 있는 타입처럼 사용
#### 새로운 제어 구조 키워가기
액터 기반
### scala 로고의 의미는?
![](https://www.scala-lang.org/resources/img/smooth-spiral.png)

scala의 계단이라는 의미와, 스위스 로잔 연방 공과대학교에 있는 나선형 계단을 의미

![](http://www.scala-lang.org/old/sites/default/files/3957416434_65bffee1b6.jpg)

### scala의 특징
#### 객체지향
스칼라는 순수객체지향언어.
자바에서 이야기하는 피리미티브 타입이 없다.
모든 것은 객체.
인터페이스보다 더 뛰어난 트레이트.

#### 함수형
first class
참조투명

### scala의 장점
#### 호환성이 좋다.
스칼라는 JVM의 바이트 코드로 컴파일.
스칼라 코드로 자바 생태계의 방대한 라이브러리를 사용 가능.

#### 간결하다.
자바의 절반정도로 코드량이 줄어든다.
코드가 장황하지 않고 간결함.
타입추론

#### 고수준이다.
루프 감춤.
자바8의 람다보다 더 간결.

#### 정적타입언어다.
정적타입 vs 동적타입

### scala의 주 용도
범용언어.
자바의 대체.
분산환경에서 강함?

## scala 개발 환경 설정
### 설치
JDK8 설치

Scala 설치 2.12.2 : https://www.scala-lang.org/download/

PATH 잡기

```bash
localhost:~ naver$ scala -version
Scala code runner version 2.12.2 -- Copyright 2002-2017, LAMP/EPFL and Lightbend, Inc.
```

### REPL
읽고(Read), 평가하고(Evaluate), 출력하고(Print), 반복한다(Loop)
```bash
localhost:~ naver$ scala
Welcome to Scala 2.12.2 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_45).
Type in expressions for evaluation. Or try :help.

scala>
```

## Hello World(REPL)
```scala
scala> println("Hello, World")
Hello, World

scala>
```

## Hello World(인텔리j에서)
```scala
package io.umon.scala

object Main {
  def main(args: Array[String]): Unit = {
    print("안녕!!")
  }
}

```

## 변수
### var
variable
```scala
package io.umon.scala

object Main {
  def main(args: Array[String]): Unit = {
    var hello: String = "안녕"
    var number: Int = 1
    println(hello + " , " + number)

    hello = "배고파"
    number = 2
    println(s"${hello} , ${number}")

    var anotherHello = "하이"
    var anotherNumber = 9999
    println(s"${anotherHello} , ${anotherNumber}")
  }
}
```

### val
value
```scala
package io.umon.scala

object Main {
  def main(args: Array[String]): Unit = {

    val document =
"""안녕
ㅡㅡ
아오
아오아오아오
ㅠㅠ
"""
    println(document)

    val anotherDocument =
      """안녕
        |ㅡㅡ
        |아오
        |아오아오아오
        |ㅠㅠ
      """.stripMargin
    println(anotherDocument)
  }
}
```

#### 이런 상황에서는?

```scala
package io.umon.scala

object Main {
  def main(args: Array[String]): Unit = {

    var a = "한조";
    val b = a;
    println(a)
    a = "겐지";
    println(a)
    println(b)

  }
}

```

```scala
package io.umon.scala

case class Food(var name: String, var price: Int)

object Main {

  def main(args: Array[String]): Unit = {

    var coffee = Food("커피", 3000)
    val copyCoffee = coffee
    println(coffee)
    copyCoffee.price = 2000
    println(coffee)
    println(copyCoffee)

  }
}


```

### 자료형
모든 것은 객체.

일단 자바의 프리미티브 래퍼 클래스는 다 있다.(Integer의 경우에만 Int)

![](https://www.scala-exercises.org/assets/scala_tutorial/scala_type_hierarchy.png)

## 조건문

## 반복문

## 참고
https://en.wikipedia.org/wiki/Martin_Odersky
https://namu.wiki/w/Scala
