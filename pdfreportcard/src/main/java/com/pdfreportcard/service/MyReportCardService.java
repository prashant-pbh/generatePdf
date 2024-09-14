package com.pdfreportcard.service;

import com.pdfreportcard.model.StudentRC;

import java.util.List;

public interface MyReportCardService
{
    public String generatePdf(StudentRC studentRC);
}
