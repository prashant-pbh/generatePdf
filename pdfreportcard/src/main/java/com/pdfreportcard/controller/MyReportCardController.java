package com.pdfreportcard.controller;


import com.pdfreportcard.model.InputRequest;
import com.pdfreportcard.model.StudentRC;
import com.pdfreportcard.service.MyReportCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyReportCardController
{
    @Autowired
    MyReportCardService myReportCardPdf;

//    @RequestMapping("/getData/{name}/{students}")
//    public String getMyRepo(@PathVariable("name") String name, @PathVariable("students") List<StudentRC> students)
//    {
//        return myReportCardPdf.generatePdf(name,students);
//    }



    @PostMapping("/setData")
    public String setMyrepo(@RequestBody InputRequest inputRequest)
    {
//        System.out.println("userName=" + inputRequest.getUserName() + "" + "password=" + inputRequest.getPassword());
//        if(inputRequest.getUserName() == "Prashant" && inputRequest.getPassword() == 12345)
//        {
//            return myReportCardPdf.generatePdf(inputRequest.getStudent());
//        }
//        else {
//            return "Authentication Failed";
//        }
        return myReportCardPdf.generatePdf(inputRequest.getStudent());

    }
}
