package ch03.sec01;

public class InfinityAndNanCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x/y;
		double z1 = z+1;
		double z2 = z1/z;
		System.out.println(z);
		System.out.println(z1);
		System.out.println(z2);
		if (!(Double.isInfinite(x) || Double.isNaN(x))) {
			System.out.println("��갡�� ����� "+(x));
		} else {
			System.out.println(("��� �Ұ���"));
		}
		
		// ==, != �� ���ڸ� ���� ���� ����Ѵ�.
		String str1 = "abc";
		String str2 = "ab";
		String str3 = "c";
		String str4 = str2.concat(str3);
		
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str1 == str4);
		
	}
}
