package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Users;
public class RegisDao {
	public static boolean InsertAcc(Connection conn,Users user) throws SQLException {
		// khai bao su dung preparestm
		PreparedStatement pst = null;
		String sql = "Insert into testvn.test(tendangnhap,matkhau) values(?,?)";
		pst = conn.prepareStatement(sql);
		//set gia tri
		String username = user.getName();
		String pass = user.getPass();
		pst.setString(1, username);
		pst.setString                                                                                                                                     (2, pass);
		// thuc thi truy van
		int kt = pst.executeUpdate();
		if(kt != 0) {
			return true;	
		}else 
			return false;
		
	}
}
