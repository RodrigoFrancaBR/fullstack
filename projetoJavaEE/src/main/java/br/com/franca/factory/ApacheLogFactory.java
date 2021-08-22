package br.com.franca.factory;

import java.io.IOException;
import java.lang.reflect.Member;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ApacheLogFactory {
	
	@Produces
	public Log factory(InjectionPoint injectionPoint) {
		// pega o nome da classe que vai ser logada	
		Member member = injectionPoint.getMember();
		Class<?> declaringClass = member.getDeclaringClass();
		String name = declaringClass.getName();

		// log util configurado dentro de um logger da apache
		/*
		Logger log = Logger.getLogger(name);
		ConsoleHandler conHandler = new ConsoleHandler();
		FileHandler fileHanlder;
		
		fileHanlder = new FileHandler("d:/rodrigo/git_repo/full-stack/tmp/fileLog.out");

		log.addHandler(conHandler);
		log.addHandler(fileHanlder);		
		return org.apache.commons.logging.LogFactory.getLog(Logger.class);
		*/
		
		// coisas possíveis com a interface InjectionPoint
		/*
		 * Type type = injectionPoint.getType(); 
		 * Bean<?> bean = injectionPoint.getBean(); 
		 * Annotated annotated = injectionPoint.getAnnotated(); 
		 * injectionPoint.isDelegate(); 
		 * injectionPoint.isTransient();
		 */
		
		 return LogFactory.getLog(name);
		

	}
}
