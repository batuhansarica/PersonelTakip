/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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


@WebServlet("/listyemek")
public class YemekServlet extends HttpServlet {
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
        List<Yemek> listYemek = yemekDAO.selectAllYemeks();
        request.setAttribute("listYemek", listYemek);
        RequestDispatcher dispatcher = request.getRequestDispatcher("profile.jsp");
        dispatcher.forward(request, response);       
        
   
    }
    
    
    
}
