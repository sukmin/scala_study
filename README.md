## 스터디의 목표
scala 입문

## scala란?

### 프로그래밍 언어의 발전 방향
| 신문물 | 등장배경 |
| ---- | ----- |
| 어셈블리어 | 0과 1로만 코딩하기 너무 힘들어서 |
| 고급언어(C 등등) | 어셈블리어로 코딩하니까 여러 머신에 탑재가 힘듬 |
| 객체지향(Java 등등) | C같은 절차지향적으로 짜니까 프로그램 유지보수가 너무 힘듬 |
| 객체지향 + 함수형 | 요즘 기본으로 멀티코어, 멀티쓰레드인데 객체지향만으로는 모든  자원을 활용하기 너무 힘듬 |

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
- first class
- 참조투명.(Java에서 String.raplcce)

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
정적타입언어 vs 동적타입언어
- 프로퍼티 검증
- 문서화
- 리팩토링

### scala의 주 용도
범용언어.
자바의 대체.
분산환경에서 강함? 스파크, 카프카 같은 놈들이 다 scala로 작성되어 있음.

### 브루스 테이트의 세븐 랭귀지
- 객체지향 세계 <---> 자바 <---> 스칼라 <---> 하스켈 <---> 함수형 세계
- 새로운 패러다임이 등장할때 나오는 언어는 한가지가 아니다.
- 새로운 패러다임에서 처음 나온 언어들은 놀라울 정도로 생산성(?)이 좋지만 현실성이 부족하다. ( 객체지향에서의 스몰토크, 함수형에서의 리스프 )
- 기존 패러다임의 언어들이 새로운 패러다임의 언어를 보고 흡수하여 새 언어를 만든다. ( 절차형 언어에서 객체지향으로 진화한 에이다 C++ )
- 그 후 상업적으로 수용되는 혼합형 언어가 등장 ( 자바, C# )
- 최후에는 새로운 패러다임을 순수하게 구현하는 성숙한 언어 등장

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

- 최상위 클래스 Any ( http://www.scala-lang.org/api/2.7.2/scala/Any.html )

#### AnyVal
- 값 클래스의 조상
- 리터럴로 생성 가능
- new 키워드로 생성 불가
- 값 클래스끼리는 평등. 이게 무슨 말이냐면 

#### AnyRef
- 참조 클래스의 조상
- Java의 Object와 동일하다고 생각하면 일단 OK!

#### 스코프
- 자바와 거의 같다고 보면 되는데,,
- 바깥 스코프에 있는 변수와 같은 이름을 다시 선언 가능하는건 차이점
```scala
package io.umon.scala

case class Food(var name: String, var price: Int)

object Main {

  def main(args: Array[String]): Unit = {

    val a = 1;
      {
        val a = 2;
        println(a);
      }
    println(a);

  }
}



```
## 내장제어구문
- scala는 뭔가 값을 내려주는 것을 좋아함.
- 프로그램 전체를 값을 계산하는 관점에서 바라보고 프로그램 구성 요소 또한 값을 도출해야한다는 함수 언어적 접근을 채용한 결과

### if문
- if 잘 아시죠? 우리가 아는 그 if..
- scala의 if표현식은 값을 리턴
```scala
package io.umon.scala

case class Food(var name: String, var price: Int)

object Main {

  def main(args: Array[String]): Unit = {

    println(if (1 == 1) {
      "안녕"
    });

    var fileName = "default.txt"
    if (!args.isEmpty) {
      fileName = args(0)
    }
    println(fileName)

    val anotherFileName = if (1 == 2) {
      "1==2.txt"
    } else if (args.isEmpty) {
      "isEmpty.txt"
    } else {
      args(0)
    }
    println(anotherFileName)


  }
}

```

### while문
- while 잘 아시죠? 우리가 아는 그 while..
- 주의해야할 것. Java는 할당의 결과는 할당한 값이지만, scala는 Unit값인 ()다. 즉 아래 코드는 무한루프.
```scala
var line = ""
while((line = readLine()) != "") {
  println("Read: " + line)
}
```
- 스칼라는 루프문을 싫어함. 함수형언어에서는 문제를 재귀로 해결하지 루프로 해결하지 않기 때문에

### for표현식
- 다양한 방식으로 활용 가능
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    // 컬렉션 이터레이션
    var arr = Array(101, 202, 303, 404)
    for (num <- arr) {
      println(num);
    }

    for (i <- 0 to 4) {
      println(i)
    }

    for (i <- 0 until 4) {
      println(i)
    }

    // 필터링
    for (num <- arr if num % 2 == 0 if num != 202) {
      println(num)
    }

    for (num <- arr if num % 2 == 0) {
      println(num)
    }

    // 중첩 이터레이션
    for (i <- 0 to 3) {
      for (j <- 0 to 3) {
        println(i + " : " + j)
      }
    }

    for (i <- 0 to 3; j <- 0 to 3) {
      println(i + " : " + j)
    }

    for {i <- 0 to 3; j <- 0 to 3} {
      println(i + " : " + j)
    }

    // for 절 yield 본문
    val iResult = for (i <- 0 to 3) yield {
      i
    }
    println(iResult)

    // by
    for (i <- 0 to 400 by 100) {
      println(i)
    }

  }
}

