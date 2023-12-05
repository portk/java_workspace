package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println(x);
		
		byte b = 100;
		int y = -b;
		System.out.println(y);
		++y;
		System.out.println(y);
		
		for (int i = 0; i < 150; i++) {
			++y;
		}
		System.out.println(y);
		for (int i = 0; i < 150; i++) {
			--y;
		}
		System.out.println(y);
	}
}
