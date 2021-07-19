package login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	Connection conn;

	public LoginDAO() {
		//ID, PASSWORD NULL OR "" �� Ȯ�����ϴ� ������ �־����.-����
		String dburl="jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser="user1";
		String dbpassword="1111";
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection(dburl,dbuser,dbpassword);
		}catch(Exception e) {
			
		}
		if(conn==null){
			System.out.println("db���ӽ���");
		}else{
			System.out.println("db���Ӽ���");
		}
	}
	
	public int loginCheck(String id, String password) {
		//DB���� ��ü ����
		PreparedStatement psmt=null;
		ResultSet rs=null;
		String sql="";
		int result;
		//2.�����ͺ��̽� ������ �̿��ϴ� ���
		try {
		sql="select * from member where id=? and password=?";
		psmt=conn.prepareStatement(sql);
		psmt.setString(1, id);
		psmt.setString(2, password);
		rs=psmt.executeQuery();

		if(rs.next()){
			result=1;
		}else{
			result=0;
		}
		rs.close();
		psmt.close();
		conn.close();
		
		return result;
		}catch(Exception e) {
		return 0;
		}
		
	}
}
