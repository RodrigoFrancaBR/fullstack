package br.com.franca.business;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.franca.repository.CategoriaRepository;
import br.com.franca.repository.domain.Categoria;

public class CategoriaBusinessImplementationV1 implements CategoriaBusiness {
	private static final Logger LOG = Logger.getLogger(CategoriaBusinessImplementationV1.class.getName());
	
	private CategoriaRepository repository;

	public CategoriaBusinessImplementationV1() {
	}

	public CategoriaBusinessImplementationV1(CategoriaRepository repository) {
		this.repository = repository;
	}	

	@Override
	public List<Categoria> findAll() {
		
		LOG.log(Level.INFO, "----------------------findAll::BEGIN--------------------------------");
		
		// alguma regra de negócio diferente da versão 2
		List<Categoria> categorias = repository.findAll();
		
		categorias.forEach(e -> LOG.log(Level.INFO, "categoria: " + e.toString()));
		
		LOG.log(Level.INFO, "----------------------findAll::END--------------------------------");
		return categorias;
	}

}
