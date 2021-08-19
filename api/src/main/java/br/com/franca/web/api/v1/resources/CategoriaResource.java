package br.com.franca.web.api.v1.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.franca.web.api.v1.dto.CategoriaDTO;

@Path("/categorias")
/*
 * @Consumes({ "application/vnd.blog.v1+xml", "application/vnd.blog.v1+json" })
 * 
 * @Produces({ "application/vnd.blog.v1+xml", "application/vnd.blog.v1+json" })
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface CategoriaResource {

	@GET
	List<CategoriaDTO> findAll();

}
