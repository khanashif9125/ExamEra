package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resultId;

    private String username;
    private int attempted;
    private double marksScored;
    private String category;

    public Result() {
    }

    public Result( String username,double marksScored, int attempted,String category) {
        this.username = username;
        this.attempted=attempted;
        this.marksScored = marksScored;

        this.category = category;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public double getMarksScored() {
        return marksScored;
    }

    public void setMarksScored(int marksScored) {
        this.marksScored = marksScored;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
