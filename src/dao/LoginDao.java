package dao;

import java.sql.*;
public class LoginDao {
	public static boolean CheckAcc(Connection conn,String name , String pass) throws SQLException {
		PreparedStatement pst = null;
		String sql = "SELECT * FROM testvn.test";
		pst = conn.prepareStatement(sql);
		
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			if (rs.getString("tendangnhap").equals(name) && rs.getString("matkhau").equals(pass) )
			return true;				
		}		
		return false;
	}
}
