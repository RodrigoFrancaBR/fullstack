package br.com.franca.controller.factory;

import java.lang.reflect.Member;
import java.lang.reflect.Type;

import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.InjectionPoint;

public class LogFactory {
	public String factory(InjectionPoint injectionPoint) {
		Member member = injectionPoint.getMember();
		Class<?> declaringClass = member.getDeclaringClass();
		String name = declaringClass.getName();
		
		/*
		Type type = injectionPoint.getType();
		Bean<?> bean = injectionPoint.getBean();
		Annotated annotated = injectionPoint.getAnnotated();
		injectionPoint.isDelegate();
		injectionPoint.isTransient();*/
		return name;
	}
}
