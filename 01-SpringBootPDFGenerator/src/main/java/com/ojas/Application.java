package com.ojas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ojas.pdf.PDFGenerator;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.dev.springboot"})
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac=	SpringApplication.run(Application.class, args);
		
		
		
		
		
		PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);
		
		pDFGenerator.generatePdfReport();
	}

}
