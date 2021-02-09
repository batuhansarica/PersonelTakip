package web;

import dao.YemekDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Yemek;

@WebServlet("/edityemek")
public class EditYemekServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
    private YemekDAO yemekDAO;
   
    
     @Override
    public void init() {
        yemekDAO = new YemekDAO();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        doGet(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String gun = request.getParameter("gun");
        Yemek existingYemek = yemekDAO.selectYemek(gun);
        RequestDispatcher dispatcher = request.getRequestDispatcher("insertyemek.jsp");
        request.setAttribute("yemek", existingYemek);
        dispatcher.forward(request, response);
       
    }
    
    
    
    
    
    
    
    
    
    
}
