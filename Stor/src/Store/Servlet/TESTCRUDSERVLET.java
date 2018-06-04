package Store.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Store.DAO.Impl.UserDAOImpl;
import Store.Domain.User;

/**
 * Servlet implementation class TESTCRUDSERVLET
 */
@WebServlet("/TESTCRUDSERVLET")
public class TESTCRUDSERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TESTCRUDSERVLET() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAOImpl crud = new UserDAOImpl();
		
		   User newuser = new User();
		   newuser.setName("petr");
		   newuser.setPassword("petr");
		   newuser.setEmail("petr@pter.ru");
		   newuser.setTmpPassword("tmpPetr");
		   newuser.setIdRole(1);
		   System.out.println("Создали " + newuser);
		   crud.insert(newuser);
		   System.out.println("Вставили");
		   User nuser = crud.getUserByNameAndPassword("petr","petr");
		   System.out.println(nuser);
		   crud.getById(nuser.getId());
		   System.out.println("Получили по id");
		   crud.edit(newuser);
		   System.out.println("Изменили");
		   crud.delete(nuser);
		   System.out.println("Удалили");
		   ArrayList<User> list = crud.getAll();
		   for(User u : list) {
			   System.out.println(u.getName());
		   }
		   System.out.println("Получили все " + list.size() + " записи");
		   
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
