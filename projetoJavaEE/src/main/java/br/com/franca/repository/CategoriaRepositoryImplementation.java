package br.com.franca.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.domain.Categoria;

public class CategoriaRepositoryImplementation implements CategoriaRepository {
	
	@Inject
	private Log LOG;

	@PostConstruct
	public void init() {
		LOG.info("----------------------INIT--------------------------------");
	}

	public CategoriaRepositoryImplementation() {
	}

	@Override
	public List<Categoria> findAll() {
		LOG.info("----------------------findAll::BEGIN--------------------------------");

		Categoria categoria = new Categoria();
		categoria.setId(1);
		categoria.setNome("CATEGORIA_DOMAIN");

		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(categoria);
		categorias.forEach(e -> LOG.info("categoriaDTO: " + e.toString()));

		LOG.info("----------------------findAll::END--------------------------------");
		return categorias;
	}
}
