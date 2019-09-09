/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBContext.MSSQLConnedction;
import entity.Account;
import entity.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuestionDAO {
     public List<Question> getByUserId(int id) {
        List<Question> list = new ArrayList<>();
        String sql = "Select * from Question_Answer where account_id=?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question question = new Question(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                list.add(question);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
      public Question getOne(int id) {
        String sql = "Select * from Question_Answer where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                 Question question = new Question(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                return question;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public boolean add(Question q){
        int check=0;
        String sql = "INSERT INTO Question_Answer(title_id,question,answer,account_id) VALUES(?,?,?,?)";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, q.getTitleId());
            ps.setString(2, q.getQues());
            ps.setString(3, q.getAns());
            ps.setInt(4, q.getStdId());
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check >0;
    }
    public boolean update(Question q, int id){
        int check=0;
        String sql="update Question_Answer set title_id = ? , question = ?, answer=?, account_id=? where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,q.getTitleId());
            ps.setString(2, q.getQues());
            ps.setString(3, q.getAns());
            ps.setInt(4, q.getStdId());
            ps.setInt(5, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
        }
        return check>0;
    }
    public boolean delete(int id){
        int check = 0;
        String sql = "delete Question_Answer where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
        
    }
    public List<Question> getQuestions(int userId, int titleId){
        List<Question> list = new ArrayList<>();
        String sql = "Select * from Question_Answer where account_id=? and title_id=?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2,titleId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Question question = new Question(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5));
                list.add(question);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
     public static void main(String[] args) {
        QuestionDAO aO = new QuestionDAO();
       // List<Question> list =aO.getAll();
        
        Question q = new Question(0,2,"Who?","a phuong",1003);
        if(aO.update(q,8)){
            System.out.println(" updated oke");
        }
        else{
            System.out.println("fail");
        }
    }
}
