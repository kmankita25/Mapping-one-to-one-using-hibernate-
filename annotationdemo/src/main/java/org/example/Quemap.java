package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Quemap {
    @Id
    private int questionId;
    private String question;
    @OneToOne
    private  Ansmap ans;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Ansmap getAns() {
        return ans;
    }

    public void setAns(Ansmap ans) {
        this.ans = ans;
    }

    public Quemap(int questionId, String question, Ansmap ans) {
        this.questionId = questionId;
        this.question = question;
        this.ans = ans;
    }

    public Quemap() {
    }
}
