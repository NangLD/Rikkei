/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Account {
    private int id;
    private String account;
    private String passWord;
   
    public Account() {
    }

    public Account(int id, String account, String passWord) {
        this.id = id;
        this.account = account;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", account=" + account + ", passWord=" + passWord + '}';
    }

    

    
    
}
