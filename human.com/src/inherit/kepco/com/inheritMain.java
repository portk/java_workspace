package inherit.kepco.com;

public class inheritMain {

	public static void main(String[] args) {
		InheritBus ib = new InheritBus();
//		Vehicle vc = new InheritBus();
		// 자식이 부모자리로 들어가는 것이 업캐스팅(Upcasting)
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
