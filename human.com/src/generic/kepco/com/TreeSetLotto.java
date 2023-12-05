package generic.kepco.com;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {
	private Random rd = new Random();
	
	public void makeLotto() {
		// Integer og = new Integer(1); 예전에는 이렇게 해서 밑에 넣어줘야 했지만 이제는 그렇게 안해도 자바가 알아서 바꿔서 해줌
		TreeSet<Integer> ts = new TreeSet<>(); //Integer int값을 정수 값의 class로 바꿔줌 primitive 값은 Set에 들어갈 수 없다.
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
