package ch02.sec02;

public class StringExample {
	public static void main(String[] args) {
//		char var1="A"; // ���� ����ǥ�� ������� ������ �ȳ�
//		char var2='abc'; // char�� �ѱ��ڹۿ� �ȵ�
		
		char var1='A';
		String var2="abc";
		String var3="���� �ڹ� ���α׷��� �Դϴ�.";
		String var4="���� \"�ڹ�\" ���α׷��� �Դϴ�.";
		String var5= """ 
				�ڴ� "�ڹ�" ���α׷��� �Դϴ�.
				""";
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
	}
}
