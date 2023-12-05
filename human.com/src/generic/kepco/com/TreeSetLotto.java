package generic.kepco.com;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {
	private Random rd = new Random();
	
	public void makeLotto() {
		// Integer og = new Integer(1); �������� �̷��� �ؼ� �ؿ� �־���� ������ ������ �׷��� ���ص� �ڹٰ� �˾Ƽ� �ٲ㼭 ����
		TreeSet<Integer> ts = new TreeSet<>(); //Integer int���� ���� ���� class�� �ٲ��� primitive ���� Set�� �� �� ����.
		ts.add(rd.nextInt(45) +1);
		while (ts.size() < 6) {
			ts.add(rd.nextInt(45) +1);
		}
		System.out.println(ts);
	}
	
	public static void main(String[] args) {
		new TreeSetLotto().makeLotto();
	}
}
