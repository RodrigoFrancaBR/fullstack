package br.com.franca.repository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import br.com.franca.repository.domain.Categoria;

@Named
public class CategoriaRepositoryImplements implements CategoriaRepository {

	@Override
	public List<Categoria> findAll() {

		Categoria categoria = new Categoria();
		categoria.setId(1);
		categoria.setNome("Teste");
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(categoria);

		return categorias;
	}

}
