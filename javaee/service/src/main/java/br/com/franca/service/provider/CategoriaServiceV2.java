package br.com.franca.service.provider;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.franca.api.v2.dto.CategoriaDTO;
import br.com.franca.api.v2.resources.CategoriaResource;
import br.com.franca.repository.CategoriaRepository;
import br.com.franca.repository.domain.Categoria;

@RequestScoped
public class CategoriaServiceV2 implements CategoriaResource {
	
	private CategoriaRepository repository;
	
	@Inject
	public CategoriaServiceV2(CategoriaRepository repository) {
		this.repository = repository;		
	}

	@Override
	public List<CategoriaDTO> findAll() {
		
		System.out.println("CategoriaServiceV2 :: findAll :: BEGIN");

		List<Categoria> categorias = repository.findAll();

		categorias.forEach(e -> System.out.println(e.toString()));

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV2");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();

		categoriasDTO.add(categoriaDTO);
		return categoriasDTO;
	}

}
