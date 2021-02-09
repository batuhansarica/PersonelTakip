package web;

import dao.AdminDAO;
import dao.UserDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;
import model.User;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}
        
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            
            String kadi = request.getParameter("kadi");
            String password = request.getParameter("password");
            AdminDAO adminDao = new AdminDAO();
            
            try {
                        Admin admin = adminDao.checkLogin(kadi, password);
			
                        
			String destPage = "admingiris.jsp";
			
                        if (admin != null) {
				HttpSession session = request.getSession();
				session.setAttribute("admin", admin);
				destPage = "admin.jsp";
			}
                        
			 else {
				String message = "Hatali kullanici.";
				request.setAttribute("message", message);
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
			dispatcher.forward(request, response);
			
		} catch (SQLException | ClassNotFoundException ex) {
			throw new ServletException(ex);
		}
        
    }
       
        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
                String email = request.getParameter("email");
                int id = Integer.parseInt(request.getParameter("id"));
                
		
		UserDAO userDao = new UserDAO();
                
		
		try {
                       
			User user = userDao.checkLogin(email, id);
                        
			String destPage = "personelgiris.jsp";
			
                        
                        if (user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				destPage = "profile.jsp";
			}
			 else {
				String message = "Hatali kullanici.";
				request.setAttribute("message", message);
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
			dispatcher.forward(request, response);
			
		} catch (SQLException | ClassNotFoundException ex) {
			throw new ServletException(ex);
		}
	}

}
