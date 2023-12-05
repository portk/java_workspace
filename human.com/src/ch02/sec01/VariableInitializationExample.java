package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value;
		value = 10;  //value는 초기화 값이 들어가야한다. 그렇지 않으면 에러가 난다.
		// 초기화 방법: int value = 10;, int value; value=10;
		int result = value + 10;
		System.out.println(result);
	}
}
