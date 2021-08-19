package br.com.franca.service.provider;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.franca.api.v1.dto.CategoriaDTO;
import br.com.franca.api.v1.resources.CategoriaResource;

@Named
@RequestScoped
public class CategoriaServiceV1 implements CategoriaResource {

	@Override
	public List<CategoriaDTO> findAll() {

		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(1);
		categoriaDTO.setNome("Teste");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();

		categoriasDTO.add(categoriaDTO);
		return categoriasDTO;
	}

}
