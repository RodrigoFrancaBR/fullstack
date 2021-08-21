package br.com.franca.controller.factory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import br.com.franca.business.CategoriaBusiness;
import br.com.franca.business.CategoriaBusinessImplementationV1;
import br.com.franca.repository.CategoriaRepositoryImplements;

public class BusinessFactory {
	
	@Produces
	public CategoriaBusiness factory(InjectionPoint injectionPoint) {
		/*Member member = injectionPoint.getMember();
		Type type = injectionPoint.getType();
		Bean<?> bean = injectionPoint.getBean();
		Annotated annotated = injectionPoint.getAnnotated();
		injectionPoint.isDelegate();
		injectionPoint.isTransient();*/
		return new CategoriaBusinessImplementationV1(new CategoriaRepositoryImplements());
	}
}
