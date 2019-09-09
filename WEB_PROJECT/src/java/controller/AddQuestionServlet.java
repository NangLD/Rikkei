/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.QuestionDAO;
import entity.Question;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ShowQuestion", urlPatterns = {"/AddQuestionServlet"})
public class AddQuestionServlet extends HttpServlet {

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
            out.println("<title>Servlet ShowQuestion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShowQuestion at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        int id = Integer.parseInt(request.getParameter("ID"));
        String quesId = request.getParameter("quesId");
        if (!quesId.equals("null")) {
            QuestionDAO quesDao = new QuestionDAO();
            Question q = quesDao.getOne(Integer.parseInt(quesId));
            request.setAttribute("titleId", q.getTitleId()+"");
            request.setAttribute("question", q.getQues());
            request.getRequestDispatcher("QestionServlet").forward(request, response);
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
        try {
            int id = Integer.parseInt(request.getParameter("ID"));
        String quesId = request.getParameter("quesId");
        String question = (String) request.getParameter("question");
        String titleId=(String) request.getParameter("topic");
        QuestionDAO quesDao = new QuestionDAO();
        if(quesId.equals("null")){
            
            quesDao.add(new Question(0,Integer.parseInt(titleId),question,"",id));
        }
        else{
            quesDao.update(new Question(0,Integer.parseInt(titleId),question,"",id), Integer.parseInt(quesId));
        }
        request.getRequestDispatcher("QestionServlet").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("error", ex);
            RequestDispatcher view = request.getRequestDispatcher("WEB-INF/exceptions/error.jsp");
            view.forward(request, response);
        }
        
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
