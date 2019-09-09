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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "SubmitFormServlet", urlPatterns = {"/SubmitFormServlet"})
public class SubmitFormServlet extends HttpServlet {

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
            out.println("<title>Servlet SubmitFormServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SubmitFormServlet at " + request.getContextPath() + "</h1>");
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
        int userId = Integer.parseInt(request.getParameter("userId"));
        int titleId = Integer.parseInt(request.getParameter("titleId"));
        int pageForm = Integer.parseInt(request.getParameter("formPage"));
        QuestionDAO questionDao = new QuestionDAO();
        List<Question> questions = questionDao.getQuestions(userId, titleId);
        int size = questions.size();
        int current = 0;
        for (int i = 1; i < 6 && (5 * (pageForm - 1) + i) <= size; i++) {
            current = 5 * (pageForm - 1) + i;
            Question q = questions.get(current - 1);
            String ans= request.getParameter(q.getI()+"");
            questionDao.update(new Question(0,titleId,q.getQues(),ans,q.getStdId()), q.getI());
        }
        String isNext=request.getParameter("next");
         if(isNext.equals("0")){
             request.setAttribute("userId", userId);
             request.setAttribute("titleId", titleId);
             request.setAttribute("formPage", pageForm);
             //response.sendRedirect("/submit_done.jsp");
             request.getRequestDispatcher("/submit_done.jsp").forward(request, response);
         }else{
             String nextPage= request.getParameter("nextPage");
             response.sendRedirect("CreateFormServlet?userId="+userId+"&titleId="+titleId+"&formPage="+nextPage);
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
