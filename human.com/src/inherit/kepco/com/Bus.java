package inherit.kepco.com;

public class Bus {
	private int speed;
	String color = "Red";
	public String money="free";
	final int TEST=100;
	String nickName="human";

	public String front(int speed) {
		this.speed=speed;
		return null;
	}
	public void rear() {
		System.out.println("후진 속도도 " + speed + "입니다");
	}
}

