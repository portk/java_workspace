package inherit.kepco.com;

public class InheritBus extends Vehicle {
//	@override
	public String front(int speed) {
		System.out.println("버스의 전진입니다");
		return null;
	}
//	@override
	public void rear() {
		System.out.println("버스의 후진입니다");
	}
	
}
