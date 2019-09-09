/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TitleDAO;
import entity.Title;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AddTitleServlet", urlPatterns = {"/AddTitleServlet"})
public class AddTitleServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int id = Integer.parseInt(request.getParameter("ID"));
        //int titleId = Integer.parseInt(request.getParameter("titleId"));
        String titleId=request.getParameter("titleId");
        String title = request.getParameter("Title");
            String discription = request.getParameter("Discription");
            TitleDAO titleDao = new TitleDAO();
            
        if (titleId.equals("null")) {
            titleDao.add(new Title(0, title,discription,id));
        }else{
            titleDao.update(new Title(1,title, discription,id), Integer.parseInt(titleId));
        }
        request.getRequestDispatcher("TitleServlet").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("ID"));
        String titleId=request.getParameter("titleId");
       // request.getRequestDispatcher("/home_title.jsp").forward(request, response);
        if (!titleId.equals("null")) {
            TitleDAO titleDao = new TitleDAO();
            Title t= titleDao.getOne(Integer.parseInt(titleId));
            request.setAttribute("title", t.getTitle());
            request.setAttribute("discription", t.getDiscription());
            request.getRequestDispatcher("TitleServlet").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
