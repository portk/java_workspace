package inherit.kepco.com;

public class InheritTaxi extends Vehicle {

	@Override
	public String front(int speed) {
		System.out.println("�ý��� �����Դϴ�.");
		return null;
	}

	@Override
	public void rear() {
		System.out.println("�ý��� �����Դϴ�.");
	}

}
