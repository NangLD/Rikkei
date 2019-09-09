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
public class Title {
    private int id;
    private String title;
    private String discription;
    private int accoun_id;
    public Title() {
    }

    public Title(int id, String title, String discription, int accoun_id) {
        this.id = id;
        this.title = title;
        this.discription = discription;
        this.accoun_id = accoun_id;
    }

    public int getAccoun_id() {
        return accoun_id;
    }

    public void setAccoun_id(int accoun_id) {
        this.accoun_id = accoun_id;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Title{" + "id=" + id + ", title=" + title + ", discription=" + discription + '}';
    }
    
}
