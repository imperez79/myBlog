package Store.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Store.DAO.Impl.ArticleImpl;
import Store.Domain.Article;


@WebServlet("/ArticleServlet")
public class ArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		if(request.getParameter("idArt")!= null) {
			showArticle(request,response);
		}else {
		int idSc = Integer.parseInt(request.getParameter("idSub"));
		String subCategory = request.getParameter("nameSc");
		ArrayList<Article> arcticles = new ArticleImpl().getAllBySubCaregoryID( idSc) ;
		request.setAttribute("arcticles", arcticles);
		request.setAttribute("idC",subCategory );
		request.getRequestDispatcher("/Article.jsp").forward(request, response);
		}
	}

	
	private void showArticle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idArticle = Integer.parseInt(request.getParameter("idArt"));
		
		Article article = new ArticleImpl().getById(idArticle);
		request.setAttribute("article", article);
		
			request.getRequestDispatcher("NewFile.jsp").forward(request, response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
