package Store.Servlet.Administration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Store.DAO.Impl.UserDAOImpl;
import Store.Domain.User;



/**
 * Servlet implementation class UserData
 */
@WebServlet("/UserData")
public class UserData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "Edit":
			int id  = Integer.parseInt(request.getParameter("id"));
			User user = new UserDAOImpl().getById(id);
			request.setAttribute("user",user);
			request.getRequestDispatcher("/Registration.jsp").forward(request, response);
			break;

		case "Delete":
			delete(request,response);
			break;
			
		case "showAllUser":
			showAllUser(request,response);
			break;
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "Edit":
			edit(request,response);
			break;

		case "Delete":
			delete(request,response);
			break;
			
		case "showAllUser":
			showAllUser(request,response);
			break;
		}
		
		doGet(request, response);
	}

	private String showAllUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}


	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
	String name = request.getParameter("name");
		
		response.getWriter().append("Method delete success : "+ name).append(request.getContextPath());
		
	}

	private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name  = request.getParameter("id");
		response.getWriter().append("Method edit success : " + name).append(request.getContextPath());
		
	}

}
