package generic.kepco.com;

public class ElecMain {
//	public void test() {
//		
//	}
	
	public static void main(String[] args) {
		//test(); 메모리에 안올라가서 호출 불가
		GenericTest gt = new GenericTest();
		gt.test();
		gt.result();
	}
}
