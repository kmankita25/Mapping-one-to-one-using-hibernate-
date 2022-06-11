package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ansmap {
    @Id
    private int answerId;
    private String ans;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Ansmap(int answerId, String ans) {
        this.answerId = answerId;
        this.ans = ans;
    }

    public Ansmap() {
    }
}
