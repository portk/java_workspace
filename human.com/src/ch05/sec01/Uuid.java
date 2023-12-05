package ch05.sec01;

import java.util.UUID;
public class Uuid {
	public static void main(String[] args) {
		String uid = UUID.randomUUID().toString();
		System.out.println(uid);
	}
}
