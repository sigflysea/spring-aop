package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(DemoConfig.class);
	AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
	
	theAccountDAO.addAccount();
	
	context.close();

	}

}
