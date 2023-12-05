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
			
//			lotto[i] = temp;		교수님의 방법 lotto[i] = temp;의 위치만 바뀌었는데 최적화 관점에서 훨씬 더 좋은듯
//			for (int j = 0; j < i; j++) {
//				if( temp == lotto[j]) {
//					i--;
//					break;			없어도 되지만 불필요한 for문이 돌고있다.
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
			System.out.print(i+1 + " 번째: ");
			lo.makeLotto();
		}		
	}
}
