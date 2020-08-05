package p2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/auth")
public class AuthServlet extends HttpServlet {
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	
	if("jack".equals(username)&&"jill".equals(password)) {
	response.getWriter().println("<h1>Verified</h1>");
	}
	else {
		response.getWriter().println("<h1>Incorrect details: Try again!!!</h1>");
	}

}
}
