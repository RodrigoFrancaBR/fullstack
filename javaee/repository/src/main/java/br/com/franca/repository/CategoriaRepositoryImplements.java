package br.com.franca.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.franca.repository.domain.Categoria;

public class CategoriaRepositoryImplements implements CategoriaRepository {

	@Override
	public List<Categoria> findAll() {

		System.out.println("CategoriaRepositoryImplements :: findAll :: BEGIN");

		Categoria categoria = new Categoria();
		categoria.setId(1);
		categoria.setNome("CATEGORIA_DOMAIN");
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(categoria);

		return categorias;
	}

}
