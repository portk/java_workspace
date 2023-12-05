package generic.kepco.com;

public class ConstructorChild extends ConstructorParent{
	public ConstructorChild() {
		super(); //부모클레스가 먼저 메모리에 올라간다.
		System.out.println("자식");
	}
	public static void main(String[] args) {
		ConstructorChild cc = new ConstructorChild();
		cc.getClass();
	}
}
// 실무에서 보통 메모리에 부모클래스를 올리기 싫어서 interface를 이용한다.
// 또한 인터페이스로 만들었을때 다른 파트가 안끝나도 테스트할 수 있어서 좋다