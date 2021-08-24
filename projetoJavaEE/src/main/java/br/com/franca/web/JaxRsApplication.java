package br.com.franca.web;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.apache.commons.logging.Log;

import br.com.franca.business.exception.BusinessRuleMapper;
import br.com.franca.web.api.controller.CategoriaControllerV1;
import br.com.franca.web.api.controller.CategoriaControllerV2;

@ApplicationPath("/jersey")
public class JaxRsApplication extends Application {
		
	@Inject
	private Log LOG;

	@Override
	public Set<Class<?>> getClasses() {
	LOG.debug("======= JaxRsApplication::getClasses =======");
	Set<Class<?>> resources = new HashSet<>();
	 
	//resources.add(ExceptionResource.class);
	//resources.add(IllegalArgumentExceptionMapper.class);
	
	resources.add(CategoriaControllerV1.class);
	resources.add(CategoriaControllerV2.class);
	resources.add(BusinessRuleMapper.class);
	
	return resources;
	 
	}

/*public class JaxRsApplication extends ResourceConfig {
	
	public JaxRsApplication() {
		packages("br.com.franca.web.api.implementations");
	}*/
}
