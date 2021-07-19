package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//@Repository
public class JdbcConnection {
	Connection conn;
	public Connection getConnection() {
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:xe","user1","1111");

		if(conn==null) {System.out.println("DB���ӿ� ����");}
		System.out.println("DB���� ����");
		
		}catch(Exception e) { }
		return conn;
	}
	public void ConnectionClose() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

