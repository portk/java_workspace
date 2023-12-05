package generic.kepco.com;

public class StringTest {
	
	public void test() {
		String a = "test"; // �ִ��� ������ Ȯ�� �� �����Ƿ� ����
		String b = "test"; // �ִ��� ������ Ȯ�� �� �����Ƿ� ������ ����
		String c = a;	   // a�� ������ �ִ� �������� ������
		String d = new String("test");
		
		System.out.println(a);
		// Object Ŭ������ ����Ǿ� �ִ� equals()�� ==�� ���� (�������� ����)
		// String Ŭ������ equals()�� �������̵�  �Ǿ ���ڿ� ���� ��
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		
//		StringBuffer sb = new StringBuffer(); // ����ȭ��� ����
		StringBuilder sb = new StringBuilder("select *"); // ����ȭ ��� ����
		sb.append(" from emp ");
		sb.append(" where ...");
	}
	
	public static void main(String[] args) {
		new StringTest().test();
	}
}
