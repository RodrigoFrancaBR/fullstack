package br.com.franca.web.api.v2.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.franca.web.api.v2.dto.CategoriaDTO;



@Path("/categorias")

@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, "application/categorias.v2+xml","application/categorias.v2+json" })
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, "application/categorias.v2+xml","application/categorias.v2+json" })
public interface CategoriaAPI {
	
	@GET
	List<CategoriaDTO> findAll();

}
