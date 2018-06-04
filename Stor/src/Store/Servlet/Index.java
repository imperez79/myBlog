package Store.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Store.DAO.Impl.CategoryImpl;
import Store.DAO.Impl.SubCategoryImpl;
import Store.Domain.Category;
import Store.Domain.SubCategory;

@WebServlet("/index.jsp")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	ArrayList <Category> array = new CategoryImpl().getAll();
    
    	TreeMap <Category ,ArrayList<SubCategory>> map = new TreeMap<Category, ArrayList<SubCategory>>();
    	
		for (Category cat : array) {
		map.put(cat,new SubCategoryImpl().getAllByIdCategory(cat.getId()));
		}

    		request.setAttribute("category", map);
    		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
       }
	
	
}
