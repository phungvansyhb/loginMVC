package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Users;
import dao.RegisDao;
import db.DBconnect;


@WebServlet("/RegisController")
public class RegisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RegisController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rpq = request.getRequestDispatcher("WEB-INF/View/Regis.jsp");
		rpq.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter x = response.getWriter();
		//x.print(123);
		try {
			Connection conn = DBconnect.ConDB();
			request.setCharacterEncoding("UTF-8");
			String name = request.getParameter("name");
			String pass  = request.getParameter("password");
		//	x.println(name + pass);
			System.out.println(name + pass);
			Users user = new Users();
			user.setName(name);
			user.setPass(pass);
			boolean add = RegisDao.InsertAcc(conn, user);
			if(add) {
				response.setContentType("text/html");
				x.println("Regis Success! Now you can login");
				RequestDispatcher rpq = request.getRequestDispatcher("WEB-INF/View/Login.jsp");
				rpq.include(request, response);
				conn.close();
			}
			else {
				response.setContentType("text/html");
				x.println("dang ky that bai  !");
				RequestDispatcher rpq = request.getRequestDispatcher("WEB-INF/View/Regis.jsp");
				rpq.include(request, response);
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
