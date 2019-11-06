package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Users;
import dao.LoginDao;
import db.DBconnect;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		Users user = new Users();
		user.setName(name);
		user.setPass(pass);
		
		boolean kt;
		try {
			kt = LoginDao.CheckAcc(DBconnect.ConDB(),name, pass);
			if(kt) {
				HttpSession ss =  request.getSession(true);
				ss.setAttribute("ssname", name);
				RequestDispatcher rpq = request.getRequestDispatcher("WEB-INF/View/LoginSuccess.jsp");
				rpq.forward(request, response);
			}else {
				response.setContentType("text/html");
				PrintWriter x = response.getWriter();
				x.print("Login Fail!");
				RequestDispatcher rpq = request.getRequestDispatcher("WEB-INF/View/Login.jsp");
				rpq.include(request, response);
			}
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {
						e.printStackTrace();
		}
		
	}

}
