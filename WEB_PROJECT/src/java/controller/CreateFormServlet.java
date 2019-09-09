/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.QuestionDAO;
import DAO.TitleDAO;
import entity.Question;
import entity.Title;
import java.io.IOException;
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
@WebServlet(name = "CreateFormServlet", urlPatterns = {"/CreateFormServlet"})
public class CreateFormServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int userId= Integer.parseInt(request.getParameter("userId"));
        int titleId= Integer.parseInt(request.getParameter("titleId"));
        int formPage= Integer.parseInt(request.getParameter("formPage"));
        
        TitleDAO titleDao= new TitleDAO();
        Title title= titleDao.getOne(titleId);
        request.setAttribute("title", title.getTitle());
        request.setAttribute("discription", title.getDiscription());
        QuestionDAO questionDao= new QuestionDAO();
        List<Question> questionList=questionDao.getQuestions(userId, titleId);
        request.setAttribute("questions", questionList);
        request.setAttribute("page", formPage+"");
        int nextPage=formPage+1;
        request.setAttribute("nextPage", nextPage+"");
        request.getRequestDispatcher("/create_form.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
