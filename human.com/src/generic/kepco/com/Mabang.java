package generic.kepco.com;

public class Mabang {
	private int num;
	private int xsum;
	private int ysum;
	
	public Mabang(int num) {
		this.num=num;
	}
	
//	public Mabang() { default 생성자 jvm에서 자동생성한것으로 침, 아무런 파라미터를 받지 않음
//					  default 생성자가 아니게 코딩하면 더이상 자동생성을 지원하지 않음
//				      이걸 꼭 작성해야만 한다.
//		
//	}
	
	public void inputMaBang() {
		//중앙 첫 줄 부터 왼쪽위로 이동
		//벗어나면 맨 밑으로
		// 숫자가 있다면 아래로 1칸
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
