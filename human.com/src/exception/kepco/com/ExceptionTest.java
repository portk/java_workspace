package exception.kepco.com;

public class ExceptionTest {

	//	�ݵ�� ����ó���� �ؾ��ϴ� ���... ���� ������ ���������� ������
	//	1.DB����
	//	2.��Ʈ��ũ
	//	3.I/O...stream
	//	4. ������ ���

	public void test() {
		try {
			int result = 10/0;
		} catch(Exception e) {
			System.out.println("�и�� 0�̿��� �ȵǿ�!");
			e.printStackTrace();
			e.getMessage();
		} finally {
			System.out.println("���ܰ� �߻��ϳ� ���� ������ ����˴ϴ�.");
		}
	}
	
	public void test1() throws Exception{
		int result=10/0;
	}

	// �޼ҵ忡�� ��ü������ ����ó���� �ع����� ��� ȣ�������� �� ���������� �� �� ����. ���� ������ ���������� ���� ����ó���� �ϰ� �ؾ��Ѵ�.
	// ����ó���ϴ� Ŭ������ �����ΰ� �װ����� �����°� �Ϲ���.
	
	public void test2() {
		try {
			int result = 10/0;
		} catch (Exception e) {
			new KepcoException(e);
		}
	}
	
	public static void main(String[] args) {
		try{
			new ExceptionTest().test2();
		}catch(Exception e) {
			System.out.println("���� �޼ҵ忡�� ����ó��");
			e.printStackTrace();
		}
	}
}
