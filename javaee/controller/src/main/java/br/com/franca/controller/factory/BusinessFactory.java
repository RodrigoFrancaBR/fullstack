package br.com.franca.controller.factory;

import java.lang.reflect.Member;
import java.lang.reflect.Type;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.InjectionPoint;

import br.com.franca.business.CategoriaBusiness;
import br.com.franca.business.CategoriaBusinessImplementationV1;
import br.com.franca.repository.CategoriaRepositoryImplements;

public class BusinessFactory {
	
	@Produces
	public CategoriaBusiness factory(InjectionPoint injectionPoint) {
		Member member = injectionPoint.getMember();
		Type type = injectionPoint.getType();
		Bean<?> bean = injectionPoint.getBean();
		Annotated annotated = injectionPoint.getAnnotated();
		injectionPoint.isDelegate();
		injectionPoint.isTransient();
		// return new CategoriaBusiness();
		return new CategoriaBusinessImplementationV1(new CategoriaRepositoryImplements());
	}
}
