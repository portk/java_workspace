package generic.kepco.com;

public class ArrayTest {
	public void test() {
		// 1���� �迭 ����
		int[] full = {1,3,5,7}; // �� ��� ����
//		int full[] = {1,3,5,7};
//		int[] full = new int[4];
//		int[] full = new int[] {1,3,5,7};
		
//		2���� �迭 ����
//		int[][] full = new int[5][5];
//		int[][] full = new {{1,1,1,1,1,},{},{},{},{}};
		
//		2���� �迭�� ũ�Ⱑ �ٸ� ���
//		int[][] diff = new int [3][];
//		diff[0] = new int[2];
//		diff[1] = new int[3];
//		diff[2] = new int[4];
		
		for (int i = 0; i < full.length; i++) {
			System.out.print(full[i] + " ");
		}
		System.out.println();
		System.out.println("**********************");
		for (int temp : full) {
			System.out.print(temp+" ");
		}
		System.out.println();
		
		int value = 1;
		int[][] human = new int[5][5];
		for (int i = 0; i < human.length; i++) {
			for (int j = 0; j < human[i].length; j++) {
				human[i][j] = value;
				value++;
			}
		}
		for (int[] temp : human) {
			for (int present : temp) {
				System.out.print(present + " ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new ArrayTest().test();
	}
}
