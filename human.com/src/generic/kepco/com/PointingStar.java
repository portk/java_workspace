package generic.kepco.com;

public class PointingStar {
	
	private int Position = 0;
	private int StarCount = 0;
	
	public void DrawingStar() {
		for (int i=0 ; i < 9 ; i++) {
			if (i < 5) {
				Position = 4;
				Position -= i;
				StarCount = 1+ i*2;
				for(int j=0 ; j < Position ; j++) {
					System.out.print(" ");
				}
				for(int k=0 ; k < StarCount ; k++) {
					System.out.print("¡Ú");
				}
				System.out.println();
			} else {
				Position = i - 4; 
				StarCount = 7 - 2*(i-5);
				for(int j=0 ; j < Position ; j++) {
					System.out.print(" ");
				}
				for(int k=0 ; k < StarCount ; k++) {
					System.out.print("¡Ú");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		PointingStar ps = new PointingStar();
		ps.DrawingStar();
	}
}
