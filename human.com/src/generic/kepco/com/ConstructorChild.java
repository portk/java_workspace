package generic.kepco.com;

public class ConstructorChild extends ConstructorParent{
	public ConstructorChild() {
		super(); //�θ�Ŭ������ ���� �޸𸮿� �ö󰣴�.
		System.out.println("�ڽ�");
	}
	public static void main(String[] args) {
		ConstructorChild cc = new ConstructorChild();
		cc.getClass();
	}
}
// �ǹ����� ���� �޸𸮿� �θ�Ŭ������ �ø��� �Ⱦ interface�� �̿��Ѵ�.
// ���� �������̽��� ��������� �ٸ� ��Ʈ�� �ȳ����� �׽�Ʈ�� �� �־ ����