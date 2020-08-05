package p2;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUp extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String name= req.getParameter("name");
		String email= req.getParameter("email");
		String gender= req.getParameter("gender");
		String mobile= req.getParameter("mobile");
		
		String password=username.substring(0,2)+new Random().nextInt(927823);
		
		UserDTO userDTO=new UserDTO();
		userDTO.setUsername(username);
		userDTO.setName(name);
		userDTO.setEmail(email);
		userDTO.setGender(gender);
		userDTO.setMobile(mobile);
		userDTO.setPassword(password);
		
		req.setAttribute("mocha",userDTO);
		
		req.getRequestDispatcher("review.jsp").forward(req, resp);//go to review.jsp
		
	}
	

}
