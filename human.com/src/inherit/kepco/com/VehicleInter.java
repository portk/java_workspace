package inherit.kepco.com;

//interface�� ���� : Ŭ������ ��� �޼ҵ尡 �߻�޼ҵ�� ������� �ִ� Ŭ������ �������̽��� �θ���.
//: interface�� ����Ǵ� �޼ҵ�� ���� �߻�޼ҵ�
//: interface�� ����Ǵ� ������ ���� ���

public interface VehicleInter {
	// public static final int maxSpeed=50;
	// �������̽����� �� �������� �� �ܾ��� ���̸� �����(_)�� �־� �����Ѵ�.
	int MAX_SPEED=50;
	
	// interface���� �����ϴ°� ������ �߻� �޼ҵ�� �̹Ƿ� abstract�� ���� �Ⱥٿ��־ ��.
	// static�� �Ⱥٿ��� �������̽��̸�.method()�� �ٷ� ���� �����ϴ�.
	public /* abstract*/ String front();
	public /* abstract*/ void rear();
}
