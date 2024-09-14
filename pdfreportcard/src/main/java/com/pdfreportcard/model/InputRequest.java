package com.pdfreportcard.model;

import java.util.ArrayList;
import java.util.List;

public class InputRequest
{
    private StudentRC student;
    private String userName = "Prashant";
    private int password = 12345;

    public InputRequest() {

    }

    public InputRequest(StudentRC student) {
        this.student = student;
//        this.userName = userName;
//        this.password = password;
    }


//    public String getUserName() {
//        return userName;
//    }



//    public void setUserName(String userName) {
//        this.userName = userName;
//    }

//    public double getPassword() {
//        return password;
//    }

//    public void setPassword(int password) {
//        this.password = password;
//    }

    public StudentRC getStudent() {
        return student;
    }

    public void setStudent(StudentRC student) {
        this.student = student;
    }
}
