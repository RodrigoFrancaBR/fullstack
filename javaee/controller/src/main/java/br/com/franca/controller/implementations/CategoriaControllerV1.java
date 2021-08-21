package br.com.franca.controller.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import br.com.franca.api.v1.dto.CategoriaDTO;
import br.com.franca.api.v1.resources.CategoriaResource;
import br.com.franca.business.CategoriaBusiness;
import br.com.franca.repository.domain.Categoria;

public class CategoriaControllerV1 implements CategoriaResource {
	
	private static final Logger LOG = Logger.getLogger(CategoriaControllerV1.class.getName());

	private CategoriaBusiness business;

	public CategoriaControllerV1() {
	}
	
	@Inject
	public CategoriaControllerV1(CategoriaBusiness business) {
		this.business = business;
	}

	@Override
	public List<CategoriaDTO> findAll() {
		
		LOG.log(Level.INFO, "----------------------findAll::BEGIN--------------------------------");			

		List<Categoria> categorias = business.findAll();
		// categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));
		categorias.forEach(e -> LOG.log(Level.INFO, "categoria: " + e.toString()));
		
		// converter para dto
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV1");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();		
		categoriasDTO.add(categoriaDTO);
		
		categoriasDTO.forEach(e -> LOG.log(Level.INFO, "categoriaDTO: " + e.toString()));
		
		LOG.log(Level.INFO, "----------------------findAll::END--------------------------------");
		return categoriasDTO;
	}

}
