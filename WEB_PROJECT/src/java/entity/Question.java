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
public class Question {
    int i;
    int stdId;
    int titleId;
    String ques;
    String ans;

    public Question() {
    }

    public Question(int i,int titleId, String ques, String ans, int stdId) {
        this.i = i;
        this.stdId = stdId;
        this.titleId = titleId;
        this.ques = ques;
        this.ans = ans;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Question{" + "i=" + i + ", stdId=" + stdId + ", titleId=" + titleId + ", ques=" + ques + ", ans=" + ans + '}';
    }

    
    

   
    
}
