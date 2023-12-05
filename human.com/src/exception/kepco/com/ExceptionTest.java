package exception.kepco.com;

public class ExceptionTest {

	//	반드시 예외처리를 해야하는 경우... 하지 않으면 문법적으로 에러임
	//	1.DB접속
	//	2.네트워크
	//	3.I/O...stream
	//	4. 쓰레드 사용

	public void test() {
		try {
			int result = 10/0;
		} catch(Exception e) {
			System.out.println("분모로 0이오면 안되요!");
			e.printStackTrace();
			e.getMessage();
		} finally {
			System.out.println("예외가 발생하나 하지 않으나 수행됩니다.");
		}
	}
	
	public void test1() throws Exception{
		int result=10/0;
	}

	// 메소드에서 자체적으로 예외처리를 해버리면 어디서 호출했을때 난 오류인지를 알 수 없다. 따라서 밖으로 던져버리고 각각 예외처리를 하게 해야한다.
	// 예외처리하는 클래스를 만들어두고 그곳으로 던지는게 일반적.
	
	public void test2() {
		try {
			int result = 10/0;
		} catch (Exception e) {
			new KepcoException(e);
		}
	}
	
	public static void main(String[] args) {
		try{
			new ExceptionTest().test2();
		}catch(Exception e) {
			System.out.println("메인 메소드에서 예외처리");
			e.printStackTrace();
		}
	}
}
