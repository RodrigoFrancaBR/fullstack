package br.com.franca.factory;

import java.lang.reflect.Member;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.apache.commons.logging.Log;

public class ApacheLogFactory {
	@Produces
	public Log factory(InjectionPoint injectionPoint) {
		Member member = injectionPoint.getMember();
		Class<?> declaringClass = member.getDeclaringClass();
		String name = declaringClass.getName();
		
		/*
		Type type = injectionPoint.getType();
		Bean<?> bean = injectionPoint.getBean();
		Annotated annotated = injectionPoint.getAnnotated();
		injectionPoint.isDelegate();
		injectionPoint.isTransient();*/		
		return org.apache.commons.logging.LogFactory.getLog(name);
		
	}
}
