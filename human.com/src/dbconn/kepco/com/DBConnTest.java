package dbconn.kepco.com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DBConnTest {
	private Connection conn;
	private PreparedStatement pstm;
	private ResultSet rs;
	private SimpleDateFormat sdf;
	
	// input �±��� name attribute�� ���� �ڹ� Ŭ������ ������� DB�� Į������ ������ �ڵ����� �Ѿ�� ������ ��ġ���Ѿ� �Ѵ�.	
	public void select() throws Exception {
		conn=DBconnSingleTon.getInstance().getConnection();
		String query = "SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE FROM EMPLOYEES";
		pstm = conn.prepareStatement(query);
//		1. �����ϴ� �������� select���� ��� executeQuery()
//		2. insert, update, delete�� ���� executeUpdate()
		rs = pstm.executeQuery();
		sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		while(rs.next()) {
			int employeeId = rs.getInt("employee_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String email = rs.getString("email");
			Date hireDate = rs.getDate("hire_date");
			System.out.println(employeeId+" "+firstName+" "+lastName+" "+email+" "+sdf.format(hireDate));
			System.out.println();
		}
	}
	
	public void insert() throws Exception {
		conn=DBconnSingleTon.getInstance().getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO EMPLOYEES VALUES");
		sb.append("(355,'A','A','A','A',NOW(),'AD_VP',6000,NULL,110,30)");
		pstm=conn.prepareStatement(sb.toString());
		pstm.executeUpdate();
	}
	
	public static void main(String[] args) throws Exception {
		DBConnTest dt=new DBConnTest();
		dt.select();
//		dt.insert();
	}
}