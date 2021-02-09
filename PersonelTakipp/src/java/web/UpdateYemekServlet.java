package web;

import dao.YemekDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Yemek;

@WebServlet("/updateyemek")
public class UpdateYemekServlet extends HttpServlet {
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
    try {
        String gun = request.getParameter("gun");
        String corba = request.getParameter("corba");
        String anayemek = request.getParameter("anayemek");
        String anayemek2 = request.getParameter("anayemek2");

        Yemek book3 = new Yemek(gun, corba, anayemek, anayemek2);
 
        yemekDAO.updateYemek(book3);
   
        response.sendRedirect("listyemek1");
    } catch (SQLException ex) {
        Logger.getLogger(UpdateYemekServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
            }
        
    }
    
    
    
    
    
    
    
    
    
    
