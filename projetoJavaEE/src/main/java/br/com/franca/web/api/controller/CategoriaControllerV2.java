package br.com.franca.web.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.business.CategoriaBusiness;
import br.com.franca.domain.Categoria;
import br.com.franca.web.api.v2.dto.CategoriaDTO;
import br.com.franca.web.api.v2.interfaces.CategoriaAPI;



public class CategoriaControllerV2 implements CategoriaAPI {	
	private Log LOG;

	private CategoriaBusiness business;

	public CategoriaControllerV2() {
	}

	@Inject
	public CategoriaControllerV2(Log LOG, CategoriaBusiness business) {
		this.LOG = LOG;
		this.business = business;
	}

	@Override
	public List<CategoriaDTO> findAll() {

		LOG.info("----------------------findAll::BEGIN--------------------------------");

		List<Categoria> categorias = business.findAll();
		
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
