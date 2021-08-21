package br.com.franca.controller.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.api.v1.dto.CategoriaDTO;
import br.com.franca.api.v1.resources.CategoriaResource;
import br.com.franca.business.CategoriaBusiness;
import br.com.franca.repository.domain.Categoria;

public class CategoriaControllerV1 implements CategoriaResource {		
	private Log LOG;

	private CategoriaBusiness business;

	public CategoriaControllerV1() {
	}
	
	@Inject
	public CategoriaControllerV1(Log LOG, CategoriaBusiness business) {
		this.LOG = LOG;
		this.business = business;
	}

	@Override
	public List<CategoriaDTO> findAll() {		
				
		LOG.info("----------------------findAll::BEGIN--------------------------------");			

		List<Categoria> categorias = business.findAll();
		//categorias.forEach(e -> LOG.log(Level.INFO, "categoria: " + e.toString()));
		categorias.forEach(e -> LOG.info("categoria: " + e.toString()));
		
		// converter para dto
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV1");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();		
		categoriasDTO.add(categoriaDTO);		
		categoriasDTO.forEach(e -> LOG.info("categoriaDTO: " + e.toString()));
		
		LOG.info("----------------------findAll::END--------------------------------");
		return categoriasDTO;
	}

}
