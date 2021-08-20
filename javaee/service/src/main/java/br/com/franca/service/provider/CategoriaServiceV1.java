package br.com.franca.service.provider;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.franca.api.v1.dto.CategoriaDTO;
import br.com.franca.api.v1.resources.CategoriaResource;
import br.com.franca.repository.CategoriaRepository;
import br.com.franca.repository.domain.Categoria;

public class CategoriaServiceV1 implements CategoriaResource {

	@Inject
	private CategoriaRepository repository;

	@Override
	public List<CategoriaDTO> findAll() {
		System.out.println("CategoriaServiceV1 :: findAll :: BEGIN");

		List<Categoria> categorias = repository.findAll();

		categorias.forEach(e -> System.out.println(e.toString()));

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV1");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();

		categoriasDTO.add(categoriaDTO);
		
		return categoriasDTO;
	}

}
