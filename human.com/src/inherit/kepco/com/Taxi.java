package inherit.kepco.com;

public class Taxi {
	private int speed;
	//정수는 값을 주지 않으면 초기값 0이 된다
	String color = "Red";
//	String color1 = new String("Red");
	public String money="free";
	final int TEST=100;
	//두개 이상의 단어(연어)로 변수명을 선언하는 규칙
	String nickName="human";
	
	public String front1(int speed) {
		this.speed=speed;
		//return을 만나면 해당 메소드는 종료함
		//this는 자기 자신(클래스)를 나타낸다.(super) 따라서 위처럼 쓰면 클래스의 변수에 값이 저장된다.
		return null;
	}
	public void rear1() {
		System.out.println("후진 속도도 " + speed + "입니다");
	}
}
//private / public 접근 제한자 private : 외부에서는 접근할 수 없음
//파일 우클릭 -> refactor -> rename을 해야 그것을 사용하는 다른 파일에서도 이름이 동시에 변경된다.
// 기본으로 다들 private로 선언한다. (클래스 내에서만 사용 가능)
// 디폴트 접근자. 같은 패키지 내, 다른패키지여도 상속관계에 해당하면 사용 가능하다.
// 클래스나 메소드 앞에 붙일 수 있다.
// final 상수, 상수일 땐 변수명을 대문자로 만든다.
// ctrl i 를 누르면 자동 정렬이 된다.
// 'sysout' ctrl space -> println()자동 완성