package br.com.franca.controller.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import br.com.franca.api.v2.dto.CategoriaDTO;
import br.com.franca.api.v2.resources.CategoriaResource;
import br.com.franca.business.CategoriaBusiness;
import br.com.franca.repository.domain.Categoria;

public class CategoriaControllerV2 implements CategoriaResource {
	private Logger LOG;

	private CategoriaBusiness business;

	public CategoriaControllerV2() {
	}

	@Inject
	public CategoriaControllerV2(Logger LOG, CategoriaBusiness business) {
		this.LOG = LOG;
		this.business = business;
	}

	@Override
	public List<CategoriaDTO> findAll() {
		LOG.log(Level.INFO, "----------------------findAll::BEGIN--------------------------------");
		
		List<Categoria> categorias = business.findAll();
		categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV2");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();
		categoriasDTO.add(categoriaDTO);
		
		LOG.log(Level.INFO, "----------------------findAll::END--------------------------------");
		return categoriasDTO;
	}

}
