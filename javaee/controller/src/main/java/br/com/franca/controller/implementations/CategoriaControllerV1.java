package br.com.franca.controller.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.franca.api.v1.dto.CategoriaDTO;
import br.com.franca.api.v1.resources.CategoriaResource;
import br.com.franca.business.CategoriaBusiness;
import br.com.franca.repository.domain.Categoria;

@RequestScoped
public class CategoriaControllerV1 implements CategoriaResource {


	private CategoriaBusiness business;

	public CategoriaControllerV1() {
	}
	
	@Inject
	public CategoriaControllerV1(CategoriaBusiness business) {
		this.business = business;
	}

	@PostConstruct
	public void init() {
		System.out.println("Iniciando CategoriaControllerV1");
		System.out.println(business);
	}

	@Override
	public List<CategoriaDTO> findAll() {
		System.out.println("CategoriaControllerV1 :: findAll :: BEGIN");

		List<Categoria> categorias = business.findAll();
		categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV1");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();

		categoriasDTO.add(categoriaDTO);

		return categoriasDTO;
	}

}
