package com.pdfreportcard.service.impl;

import com.pdfreportcard.model.StudentRC;
import com.pdfreportcard.service.MyReportCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.List;

@Service
public class MyReportCardImpl implements MyReportCardService
{

    @Autowired
    SpringTemplateEngine templateEngine;

    @Override
    public String generatePdf(StudentRC studentRC) {

        Context context = new Context();
        context.setVariable("rollNum",studentRC.getRollNum());
        context.setVariable("name",studentRC.getName());
//        context.setVariable("subjects",studentRC.getSubjects());
        context.setVariable("math",studentRC.getSubjects().get("math"));
        context.setVariable("physics",studentRC.getSubjects().get("physics"));
        context.setVariable("che",studentRC.getSubjects().get("che"));
        context.setVariable("english",studentRC.getSubjects().get("english"));

        String htmlFile =  templateEngine.process("ReportCard",context);

        ByteArrayOutputStream object = new ByteArrayOutputStream();

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(htmlFile);
        renderer.layout();
        renderer.createPDF(object);

        try {
            renderer.createPDF(object);

            try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\MyDownloadFile\\file.pdf")) {
                object.writeTo(fileOutputStream);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "PDF generated successfully";

    }


}
