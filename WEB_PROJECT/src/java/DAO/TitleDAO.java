/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBContext.MSSQLConnedction;
import entity.Account;
import entity.Title;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TitleDAO {

    public List<Title> getByUserId(int id) {
        List<Title> list = new ArrayList<>();
        String sql = "Select * from Title where account_id= ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Title title = new Title(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
                list.add(title);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Title getOne(int id) {
        String sql = "Select * from Title where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Title title = new Title(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
                return title;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public Title getOneByOther(String t, String dis, int id) {
        String sql = "Select * from Title where title = ? and discription=? and account_id=?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,t);
            ps.setString(2, dis);
            ps.setInt(3, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Title title = new Title(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4));
                return title;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Title title) {
        int check = 0;
        String sql = "INSERT INTO Title(title,discription,account_id) VALUES(?,?,?)";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, title.getTitle());
            ps.setString(2, title.getDiscription());
            ps.setInt(3,title.getAccoun_id());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(Title title, int id) {
        int check = 0;
        String sql = "update Title set title = ? , discription = ?, account_id=? where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, title.getTitle());
            ps.setString(2, title.getDiscription());
            ps.setInt(3,title.getAccoun_id());
            ps.setInt(4, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    public boolean delete(int id){
        int check = 0;
        String sql = "delete Title where id = ?";
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

    public static void main(String[] args) {
        TitleDAO dao = new TitleDAO();
        //List<Title> t=dao.getByUserId(1005);
        //Title t = new Title(0, "khao sat suc khoe lan 2", "de cham soc cho hoc sinh");
        dao.update(new Title(0, "where?", "nowhere", 1005), 20);
        
        
    }
}
