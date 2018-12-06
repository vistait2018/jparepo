package com.prac;

import com.prac.controller.AuthorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PractiseApplication {

	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(PractiseApplication.class, args);
		System.out.print("*****************Beans*************************");
		AuthorController ac  = (AuthorController) ctx.getBean("authorController");
		ac.greet();


	}

}
