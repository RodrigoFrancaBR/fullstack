package br.com.franca.controller.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.franca.api.v2.dto.CategoriaDTO;
import br.com.franca.api.v2.resources.CategoriaResource;
import br.com.franca.business.CategoriaBusiness;
import br.com.franca.repository.domain.Categoria;

public class CategoriaControllerV2 implements CategoriaResource {

	@Inject
	private CategoriaBusiness business;

	public CategoriaControllerV2() {
	}

	public CategoriaControllerV2(CategoriaBusiness business) {
		this.business = business;
	}

	@Override
	public List<CategoriaDTO> findAll() {
		System.out.println("CategoriaControllerV2 :: findAll :: BEGIN");

		List<Categoria> categorias = business.findAll();
		categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV2");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();

		categoriasDTO.add(categoriaDTO);

		return categoriasDTO;
	}

}
