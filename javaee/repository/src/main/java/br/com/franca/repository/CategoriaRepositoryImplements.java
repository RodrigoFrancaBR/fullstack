package br.com.franca.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;

import br.com.franca.repository.domain.Categoria;

@RequestScoped
public class CategoriaRepositoryImplements implements CategoriaRepository {

	public CategoriaRepositoryImplements() {
	}

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
