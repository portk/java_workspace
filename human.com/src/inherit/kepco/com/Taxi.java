package inherit.kepco.com;

public class Taxi {
	private int speed;
	//������ ���� ���� ������ �ʱⰪ 0�� �ȴ�
	String color = "Red";
//	String color1 = new String("Red");
	public String money="free";
	final int TEST=100;
	//�ΰ� �̻��� �ܾ�(����)�� �������� �����ϴ� ��Ģ
	String nickName="human";
	
	public String front1(int speed) {
		this.speed=speed;
		//return�� ������ �ش� �޼ҵ�� ������
		//this�� �ڱ� �ڽ�(Ŭ����)�� ��Ÿ����.(super) ���� ��ó�� ���� Ŭ������ ������ ���� ����ȴ�.
		return null;
	}
	public void rear1() {
		System.out.println("���� �ӵ��� " + speed + "�Դϴ�");
	}
}
//private / public ���� ������ private : �ܺο����� ������ �� ����
//���� ��Ŭ�� -> refactor -> rename�� �ؾ� �װ��� ����ϴ� �ٸ� ���Ͽ����� �̸��� ���ÿ� ����ȴ�.
// �⺻���� �ٵ� private�� �����Ѵ�. (Ŭ���� �������� ��� ����)
// ����Ʈ ������. ���� ��Ű�� ��, �ٸ���Ű������ ��Ӱ��迡 �ش��ϸ� ��� �����ϴ�.
// Ŭ������ �޼ҵ� �տ� ���� �� �ִ�.
// final ���, ����� �� �������� �빮�ڷ� �����.
// ctrl i �� ������ �ڵ� ������ �ȴ�.
// 'sysout' ctrl space -> println()�ڵ� �ϼ