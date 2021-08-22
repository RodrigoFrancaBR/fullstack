package br.com.franca.web;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/jersey")
public class JaxRsApplication extends ResourceConfig {
	
	public JaxRsApplication() {
		packages("br.com.franca.web.api.implementations");
	}
}
