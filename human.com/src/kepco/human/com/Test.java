package kepco.human.com;

public class Test {
	
	static int j = 10; //필드
	
	public void test() {
		System.out.println("fsajfasdf");
	}
	
//	모든 클래스는 메모리에 올라가야지만 실행됨 : 인스턴스(instance)화 한다.
//	주석은 ctrl shift c
//	main함수는 main을 치고 ctrl space를 하면 작성되어 있따.
//	인스턴스 하는 방법
//	1. new 연산자를 이용하는 방법
////	2. 리플렉션 사용
//	메소드는 크기가 없음. 실행할때만 메모리에 왔다가 사라진다.
//	메소드를 자체적으로 메모리에 얹는게 static 이다.
//	.을 이용해서 접근한다
//	new는 생성자이다
//	tt가 Test()가 있는 메모리 주소를 가지고 있게 된다.
//	java에는 JVM이라는게 있음. Java Virtual Machine
//	C/C++ 같은 것은 OS가 바로 읽을 수 있게 Compile 한다.
//	자바는 JVM으로 읽을 수 있게 컴파일하고, JVM이 OS가 읽게 컴파일 해서 플랫폼 독립적이다.
//	자바는 compiler이자 interprint언어 이다.
//	interprinter언어(javaScript 등)를 os가 읽는다.
//	자바를 설치할 때 본인 os용 JVM이 깔리는 것
	public static void main(String[] args) {
		int i = 11; //메인이 
//		Test tt = new Test();
//		tt.test(); // 이게 올라갈 때 Test라는 클래스가 읽어진다.
//		System.out.println(i);
//		System.out.print(tt); 원칙
		Result rs = new  Result();
		rs.human();
	}
}

//method나 변수에 static이 붙으면 메모리에 로드하지 않아도 바로 로드가 가능하다
//공유가 되서 보안문제를 발생시키고, 안사라져서 메모리 효율에 좋지 않다.
//main메소드만 클래스로 인식을 한다.

//자바에는 8개의 타입이 있다.
//Primitive type
//컴파일러가 미리 정해놓은 타입.
//	   정수저장        			실수 저장   참,거짓
//1byte	byte						boolean
//2byte	short		char
//4byte	int(+-2억)			float
//8byte	long				double
//A => 41(16)
//a => 61(16)
//Primitive type외의 모든 변수의 타입은 Class이며 참조 타입이다.
//class는 정의 해놓은 것이고 그것을 로드해서 instance화 해놓은게 Object(객체)다.
// Primitive type이 아닌 것을 변수에 저장할 때 유형에 해당 클래스 명을 넣으면 된다.
//method를 받을 때 primitive type이라면 값이 복사되지만
//primitive type이 아니라면 주소가 복사된다.
//변수는 보통 method에 선언하고, 전체가 다 쓰면 클래스에 선언한다.
//상속을 할 땐 public class 자식클래스 extend 부모클래스 {}
//상속을 하게 되면
//vehicle {
//	front()
//	rear()
//}
//
// 상속관계면 자식클래스 보다 부모 클래스가 먼저 메모리에 올라가기 때문에 부모클래스에 있는 내용에 접근 할 수 있다.
// 자바는 단일상속만 가능하다. 두 개 이상은 할 수 없다
// method overriding
// 상속관계에서 자식클래스가 부모클래스가 가지고 있는 메소드를 오버라이딩 하는 것
// 오버라이딩 된 것은 @overriding이 붙는다

// project는 많은 사람이 붙어서 만들기 때문에 정확하게 설계되어있지 않다면 똑바로 굴러가지 않는다.
// project를 할 때 deadline이 최우선적으로 지켜져야한다.
// 엉망진창일지언정 돌가가게는 만들어놓고 최적화를 거칠지언정 해야한다.

// vehicle{		추상클래스 (abstract class)
//     front;   추상메소드 (abstract method)
//     rear;	추상메소드
// }
// 클래스 안에 단 하나라도 추상메소드가 들어간 경우 추상클래스가 된다.
// 또한 추상클래스는 메모리에 올라가지 못한다.

// 유틸리티 클래스, 자바 제공 클래스 같은경우 두개이상 쓰고싶은 경우가 많음

// 이때 사용하는게 인터페이스(interface)이다.
// 인터페이스는 모두 static변수이고, 추상메소드이다.
// 인터페이스일땐 extend가 아니라 임플맨츠(implements)를 이용한다.
// 인터페이스를 이용하면 메소드들이 전부 완성되지 않아도 테스트가 가능하다