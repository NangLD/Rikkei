/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AccountDAO;
import DBContext.MSSQLConnedction;
import exception.MyException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "LogInServlet", urlPatterns = {"/LogInServlet"})
public class LogInServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogInServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LogInServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("isEmpty", false);
        request.setAttribute("isExisted", false);
        HttpSession session = request.getSession();
        Object logInObject = session.getAttribute("log_in_already");
        Object passObject = session.getAttribute("pass_session");
        //            MSSQLConnedction dBContext = new MSSQLConnedction();
//            DAO databaseDao = new DAO(dBContext);
//            Management management = new Management(databaseDao);
        AccountDAO dao = new AccountDAO();
//        String user = request.getParameter("user_name");
//        String pass = request.getParameter("pass_word");
//int id = management.getAccountId(user, pass);
        if (logInObject != null && passObject != null) {
            String user = (String) session.getAttribute("log_in_already");
            String pass = (String) session.getAttribute("pass_session");
            int id = dao.getId(user, pass);
            response.sendRedirect("home?ID=" + id);
            return;
        }
        request.getRequestDispatcher("/log_in.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user_name");
        String pass = request.getParameter("pass_word");
        request.setAttribute("account", user);
        request.setAttribute("pass", pass);
        request.setAttribute("isEmpty", false);
        request.setAttribute("isExisted", false);
        if (user.equals(null) || user.trim().equals("")
                || pass.equals(null) || pass.trim().equals("")) {
            request.setAttribute("isEmpty", true);
            request.getRequestDispatcher("/log_in.jsp").forward(request, response);
            return;
        }
        //            MSSQLConnedction dBContext = new MSSQLConnedction();
//            DAO databaseDao = new DAO(dBContext);
//            Management management = new Management(databaseDao);
        AccountDAO dao = new AccountDAO();
        int id = dao.getId(user, pass);
        if (id == -1) {
            request.setAttribute("isExisted", true);
            request.getRequestDispatcher("/log_in.jsp").forward(request, response);
            return;
        }
        HttpSession session = request.getSession();
        session.setAttribute("log_in_already", user);
        session.setAttribute("pass_session", pass);
        response.sendRedirect("home?ID=" + id);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
