/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DBContext.MSSQLConnedction;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AccountDAO {

    public List<Account> getAll() {
        List<Account> list = new ArrayList<>();
        String sql = "Select * from Account";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Account account = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                list.add(account);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Account getOne(int id) {
        String sql = "Select * from Account where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Account account = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                return account;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(Account account) {
        int check = 0;
        String sql = "INSERT INTO Account(user_name,password) VALUES(?,?)";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, account.getAccount());
            ps.setString(2, account.getPassWord());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(Account account, int id) {
        int check = 0;
        String sql = "update Account set user_name = ? , password = ? where id = ?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, account.getAccount());
            ps.setString(2, account.getPassWord());
            ps.setInt(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
    public int getId(String acc, String pass){
        String sql = "select * from Account where user_name=? and password=?";
        try {
            MSSQLConnedction con = new MSSQLConnedction();
            Connection connection = con.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, acc);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Account account = new Account(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));
                return account.getId();
            }
        } catch (Exception e) {
        }
        return -1;
    }
    
    public static void main(String[] args) {
        AccountDAO aO = new AccountDAO();
        //        List<Account> accounts = aO.getAll();
       // Account a = aO.getOne(1004);
        //        System.out.println("Account 1 is : " + a);
        //        System.out.println("ListAccount:" + accounts);
        //Account a = new Account(0, "Nang", "123456");
        System.out.println(aO.getId("Nang", "123456"));
//        if (aO.add(a)) {
//            System.out.println("add ok");
//        } else {
//            System.out.println("add fail");
//        }
        //a.setAccount("ducnang");
       
    }
}
