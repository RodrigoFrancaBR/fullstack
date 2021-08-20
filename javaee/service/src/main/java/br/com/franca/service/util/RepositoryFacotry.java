package br.com.franca.service.util;

import java.lang.reflect.Type;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import br.com.franca.repository.CategoriaRepositoryImplements;

public class RepositoryFacotry {

	@Produces
	public CategoriaRepositoryImplements factory(InjectionPoint injectionPoint) {

		Type type = injectionPoint.getType();

		String name = type.getTypeName();

		System.out.println(name);

		return new CategoriaRepositoryImplements();

	}
}
