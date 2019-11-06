package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBconnect;

@WebServlet(urlPatterns = {"/TestConnController"})
public class TestConnController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter x = resp.getWriter();
		try {
			Connection conn = DBconnect.ConDB();
			if(	conn != null ) {
				resp.setContentType("text/html");
				
				x.println("ket noi DB thanh cong");
							
			}else {
				x.println("ket noi DB that bai");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
