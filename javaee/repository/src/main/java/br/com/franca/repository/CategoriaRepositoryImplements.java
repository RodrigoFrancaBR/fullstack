package br.com.franca.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.franca.repository.domain.Categoria;

public class CategoriaRepositoryImplements implements CategoriaRepository {
	private static final Logger LOG = Logger.getLogger(CategoriaRepositoryImplements.class.getName());

	public CategoriaRepositoryImplements() {
	}

	@Override
	public List<Categoria> findAll() {
		LOG.log(Level.INFO, "----------------------findAll::BEGIN--------------------------------");		

		Categoria categoria = new Categoria();		
		categoria.setId(1);
		categoria.setNome("CATEGORIA_DOMAIN");
		
		List<Categoria> categorias = new ArrayList<Categoria>();		
		categorias.add(categoria);
		categorias.forEach(e -> LOG.log(Level.INFO, "categoria: " + e.toString()));

		LOG.log(Level.INFO, "----------------------findAll::END--------------------------------");
		return categorias;
	}

}
