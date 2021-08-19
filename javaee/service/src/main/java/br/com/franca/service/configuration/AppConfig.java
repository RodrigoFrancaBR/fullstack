package br.com.franca.service.configuration;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/jersey")
public class AppConfig extends ResourceConfig {
	public AppConfig() {
		packages("br.com.franca.service.provider");
	}
}
