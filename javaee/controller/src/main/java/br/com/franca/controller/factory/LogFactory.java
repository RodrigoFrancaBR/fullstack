package br.com.franca.controller.factory;

import java.lang.reflect.Member;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LogFactory {
	
	@Produces
	public Logger factory(InjectionPoint injectionPoint) {
		Member member = injectionPoint.getMember();
		Class<?> declaringClass = member.getDeclaringClass();
		String name = declaringClass.getName();
		
		/*
		Type type = injectionPoint.getType();
		Bean<?> bean = injectionPoint.getBean();
		Annotated annotated = injectionPoint.getAnnotated();
		injectionPoint.isDelegate();
		injectionPoint.isTransient();*/
		return Logger.getLogger(name);
	}
}
