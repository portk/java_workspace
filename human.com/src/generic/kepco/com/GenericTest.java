package generic.kepco.com;

import java.util.ArrayList;

public class GenericTest {
	ArrayList<Elec> human = new ArrayList<Elec>();
	public void test() {
		// 1.7 ���Ŀ��� new ArrayList();�� �ص� �ȴ�.
		// �ڵ����� ������ �������ش�
		human.add(new MP3());
		human.add(new TV());
		human.add(new Radio());
		human.add(new Elec() {

			@Override
			public void volumeUp() {
				System.out.println("cell��");

			}

			@Override
			public void volumeDown() {
				System.out.println("cell�ٿ�");

			}
		});


		//		System.out.println(human.size());
		//		Object Ŭ������ �ִ� toString() �޼ҵ�� println()�� ������ ����ȴ�
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

		for( Elec temp : human /*�÷��Ƿ�*/) { //���� for��
			temp.volumeUp();
			temp.volumeDown();
		}
	}
}
