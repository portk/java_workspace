package inherit.kepco.com;

public class inheritMain {

	public static void main(String[] args) {
		InheritBus ib = new InheritBus();
//		Vehicle vc = new InheritBus();
		// �ڽ��� �θ��ڸ��� ���� ���� ��ĳ����(Upcasting)
		InheritTaxi it = new InheritTaxi();
		InheritTruck itu = new InheritTruck();
		
		ib.front(0);
		ib.rear();
		
		it.front(0);
		it.rear();
		
		itu.front(0);
		itu.rear();
		
	}

}
