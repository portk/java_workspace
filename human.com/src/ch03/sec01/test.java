package ch03.sec01;

public class test {
//�������� 1�� �Ǵ� �� ã��
	public int solution(int num){
		for (int i=2; i < num ; i++) {
			if ((num % i) == 1) {
				return i;
			}
		}
		return 2;
	}
	
	public static void main(String[] args) {
		test ts = new test();
		System.out.println(ts.solution(10));
	}
}
