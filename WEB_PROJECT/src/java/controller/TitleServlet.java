/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.TitleDAO;
import entity.Title;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "TitleServlet", urlPatterns = {"/TitleServlet"})
public class TitleServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        Object logInObject = session.getAttribute("log_in_already");
        Object passObject = session.getAttribute("pass_session");
        if (logInObject == null && passObject == null) {
            response.sendRedirect("LogInServlet");
            return;
        }
        String user = (String) session.getAttribute("log_in_already");
        request.setAttribute("userName", logInObject);
        try {
            Object o = request.getAttribute("isDeletedDone");
            if (o == null) {
                request.setAttribute("isDeletedDone", false);
                request.setAttribute("ten", "");
            } else {
                request.setAttribute("isDeletedDone", true);
                request.setAttribute("ten", request.getAttribute("ten"));
            }
            TitleDAO titleDao = new TitleDAO();
            String id = request.getParameter("ID");
            List<Title> titles = titleDao.getByUserId(Integer.parseInt(id));
            request.setAttribute("titles", titles);
            request.getRequestDispatcher("/home_title.jsp").forward(request, response);
        } catch (Exception e) {
        }

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
        processRequest(request, response);
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
