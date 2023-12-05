package dbconn.kepco.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnSingleTon {
//	singleton ��ü�� �޸𸮿� 1���� �ν��Ͻ�ȭ �Ͽ� ����ϴ� ���
//	�׷��� ... �̷��� ������ �ؿ�
//	1. �ܺο��� new�ؼ� ������� �ؾ� ��
	private static DBconnSingleTon dst = new DBconnSingleTon();
	Connection conn;
	
	private DBconnSingleTon() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "hr", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static DBconnSingleTon getInstance() {
		if(dst == null ) {
			dst = new DBconnSingleTon();
		}
		return dst;
	}
	
	public Connection getConnection() {
		return conn;
	}
	
}
