package inherit.kepco.com;

//interface의 구조 : 클래스의 모든 메소드가 추상메소드로 만들어져 있는 클래스를 인터페이스라 부른다.
//: interface에 선언되는 메소드는 전부 추상메소드
//: interface에 선언되는 변수는 전부 상수

public interface VehicleInter {
	// public static final int maxSpeed=50;
	// 인터페이스에서 준 변수명은 두 단어의 사이를 언더바(_)를 주어 연결한다.
	int MAX_SPEED=50;
	
	// interface에서 선언하는건 어차피 추상 메소드들 이므로 abstract를 굳이 안붙여주어도 됨.
	// static을 안붙여도 인터페이스이름.method()로 바로 접근 가능하다.
	public /* abstract*/ String front();
	public /* abstract*/ void rear();
}
