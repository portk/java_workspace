package inherit.kepco.com;

//추상메소드를 1개라도 포함하면 추상클래스가 됨
public abstract class Vehicle {
	private int speed;
	String color = "Red";
	public String money="1000원";
	//추상 메소드
	public abstract String front(int speed);
	public abstract void rear();
}
