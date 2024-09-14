package com.pdfreportcard.model;

import java.util.Map;

public class StudentRC
{
    private int rollNum;
    private String name;
    Map<String, Integer> subjects;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(Map<String, Integer> subjects) {
        this.subjects = subjects;
    }
}
