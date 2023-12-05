package generic.kepco.com;

public class StringTest {
	
	public void test() {
		String a = "test"; // 있는지 없는지 확인 후 없으므로 만듦
		String b = "test"; // 있는지 없는지 확인 후 있으므로 포인터 연결
		String c = a;	   // a가 가지고 있는 참조값을 가져옴
		String d = new String("test");
		
		System.out.println(a);
		// Object 클래스에 선언되어 있는 equals()는 ==과 같음 (참조값을 비교함)
		// String 클래스의 equals()는 오버라이딩  되어서 문자열 내용 비교
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
		
//		StringBuffer sb = new StringBuffer(); // 동기화기능 있음
		StringBuilder sb = new StringBuilder("select *"); // 동기화 기능 없음
		sb.append(" from emp ");
		sb.append(" where ...");
	}
	
	public static void main(String[] args) {
		new StringTest().test();
	}
}
