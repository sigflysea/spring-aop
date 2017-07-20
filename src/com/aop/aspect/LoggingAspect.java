package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(public void com.aop.dao.AccountDAO.addAccount())")
	public void beforeAddAccount(){
		System.out.println("\n =====> executing @Before advice\n");
		
	}
}