```

### match
- switch case보다 조금 더 진화한 것
- continue break는 기본적으로 없음
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    val currnetLocation = "가산"
    currnetLocation match {
      case "가산" => println("좋아")
      case "서현" => println("싫어")
      case _ => println("퇴사")
    }


    val anotherLocation = currnetLocation match {
      case "가산" => "좋아"
      case "서현" => "싫어"
      case _ => "퇴사"
    }
    println(anotherLocation)


  }
}

```

## 클래스
- 객체에 대한 청사진
- 멤버(필드, 메소드)를 가진다.
- 필드에 private를 붙이면 외부에서 접근 불가능.(자바와 다르게 기본으로 public)
- 메소드에 전달되는 파라미터는 val이다.
- 메소드를 한 값을 계산하는 표현식인 것처럼 생각해야 한다. 계산한 값이 바로 메소드의 리턴값.(이러한 철학을 가지면 메소드를 작은 규모로 유지할 수 있음)
- 메소드를 정의할때 타입추론에 의해 굳이 반환타입을 안남겨도 되는데, 그러면 메소드를 사용하는 사람도 머릿속으로 타입추론을 해야하기에 이왕이면 타입을 남겨주자.
- 메소드 vs 프로시저. 프로시저는 결과타입이 Unit인 메소드로 부수효과를 위해 실행. 부수효과는 메소드 밖에 있는 상태를 변경하거나, IO를 하거나...

```scala
package io.umon.scala


class User(userName: String) {
  var age = 20
  var sex = 'M'
  val name = userName
}

object Gasan {
  def state(): String = {
    "안녕"
  }
}

object Main {

  def main(args: Array[String]): Unit = {

    val aUser = new User("aUser")
    println(aUser.name)

    println(Gasan state)

  }
}

```

## 싱글톤 객체


## 상속
```scala
package io.umon.scala


class Duck(duckName: String) {
  val sayName = duckName
}

class FireDuck(duckName: String, age: Int) extends Duck(duckName){
  val sayAge = age
}



object Main {

  def main(args: Array[String]): Unit = {

    val testDuck = new FireDuck("testDuck",30)
    println(testDuck.sayAge)
    println(testDuck.sayName)

  }
}

```

## 트레이트
- 특성이란 뜻
- Java의 인터페이스에 대응
- 변수 추가 가능
- 로직 추가 가능
```scala
package io.umon.scala


trait Swimming {
  def swim = println("수영합니다.")
}

trait Flying {
  def fly = println("납니다.")
}

trait Running {
  def run = println("달립니다.")
}

//미구현
trait Eating {
  def eat
}

class Animal extends Flying with Swimming

class Pig extends Eating with Running{
  override def eat: Unit = println("쩝쩝")
}

object Main {

  def main(args: Array[String]): Unit = {

    val myAnimal = new Animal
    myAnimal.swim
    myAnimal.fly

    val myPig = new Pig
    myPig.eat
  }
}

```

```scala
package io.umon.scala


trait Weapon{
  def shoot = "뿅뿅"
}

trait M16 extends Weapon{
  override def shoot = "빵야"
}

trait Bazooka  extends Weapon {
  override def shoot = "뿌왕뿌왕"
}

trait Daepodong  extends Weapon {
  override def shoot = super.shoot + "콰르르르릉"
}

class Robot extends Weapon with M16 with Bazooka with Daepodong

object Main {

  def main(args: Array[String]): Unit = {

    val roooobot = new Robot
    println(roooobot.shoot)
  }
}

```

## 함수 
- 병렬처리를 위해 
- f(x) = y  이게 안되서 오류 찾기 너무 어려운거다. 
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {
    println(sum(1, 2))
    println(minus(1, 2))
    println("start :" + isVoid() + ": end")
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def minus(a: Int, b: Int) = {
    a - b
  }

  def isVoid(): Unit = {
    println("isVoid")
  }

}



```

### call by name 

```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int): Int = {
    println("탑승수속을 시작합니다")
    n
  }

  def dropship(n: Int) = {
    println("드랍쉽 준비합니다.")
    println(n + "명 탑승 완료")
  }


}
```
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int): Int = {
    println("탑승수속을 시작합니다")
    n
  }

  def dropship(n: => Int) = {
    println("드랍쉽 준비합니다.")
    println(n + "명 탑승 완료")
  }


}



```

