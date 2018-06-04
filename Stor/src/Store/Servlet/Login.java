package Store.Servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Store.DAO.Impl.UserDAOImpl;
import Store.Domain.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("name");
	        String password = request.getParameter("password");
	        Map<String, String> messages = new HashMap<String, String>();

	        if (username == null || username.isEmpty()) {
	            messages.put("username", "Please enter username");
	        }

	        if (password == null || password.isEmpty()) {
	            messages.put("password", "Please enter password");
	        }
	        if (messages.isEmpty()) {
	            User user = new UserDAOImpl().getUserByNameAndPassword(username, password) ;

	            if (user != null) {
	                request.getSession().setAttribute("user", user);
	                response.sendRedirect(request.getContextPath());
	                return;
	            } else {
	                messages.put("login", "Unknown login, please try again");
	            }  
	        }

	        request.setAttribute("messages", messages);
	        request.getRequestDispatcher("error.jsp").forward(request, response);
	    }
}
