package Controller;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Bean.Student;
import Model.Bo.CheckLoginBO;

@WebServlet("/Login")
public class CheckLoginServlet extends HttpServlet {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	CheckLoginBO checkLoginBO = new CheckLoginBO();
	ArrayList<Student> studentList = null;
	if(checkLoginBO.isValidUser(username, password)) {
		System.out.println("connected successfully");
		studentList = checkLoginBO.getList(username);
		request.setAttribute("studentArr", studentList);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/welcome.jsp");
		rd.forward(request, response);
	} else {
		System.out.println("Password or Username is incorrect");
	}

}
}