```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {
    val g1 = f _
    println(g1(3))

    val g2: (Int => Int) = f
    println(g2(3))

    val g3 = (i: Int) => i
    println(g3(3))
  }

  def f(i: Int): Int = i

}



```

### 디폴트값
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {
    println(myFunction())
    println(myFunction(1,2))
  }

  def myFunction(a: Int = 4, b: Int = 5): Int = a + b

}



```

### apply
```scala
package io.umon.scala


class SomeClass {

  def apply(i: Int) = println(i)

}

object Main {

  def main(args: Array[String]): Unit = {
    val some = new SomeClass
    some(333)
  }

}

```

### implict (암시적인, 암묵적인)
```scala
package io.umon.scala


class Dog(dogName: String) {
  val name = dogName + " 왈왈!"
}



object Main {

  def main(args: Array[String]): Unit = {


    val test = "밤비"
    println(convert(test).name)

  }

  def convert(dogName: String): Dog = {
    new Dog(dogName)
  }

}

```

```scala
package io.umon.scala


class Dog(dogName: String) {
  val name = dogName + " 왈왈!"
}



object Main {

  def main(args: Array[String]): Unit = {


    val test = "밤비"
    println(test.name)

  }

implicit def convert(dogName: String): Dog = {
    new Dog(dogName)
  }

}
```

## 컬렉션

### 배열
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    var array1: Array[Int] = new Array[Int](10)
    var array2 = new Array[Int](10)

    // apply에 대해 입을 털고...
    var array3 = Array(555, 777)
    println(array3(0));

    for (x <- array3) {
      println(x)
    }

    var array4 = Array(
      Array(1, 2, 3),
      Array(4, 5, 6),
      Array(7, 8, 9)
    )
    println(array4(2)(0))

    var array5 = Array(3.14, "한조", "겐지", 256)
    for (x <- array5) {
      println(x)
    }

  }
}

```

### 리스트
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    // new를 써서 만들지 않는다.
    var list1 = List()

    var list2: List[String] = List("Z", "B", "C", "A");
    println(list2(2))

    var list3 = List(99, 999, 999)
    println(list3(1))

    var list4 = List("aa", 999, 3.4444)

    var list5 = "멍" :: "멍멍" :: "멍멍멍" :: Nil
    println(list5)

    println("concat")
    println("list2 ++ list3")
    var list6 = list2 ++ list3
    println(list6)

    println("concat")
    println("list2 ::: list3")
    var list7 = list2 ::: list3
    println(list7)

    println("reverse")
    println(list7.reverse)

    println("max")
    println(list3)
    println(list3.max)

    println("min")
    println(list3)
    println(list3.min)

    println("sum")
    println(list3)
    println(list3.sum)

    println("mkString")
    println(list7.mkString(";;;;;;"))

    println("exists")
    println(list3.exists(a => a > 3))
    println(list3.exists(_ > 3))

    println("contains")
    println(list3.contains(999))

    println("isEmpty")
    println(list3.isEmpty)

    println("distinct")
    var list8 = list4 ++ list7
    println(list8)
    println(list8.distinct)

    println("head")
    println(list2.head)

    println("tail")
    println(list2.tail)

    println("last")
    println(list2.last)

    println("init")
    println(list2.init)

  }
}

```

### 맵
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    // new를 써서 만들지 않는다.
    val map1 = Map()

    //val map2[String, Int] = Map()

    var map3 = Map(
      "멍멍" -> "개",
      "냐옹" -> "고양이",
      "꿀꿀" -> "돼지"
    )
    println(map3("멍멍"))
    println(map3.keys)
    println(map3.values)
    println(map3.isEmpty)

    map3 += ("멍멍" -> "강아지")
    println(map3("멍멍"))
    println(map3.get("멍멍"))

    map3 -= "멍멍"
    //println(map3("멍멍"))
    println(map3.get("멍멍"))

  }
}

```

### 집합(Set)
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    // new를 써서 만들지 않는다.
    var withGod = Set(
      "진기한",
      "김자홍",
      "강림도령"
    )
    println(withGod)

    withGod += "염라대왕"
    println(withGod)

    withGod -= "강림도령"
    println(withGod)

    println(withGod("염라대왕"))
    println(withGod("강림도령"))

 }
}

```

### 튜플
- 데이터 묶음
- 뭔가 의미있는 데이터를 묶기 위함.
- 어떤 함수에 리턴값을 여러개 넘겨주고 싶은 경우 튜플을 이용
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    var myTuple1 = ("진기한", "김자홍")
    println(myTuple1)
    println(myTuple1._1)
    println(myTuple1._2)
    println(myTuple1.swap)

    var myTuple2 = ("강림도령","해원맥","덕춘")
    println(myTuple2)
    println(myTuple2._3)
    
 }
}

```

