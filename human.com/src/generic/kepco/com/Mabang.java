package generic.kepco.com;

public class Mabang {
	private int num;
	private int xsum;
	private int ysum;
	
	public Mabang(int num) {
		this.num=num;
	}
	
//	public Mabang() { default ������ jvm���� �ڵ������Ѱ����� ħ, �ƹ��� �Ķ���͸� ���� ����
//					  default �����ڰ� �ƴϰ� �ڵ��ϸ� ���̻� �ڵ������� �������� ����
//				      �̰� �� �ۼ��ؾ߸� �Ѵ�.
//		
//	}
	
	public void inputMaBang() {
		//�߾� ù �� ���� �������� �̵�
		//����� �� ������
		// ���ڰ� �ִٸ� �Ʒ��� 1ĭ
		int[][] maBangArr = new int[num][num];
		int x=0;
		int y=num>>1;
		maBangArr[x][y]=1;
		
		for (int value=1; value < num*num+1 ; value++) {
			maBangArr[x][y] = value;
			x--;
			y--;
			if (x < 0) {
				x += num;
			}
			if (y < 0) {
				y += num;
			}
			if (maBangArr[x][y] != 0) {
				x+=2;
				if (x > num-1) {
					x-=num;
				}
				y+=1;
				if (y > num-1) {
					y-=num;
				}
			}
			
		}
		
		for (int[] temp : maBangArr) {
			for (int value : temp) {
				System.out.print(value+" ");
			}
		System.out.println();
		}
		for (int[] oneLine : maBangArr) {
			xsum=0;
			for(int i=0;i < num ; i++) {
				xsum += oneLine[i];
			}
			System.out.print("xsum: "+xsum+" ");
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			ysum=0;
			for(int[] column : maBangArr) {
				ysum += column[i];
			}
			System.out.print("ysum: "+ysum+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Mabang mb = new Mabang(7);
		mb.inputMaBang();
	}
}
