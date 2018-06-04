package Store.Servlet.Administration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CategoryCRUD
 */
@WebServlet("/CategoryCRUD")
public class CategoryManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CategoryManager() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		addCategory(request, response);
		deleteCategory(request, response);
		updateCategory(request, response);
		
		
				doGet(request, response);
	}
	private void addCategory(HttpServletRequest request, HttpServletResponse response) {
		
	}
	private void deleteCategory(HttpServletRequest request, HttpServletResponse response) {
		
	}
	private void updateCategory(HttpServletRequest request, HttpServletResponse response) {
		
	}

}

	