### 옵션
- Some, None 두 종류가 있음
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    var animal = Map(
      1 -> "멍멍이",
      2 -> "냐옹이",
      3 -> "꿀꿀이"
    )

    val one = animal.get(1)
    val two = animal.get(2)
    val four = animal.get(4)

    println(one)
    println(two)
    println(one.get)
    println(four.getOrElse("값이 없다"))

 }
}

```
## 함수 컴비네이터
- java8에 익숙한 분들은 쉽다능
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    var number = List(1, 2, 3, 4)

    println(number.map(_ * 10))
    println(number.map(a => a * 10))

    // 부수 효과 작업
    number.foreach(a => println(a))

    println(number.filter(_ % 2 == 0))
    println(number.filterNot(_ % 2 == 0))

    println(number.foldLeft(0)((i, j) => i + j))
    println(number.foldRight(0)((i, j) => i + j))

    println(number.partition(_ % 2 == 0))

    var anotherNumber = List(5, 6, 7, 8)
    println(number.zip(anotherNumber))
    println(number.zip(anotherNumber).unzip)

    println(number.find(_ == 2))

    println(number.drop(2))

    println(number.dropWhile( a => a <= 3))

    var otherNumber = List(number, anotherNumber)
    println(otherNumber)
    println(otherNumber.flatten)

  }
}

```
## 기타
### 사용자 입력
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

      println("값을 입력하세요.")
      var a = scala.io.StdIn.readLine()
      println("입력한 값은 " + a)

  }
}

```

### 아이더(either)
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    var input = scala.io.StdIn.readLine()

    val result: Either[String, Int] = try {
      Right(input.toInt)
    } catch {
      case e: Exception => Left(input)
    }
    println(result.getClass)

  }
}

```

## 함수형 객체(분수 클래스 만들어보기)

### 1단계 : 가장 간단한게 만들어보기
```scala
// 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int)
```

### 2단계 : toString 오버라이드 해보기
```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {
    // toString 오버라이드
    override def toString: String = n + "/" + d
  }
```

### 3단계 : 분모가 0인 경우 방어하기
```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require( d != 0)

    // toString 오버라이드
    override def toString: String = n + "/" + d
  }
```
- 스칼라는 기본적으로 java.lang과 scala패키지의 멤버를 암시적으로 임포트.
- scala 패키지의 Predef라는 싱글톤 객체의 멤버도 항상 임포트하는데, 유용한 것들이 많음. println 등등

### 4단계 : 덧셈 만들어보기
```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    // toString 오버라이드
    override def toString: String = n + "/" + d

    def add(another: Rational): Rational =
      new Rational((n * another.d) + (another.n * d), d * another.d)
  }
```

```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    val numer : Int = n
    val denom: Int = d

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def add(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)
  }
```

### 5단계 : lessThan, max 만들어보기(this사용)
```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    val numer: Int = n
    val denom: Int = d

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def add(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this
  }
```

###  6단계 : 보조생성자 추가
```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    val numer: Int = n
    val denom: Int = d

    // 보조생성자. 보조생성자는 항상 this(...)로 시작. 모든 보조생성자는 결국 주 생성자로 통한다.
    def this(n: Int) = this(n, 1)

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def add(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this
  }

```

### 7단계 : 약분해보기(private 사용)
```scala
  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    // 외부에 노출하기 싫으니까 private
    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    // 보조생성자. 보조생성자는 항상 this(...)로 시작. 모든 보조생성자는 결국 주 생성자로 통한다.
    def this(n: Int) = this(n, 1)

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def add(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this

    // 최대공약수
    private def gcd(a: Int, b: Int): Int =
      if (b == 0)
        a
      else
        gcd(b, a % b)
  }
```

### 8단계 : 연산자 정의
```scala
package io.umon.scala

object Main {

  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    // 외부에 노출하기 싫으니까 private
    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    // 보조생성자. 보조생성자는 항상 this(...)로 시작. 모든 보조생성자는 결국 주 생성자로 통한다.
    def this(n: Int) = this(n, 1)

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def +(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    def *(another: Rational): Rational =
      new Rational(numer * another.numer, denom * another.denom)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this

    // 최대공약수
    private def gcd(a: Int, b: Int): Int =
      if (b == 0)
        a
      else
        gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {

    val x = new Rational(1, 2)
    val y = new Rational(2, 3)

    println(x + x * y)
    println((x + x) * y)
    println(x + (x * y))

  }

}

```
- 연산자사이에 우선순위는 메소드의 첫글자를 보고 정해진다. 예를 들어, 이름이 *로 시작하는 메소드의 우선순위가 더 높다.

