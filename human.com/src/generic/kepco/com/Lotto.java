package generic.kepco.com;

import java.util.Random;

public class Lotto {
	private Random rd = null;
	private int[] lotto = new int[6];
	public void makeLotto() {
		rd = new Random();
		lotto[0] = rd.nextInt(45)+1;
		for(int i=1; i<6 ; i++) {
			int temp = rd.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if( temp == lotto[j]) {
					i--;
					break;
				}
				lotto[i] = temp;
			}
			
//			lotto[i] = temp;		�������� ��� lotto[i] = temp;�� ��ġ�� �ٲ���µ� ����ȭ �������� �ξ� �� ������
//			for (int j = 0; j < i; j++) {
//				if( temp == lotto[j]) {
//					i--;
//					break;			��� ������ ���ʿ��� for���� �����ִ�.
//				}
//			}
		}
		for (int i : lotto) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Lotto lo = new Lotto();
		for (int i = 0; i < 100; i++) {
			System.out.print(i+1 + " ��°: ");
			lo.makeLotto();
		}		
	}
}
