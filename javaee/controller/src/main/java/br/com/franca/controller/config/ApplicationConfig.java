package br.com.franca.controller.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/jersey")
public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		packages("br.com.franca.controller.implementations");
	}

}
