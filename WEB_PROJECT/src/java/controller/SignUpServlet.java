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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import entity.Account;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SignUpServlet", urlPatterns = {"/SignUpServlet"})
public class SignUpServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SignUpServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUpServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String account = request.getParameter("user_name");
        request.setAttribute("userName", account);
        String pass = request.getParameter("password");
        request.setAttribute("pass", pass);
        String confirm = request.getParameter("confirm");
        request.setAttribute("confirm", confirm);
        request.setAttribute("isDuplicated", false);
        request.setAttribute("isEmpty", false);
        request.setAttribute("confirmPass", false);

        Object logInObject = session.getAttribute("log_in_already");
        Object passObject = session.getAttribute("pass_session");
        //            MSSQLConnedction dBContext = new MSSQLConnedction();
//            DAO databaseDao = new DAO(dBContext);
//            Management management = new Management(databaseDao);
        AccountDAO dao = new AccountDAO();
//int id = management.getAccountId(account, pass);
        if (logInObject != null && passObject != null) {
            String user = (String) session.getAttribute("log_in_already");
            String password = (String) session.getAttribute("pass_session");
            int id = dao.getId(user, password);
            response.sendRedirect("home?ID=" + id);
            return;
        }
        request.getRequestDispatcher("/sign_up.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("isDuplicated", false);
        request.setAttribute("isEmpty", false);
        request.setAttribute("confirmPass", false);
        String account = request.getParameter("user_name");
        request.setAttribute("userName", account);
        String pass = request.getParameter("password");
        request.setAttribute("pass", pass);
        String confirm = request.getParameter("confirm");
        request.setAttribute("confirm", confirm);

        if (account.equals(null) || pass.equals(null) || confirm.equals(null)
                || account.trim().equals("") || pass.trim().equals("") || confirm.trim().equals("")) {
            request.setAttribute("isEmpty", true);
            request.getRequestDispatcher("/sign_up.jsp").forward(request, response);
            return;
        }

        AccountDAO dao = new AccountDAO();
        List<Account> accounts = dao.getAll();
        for (Account acc : accounts) {
            if (acc.getAccount().equals(account)) {
                request.setAttribute("isDuplicated", true);
                request.getRequestDispatcher("/sign_up.jsp").forward(request, response);
                return;
            }
        }
        if (!pass.equals(confirm)) {
            request.setAttribute("confirmPass", true);
            request.getRequestDispatcher("/sign_up.jsp").forward(request, response);
            return;
        }
        dao.add(new Account(0, account, pass));
        int id = dao.getId(account, pass);
        HttpSession session = request.getSession();
        session.setAttribute("log_in_already", account);
        session.setAttribute("pass_session", pass);
        response.sendRedirect("home?ID=" + id);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
