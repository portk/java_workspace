package inherit.kepco.com;

public class InheritTruck extends Vehicle {

	@Override
	public String front(int speed) {
		System.out.println("Ʈ���� �����Դϴ�.");
		return null;
	}

	@Override
	public void rear() {
		System.out.println("Ʈ���� �����Դϴ�.");
	}

}
