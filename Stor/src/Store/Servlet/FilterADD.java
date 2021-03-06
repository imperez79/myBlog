package Store.Servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/Administration/*")
public class FilterADD implements Filter {
 
    public FilterADD() {
    
    }

	public void destroy() {
	
	}
		 @Override
		    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {    
		        HttpServletRequest request = (HttpServletRequest) req;
		        HttpServletResponse response = (HttpServletResponse) res;
		        HttpSession session = request.getSession(false);
		        String loginURI ="login.jsp";

		        boolean loggedIn = session != null && session.getAttribute("user") != null;
		        boolean loginRequest = request.getRequestURI().equals(loginURI);

		        if (loggedIn||loginRequest) {
		            chain.doFilter(request, response);
		        } else {
		            response.sendRedirect(request.getContextPath()+"/Registration.jsp");
		        }
		    }

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
