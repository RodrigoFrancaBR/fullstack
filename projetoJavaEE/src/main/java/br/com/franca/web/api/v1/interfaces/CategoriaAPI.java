package br.com.franca.web.api.v1.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.franca.web.api.v1.dto.CategoriaDTO;

@Path("/categorias")

@Consumes({ "application/categorias.v1+xml", "application/categorias.v1+json" })
@Produces({ "application/categorias.v1+xml", "application/categorias.v1+json" })
public interface CategoriaAPI {

	@GET
	List<CategoriaDTO> findAll();
}
