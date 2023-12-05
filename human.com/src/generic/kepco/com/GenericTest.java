package generic.kepco.com;

import java.util.ArrayList;

public class GenericTest {
	ArrayList<Elec> human = new ArrayList<Elec>();
	public void test() {
		// 1.7 이후에는 new ArrayList();로 해도 된다.
		// 자동으로 왼쪽을 참조해준다
		human.add(new MP3());
		human.add(new TV());
		human.add(new Radio());
		human.add(new Elec() {

			@Override
			public void volumeUp() {
				System.out.println("cell업");

			}

			@Override
			public void volumeDown() {
				System.out.println("cell다운");

			}
		});


		//		System.out.println(human.size());
		//		Object 클래스에 있는 toString() 메소드는 println()을 만나면 실행된다
		//		System.out.println(human);
		//		System.out.println(new MP3());
	}


	public void result() {
		for (int i = 0; i < human.size() ; i++) {
			human.get(i).volumeUp();
			human.get(i).volumeDown();
		}
		System.out.println("---------------------------");
		int j=0;
		while (j < human.size()) {
			human.get(j).volumeUp();
			human.get(j).volumeDown();
			j++;
		}
		System.out.println("---------------------------");

		for( Elec temp : human /*컬렉션류*/) { //향상된 for문
			temp.volumeUp();
			temp.volumeDown();
		}
	}
}
