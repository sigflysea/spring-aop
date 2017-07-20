package com.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.dao.AccountDAO;
import com.aop.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args){
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
	
	theAccountDAO.addAccount();
	
	//adding account with different DAO membership
	
	MembershipDAO theMemDAO = context.getBean("membershipDAO", MembershipDAO.class);
	
	theMemDAO.addAccount();
	
	context.close();

	}

}
