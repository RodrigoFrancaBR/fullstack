package br.com.franca.controller.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.api.v2.dto.CategoriaDTO;
import br.com.franca.api.v2.resources.CategoriaResource;
import br.com.franca.business.CategoriaBusiness;
import br.com.franca.repository.domain.Categoria;

public class CategoriaControllerV2 implements CategoriaResource {
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
		categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV2");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();
		categoriasDTO.add(categoriaDTO);
		
		LOG.info("----------------------findAll::END--------------------------------");
		return categoriasDTO;
	}

}
