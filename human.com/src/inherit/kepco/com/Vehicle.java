package inherit.kepco.com;

//�߻�޼ҵ带 1���� �����ϸ� �߻�Ŭ������ ��
public abstract class Vehicle {
	private int speed;
	String color = "Red";
	public String money="1000��";
	//�߻� �޼ҵ�
	public abstract String front(int speed);
	public abstract void rear();
}