### 9단계 : +,-,*,/ 모두 추가. 정수연산도 가능하도록 추가(메소드 오버로드)
```scala
package io.umon.scala

object Main {

  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    // 외부에 노출하기 싫으니까 private
    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    // 보조생성자. 보조생성자는 항상 this(...)로 시작. 모든 보조생성자는 결국 주 생성자로 통한다.
    def this(n: Int) = this(n, 1)

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def +(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    def +(i: Int): Rational =
      new Rational(numer + (i * denom), denom)

    def -(another: Rational): Rational =
      new Rational((numer * another.denom) - (another.numer * denom), denom * another.denom)

    def -(i: Int): Rational =
      new Rational(numer - (i * denom), denom)

    def *(another: Rational): Rational =
      new Rational(numer * another.numer, denom * another.denom)

    def *(i: Int): Rational =
      new Rational(numer * i, denom)

    def /(another: Rational): Rational =
      new Rational(numer * another.denom, denom * another.numer)

    def /(i: Int): Rational =
      new Rational(numer, denom * i)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this

    // 최대공약수
    private def gcd(a: Int, b: Int): Int =
      if (b == 0)
        a
      else
        gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {

    val x = new Rational(1, 2)
    println(x * x)
    println(x * 10)

  }

}

```

### 10단계 : 암시적 변환
```scala
package io.umon.scala

object Main {

  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    // 외부에 노출하기 싫으니까 private
    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    // 보조생성자. 보조생성자는 항상 this(...)로 시작. 모든 보조생성자는 결국 주 생성자로 통한다.
    def this(n: Int) = this(n, 1)

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def +(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    def +(i: Int): Rational =
      new Rational(numer + (i * denom), denom)

    def -(another: Rational): Rational =
      new Rational((numer * another.denom) - (another.numer * denom), denom * another.denom)

    def -(i: Int): Rational =
      new Rational(numer - (i * denom), denom)

    def *(another: Rational): Rational =
      new Rational(numer * another.numer, denom * another.denom)

    def *(i: Int): Rational =
      new Rational(numer * i, denom)

    def /(another: Rational): Rational =
      new Rational(numer * another.denom, denom * another.numer)

    def /(i: Int): Rational =
      new Rational(numer, denom * i)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this

    // 최대공약수
    private def gcd(a: Int, b: Int): Int =
      if (b == 0)
        a
      else
        gcd(b, a % b)
  }

  implicit def intToRational(x: Int) = new Rational(x)

  def main(args: Array[String]): Unit = {

    val x = new Rational(2, 3)
    println(x * 2)
    println(2 * x)

  }

}

```

### 11단계 : 객체의 동일성 부여

#### equals 구현시 일관성이 없는 동작을 야기하는 네 가지 경우
##### equals 선언 시 잘못된 시그니처를 사용
```scala
package io.umon.scala

import scala.collection.mutable


class Point(val x: Int, val y: Int) {
  def equals(another: Point): Boolean =
    this.x == another.x && this.y == another.y

  // == 잘못된 ==의 오버로드
  //def ==(another: Point): Boolean = {}

  /*
  override def equals(obj: scala.Any): Boolean = obj match {
    case obj: Point => this.x == obj.x && this.y == obj.y
    case _ => false
  }
  */
}

object Main {

  def main(args: Array[String]): Unit = {

    val p1 = new Point(1, 2)
    val p2 = new Point(1, 2)
    println(p1 equals p2)

    val hashSet = mutable.HashSet(p1);
    println(hashSet.contains(p2))

  }

}
```
##### equals를 변경하면서 hashcode는 그대로 놔둔 경우
```scala
package io.umon.scala

import scala.collection.mutable


class Point(val x: Int, val y: Int) {
  
  override def hashCode(): Int = (x,y).##

  override def equals(obj: scala.Any): Boolean = obj match {
    case obj: Point => this.x == obj.x && this.y == obj.y
    case _ => false
  }
}

object Main {

  def main(args: Array[String]): Unit = {

    val p1 = new Point(1, 2)
    val p2 = new Point(1, 2)
    println(p1 equals p2)

    val hashSet = mutable.HashSet(p1);
    println(hashSet.contains(p2))

  }

}
```
##### equals를 변경 가능한 필드의 값을 기준으로 정의한 경우
```scala
package io.umon.scala

import scala.collection.mutable


class Point(var x: Int, var y: Int) {

  override def hashCode(): Int = (x,y).##

  override def equals(obj: scala.Any): Boolean = obj match {
    case obj: Point => this.x == obj.x && this.y == obj.y
    case _ => false
  }
}

object Main {

  def main(args: Array[String]): Unit = {

    val p1 = new Point(1, 2)

    val hashSet = mutable.HashSet(p1);
    println(hashSet.contains(p1))
    println(hashSet.iterator.contains(p1))

    p1.x = p1.x + 1
    println(hashSet.contains(p1))
    println(hashSet.iterator.contains(p1))

  }

}


//val x = new Rational(2, 3)
//val y = new Rational(2, 3)
//println(x == y)
//println(x eq y)

```

##### equlas를 동치 관계로 정의하지 않은 경우
- 반사성 : null아닌 x에 대해 x.equals(x)는 true
- 대칭성 : null아닌 x,y인 경우 x.equals(y)가 true면 y.equals(x)도 true
- 추이성 : null아닌 x,y,z에 대해 x.equals(y)과 y.equals(z)가 true면 x.equals(z)도 true
- 일관성 : null아닌 x,y에 대해 x.equals(y)를 여러번 호출하엿을 경우에도 일관된 값을 내놔야함
- null 아닌 값 x에 대해 x.equlas(null)은 false

```scala
package io.umon.scala

object Main {

  // 자바와의 차이점. 장황하게 생성자를 만들 필요도 없고 멤버를 만들 필요도 없다. 내부에서 n과 d는 사용 가능. 간단한 클래스 만들때 매우 유용
  class Rational(n: Int, d: Int) {

    //require 메소드는 인자로 boolean 하나를 받고 참이 아니면 IllegalArgumentException 발생
    require(d != 0)

    // 외부에 노출하기 싫으니까 private
    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    // 보조생성자. 보조생성자는 항상 this(...)로 시작. 모든 보조생성자는 결국 주 생성자로 통한다.
    def this(n: Int) = this(n, 1)

    // toString 오버라이드
    override def toString: String = numer + "/" + denom

    def +(another: Rational): Rational =
      new Rational((numer * another.denom) + (another.numer * denom), denom * another.denom)

    def +(i: Int): Rational =
      new Rational(numer + (i * denom), denom)

    def -(another: Rational): Rational =
      new Rational((numer * another.denom) - (another.numer * denom), denom * another.denom)

    def -(i: Int): Rational =
      new Rational(numer - (i * denom), denom)

    def *(another: Rational): Rational =
      new Rational(numer * another.numer, denom * another.denom)

    def *(i: Int): Rational =
      new Rational(numer * i, denom)

    def /(another: Rational): Rational =
      new Rational(numer * another.denom, denom * another.numer)

    def /(i: Int): Rational =
      new Rational(numer, denom * i)

    // this를 생략해도 되지만..
    def lessThan(another: Rational): Boolean =
      this.numer * another.denom < another.numer * this.denom

    // this를 반드시 써야하는 경우도 있다
    def max(another: Rational): Rational =
      if (this.lessThan(another))
        another
      else
        this

    // 최대공약수
    private def gcd(a: Int, b: Int): Int =
      if (b == 0)
        a
      else
        gcd(b, a % b)


    def canEqual(other: Any): Boolean = other.isInstanceOf[Rational]

    override def equals(other: Any): Boolean = other match {
      case that: Rational =>
        (that canEqual this) &&
          numer == that.numer &&
          denom == that.denom
      case _ => false
    }

    override def hashCode(): Int = {
      val state = Seq(numer, denom)
      state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }
  }

  implicit def intToRational(x: Int) = new Rational(x)

  def main(args: Array[String]): Unit = {

    val x = new Rational(2, 3)
    val y = new Rational(2, 3)
    println(x == y)
    println(x eq y)

  }

}

```

## 함수형 프로그래밍

### 부수효과
- 변수를 수정한다
- 자료구조를 제자리에서 수정한다.
- 객체의 필드를 설정한다.
- 예외를 던지거나 오류를 내면서 실행을 중단한다.
- 콘솔에 출력하거나 사용자의 입력을 읽어들인다.
- 파일에 기록하거나 파일에서 읽어들인다.
- 화면에 그린다.

### 코드 변신 1단계
```scala
class Coffee {
  var price: Int = 1000
}

class CreditCard {
  def charge(price: Int): Unit = {
    //TODO 뭔가 함
    // 네크워크를 통해 신용카드 회사와 접촉해 거래를 승인하고, 대금을 청구하고, 거래 기록을 영구적으로 기록하는 역할 등을 한다.
  }
}

class Cafe {

  def buyCoffee(cc: CreditCard): Coffee = {
    val cup = new Coffee()

    // 이 부분이 바로 부수효과!
    // 부수효과가 있기 때문에 테스트도 어렵다.
    cc.charge(cup.price)

    cup
  }

}
```

### 코드 변신 2단계
```scala
class Coffee {
  var price: Int = 1000
}

class CreditCard {
}

class Payments {
  def charge(cc:CreditCard, price: Int): Unit = {
    //TODO 신용카드 정보를 읽고, 차감하고, 그걸 또 로깅하고...
  }
}

class Cafe {

  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
    val cup = new Coffee()

    // 여전히 부수효과가 발생하지만..
    // CreditCard 어울리지 않는 로직들을 Payments로 옮겼다.
    // Payments를 인터페이스라고 생각하면 목처리를 해서 테스트는 좀 더 쉬워진다.
    // 만약 커피 12잔을 주문한다고 한다면, buyCoffee를 12번 호출해야하는데, 뭔가 비효율적으로 보인다.
    p.charge(cc, cup.price)

    cup
  }

}
```

### 코드변신 3단계
```scala
class Coffee {
  var price: Int = 1000
}

class CreditCard {
}

class Payments {
  def charge(c: Charge): Unit = {
    //
  }
}

case class Charge(cc: CreditCard, price: Int) {
  //여러 주문건을 하나로 합치기 위한 함수
  def combine(other: Charge): Charge = {
    if (cc == other.cc) {
      Charge(cc, price + other.price)
    } else {
      throw new Exception("다른 카드로 주문을 합칠 수 없다.")
    }
  }
}

// Cafe는 실제 청구로직인 Payments를 구현하지 않아도 테스트가 가능해졌다.
class Cafe {

  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    val cup = new Coffee()
    // coffee뿐만 아니라 하나의 청구건도 하나의 값으로 돌려주게 수정하였다.
    // 청구 금액을 신용카드 회사에 보내고 결과를 기록하는 등의 처리는 외부의 다른 어딘가에서 해결하도록(책임지도록) 한다.
    // 청구 건의 생성문제가 청구건의 처리(연동)과 분리 되었다.
    // 이제 여러 주문건을 취합하기도 좋아졌다.
    (cup, Charge(cc, cup.price))
  }

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    // List.fill(n)(x)는 x의 복사본 n개로 이루어진 List를 생성
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))

    // unzip은 튜플을 건건히 해체한다.
    val (coffees, charges) = purchases.unzip

    // 여러건의 주문을 리듀스한다
    (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
  }

  // 카드별로 주문을 합쳐준다.
  def coalesce(charges: List[Charge]): List[Charge] =
    charges.groupBy(_.cc).values.map(_.reduce(_ combine _)).toList

}
```

### 이런식으로 리팩토링을 해간다면?
- 부수효과들을 프로그램의 외부 계층으로 밀어낼 수 있다.
- 프로그램은 순수한 핵심부와 얇은 외부 계층으로 구분되어지게 된다.

### 풀어보자
```scala
package io.umon.scala

object Main {

  def main(args: Array[String]): Unit = {

    //    println(factorial(4))
    //    println(factorialLoop(4))

    //    println(fib(0))
    //    println(fib(1))
    //    println(fib(2))
    //    println(fib(3))
    //    println(fib(4))
    //    println(fib(5))
    //    println(fib(10000))

    //    println(isSorted[Int](Array(), (x, y) => x <= y))
    //    println(isSorted[Int](Array(1), (x, y) => x <= y))
    //    println(isSorted[Int](Array(1, 2, 3, 4, 5), (x, y) => x <= y))
    //    println(isSorted[Int](Array(1, 999999999, 3, 4, 5), (x, y) => x <= y))

  }

  def factorialLoop(n: Int): Int = {
    var acc = 1
    for (x <- 1 to n) {
      acc = acc * x
    }

    acc
  }

  def factorial(n: Int): Int = {

    // go나 loop라는 이름으로 재귀적인 보조함수를 만든다.
    @annotation.tailrec
    def loop(n: Int, acc: Int): Int = {
      if (n <= 0) {
        acc
      } else {
        // 꼬리재귀를 이용하면 루프를 사용했을때와 마찬가지로 컴파일해준다.
        loop(n - 1, n * acc)
      }
    }

    loop(n, 1)
  }

  //https://github.com/fpinscala/fpinscala/blob/5b0115a6ad7c6c8f233c96b0b9082bf6089390d3/answerkey/gettingstarted/01.answer.scala
  // n번째 피보나치수를 구하여라. 반드시 꼬리재귀를 사용하라. 10분
  // 피보나치수는 0, 1, 1, 2, 3, 5
  def fib(n: Int): Int = {

    1
  }


  //  def fib(n: Int): Int = {
  //
  //
  //    @annotation.tailrec
  //    def loop(a: Int, b: Int, n: Int): Int = {
  //      if (n == 0)
  //        a
  //      else
  //        loop(b, a + b, n - 1)
  //    }
  //
  //    loop(0, 1, n)
  //  }


  //https://github.com/fpinscala/fpinscala/blob/5b0115a6ad7c6c8f233c96b0b9082bf6089390d3/answerkey/gettingstarted/02.answer.scala
  // Array[A]가 주어진 비교 함수에 의거해서 정렬되어 있는지 점검하는 isSorted 함수를 구현하라.
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {


    true
  }

  //  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
  //    @annotation.tailrec
  //    def loop(as: Array[A], n: Int, f: (A, A) => Boolean): Boolean = {
  //      if ((as.length - 1) <= n) {
  //        true
  //      } else if (!f(as(n), as(n + 1))) {
  //        false
  //      } else {
  //        loop(as, n + 1, f)
  //      }
  //    }
  //
  //    loop(as, 0, ordered)
  //  }


}

```

## SBT
- Simple Build Tool
- Java의 메이븐, 그래들과 같은 빌드툴
- 다운로드( http://www.scala-sbt.org/download.html ) 후 PATH까지 잡아두자.

### 시작

```bash
localhost:sbt naver$ sbt new scala/scala-seed.g8
WARN: No sbt.version set in project/build.properties, base directory: /Users/naver/test/sbt
[warn] Executing in batch mode.
[warn]   For better performance, hit [ENTER] to switch to interactive mode, or
[warn]   consider launching sbt without any commands, or explicitly passing 'shell'
[info] Set current project to sbt (in build file:/Users/naver/test/sbt/)

A minimal Scala project.

name [Scala Seed Project]:  MyHelloWorld

Template applied in ./myhelloworld
```

메이븐이 다양한 아키타입이 있는 것처럼 SBT도 템플릿이 있다. ( http://www.scala-sbt.org/1.0/docs/sbt-new-and-Templates.html )

foundweekends/giter8.g8 (A template for Giter8 templates)

scala/scala-seed.g8 (Seed template for Scala)

scala/hello-world.g8 (A template to demonstrate a minimal Scala application)

akka/akka-scala-seed.g8 (A minimal seed template for an Akka with Scala build )

akka/akka-java-seed.g8 (A minimal seed template for an Akka in Java )

akka/hello-akka.g8 (Simple Akka application)

playframework/play-scala-seed.g8 (Play Scala Seed Template)

playframework/play-java-seed.g8 (Play Java Seed template)

lagom/lagom-scala.g8 (A Lagom Scala seed template for sbt)

lagom/lagom-java.g8 (A Lagom Java seed template for sbt)
scala-native/scala-native.g8 (Scala Native)

scala-native/sbt-crossproject.g8 (sbt-crosspoject)

http4s/http4s.g8 (http4s services)

unfiltered/unfiltered.g8 (Unfiltered application)

scalatra/scalatra-sbt.g8 (Basic Scalatra template using SBT 0.13.x.)


### 디렉토리 구조
- 메이븐과 동일

```bash
src/
  main/
    resources/
       <files to include in main jar here>
    scala/
       <main Scala sources>
    java/
       <main Java sources>
  test/
    resources
       <files to include in test jar here>
    scala/
       <test Scala sources>
    java/
       <test Java sources>
```

### 빌드정의파일( build.sbt )

### 빌드지원파일( ./project )

### 실행

#### shell mode
```bash
localhost:myhelloworld naver$ sbt
[info] Loading project definition from /Users/naver/test/sbt/myhelloworld/project
[info] Updating {file:/Users/naver/test/sbt/myhelloworld/project/}myhelloworld-build...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/naver/test/sbt/myhelloworld/project/target/scala-2.10/sbt-0.13/classes...
[info] 'compiler-interface' not yet compiled for Scala 2.10.6. Compiling...
[info]   Compilation completed in 13.834 s
[info] Set current project to Hello (in build file:/Users/naver/test/sbt/myhelloworld/)
> compile
```

#### batch mode
- 우리가 잘 아는 maven과 유사하다.
- clean, compile, pacakge 등등( http://www.scala-sbt.org/0.13/docs/Running.html )

build.sbt
```scala
name := "sample"

organization := "io.umon.sample"

scalaVersion := "2.12.2"

version := "0.1.0-SNAPSHOT"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.1"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.1"

```

소스
```scala
package io.umon.sample

import com.google.gson.Gson
import org.apache.commons.lang3.StringUtils

case class Person(age: Int, name: String, job: String)

object Main {

  def main(args: Array[String]): Unit = {
    println("ok")
    println(StringUtils.equals("ok", "OK"))
    val gson = new Gson()
    println(gson.toJson(Person(33, "권석민", "무직")))
  }

}

```


### 실습1. 영문 텍스트 파일을 읽고 각 단어들이 나온 횟수를 구하라(word count)
```scala
package io.umon.sample

import scala.collection.mutable
import scala.io.Source

case class Person(age: Int, name: String, job: String)

object Main {

  def main(args: Array[String]): Unit = {

    require(args.length == 1)

    val counts = mutable.Map.empty[String, Int]

    for (line <- Source.fromFile(args(0)).getLines(); word <- line.split(" ")) {
      val oldCount = if (counts.contains(word)) counts(word) else 0
      counts += (word -> (oldCount + 1))
    }

    println(counts)

  }

}
```

### 실습2. 네이버API를 이용해 기계번역하는 프로그램을 작성하라.

## 참고
https://en.wikipedia.org/wiki/Martin_Odersky

https://namu.wiki/w/Scala

http://www.yes24.com/24/goods/33054166?scode=032&OzSrank=2

http://www.yes24.com/24/goods/39410825?scode=032&OzSrank=1
