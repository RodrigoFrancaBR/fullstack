package br.com.franca.web.api;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.franca.domain.Categoria;

@Path("/api")
public class HelloJersey {

	@Inject
	Categoria categoria;

	private static Log LOG = LogFactory.getLog(HelloJersey.class);

	@GET
	@Path("/hello")
	public Response hello() {
		categoria.setId(2);
		categoria.setNome("MyCategoria");
		LOG.info(categoria.toString());
		return Response.status(Status.OK).build();
	}
}
