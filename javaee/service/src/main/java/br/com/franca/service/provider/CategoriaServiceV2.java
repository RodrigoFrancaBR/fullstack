package br.com.franca.service.provider;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.franca.api.v2.dto.CategoriaDTO;
import br.com.franca.api.v2.resources.CategoriaResource;
import br.com.franca.repository.CategoriaRepository;
import br.com.franca.service.domain.CategoriaDomain;

@Named
@RequestScoped
public class CategoriaServiceV2 implements CategoriaResource {
	
	@Inject
	private CategoriaDomain categoria;
	/*	
	private CategoriaRepository repository;
		
	@Inject
	public CategoriaServiceV1(CategoriaRepository repository) {
		this.repository = repository;	
	}
	*/
	
	@Override
	public List<CategoriaDTO> findAll() {
		System.out.println(categoria.toString());
		// List<Categoria> categorias = repository.findAll();
		
		// categorias.forEach(c->System.out.println(c.getId() + " : " + c.getNome()));
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(1);
		categoriaDTO.setNome("Teste");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();

		categoriasDTO.add(categoriaDTO);
		return categoriasDTO;
	}

}
