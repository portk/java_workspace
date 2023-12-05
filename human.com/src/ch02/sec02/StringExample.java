package ch02.sec02;

public class StringExample {
	public static void main(String[] args) {
//		char var1="A"; // 작은 따옴표로 가둬줘야 오류가 안남
//		char var2='abc'; // char는 한글자밖에 안됨
		
		char var1='A';
		String var2="abc";
		String var3="나는 자바 프로그래머 입니다.";
		String var4="나는 \"자바\" 프로그래머 입니다.";
		String var5= """ 
				자는 "자바" 프로그래머 입니다.
				""";
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		System.out.println(var5);
	}
}
