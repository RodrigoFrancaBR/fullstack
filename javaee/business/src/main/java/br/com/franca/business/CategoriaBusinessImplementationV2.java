package br.com.franca.business;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.franca.repository.CategoriaRepository;
import br.com.franca.repository.domain.Categoria;

public class CategoriaBusinessImplementationV2 implements CategoriaBusiness {
	
	private static final Logger LOG = Logger.getLogger(CategoriaBusinessImplementationV2.class.getName());
	
	private CategoriaRepository repository;

	public CategoriaBusinessImplementationV2() {
	}
	
	public CategoriaBusinessImplementationV2(CategoriaRepository repository) {
		this.repository = repository;
	}	

	@Override
	public List<Categoria> findAll() {
		LOG.log(Level.INFO, "----------------------findAll::BEGIN--------------------------------");		
		
		// TODO implementar alguma regrea de negocio diferente da versao 1
		
		List<Categoria> categorias = repository.findAll();
		categorias.forEach(e -> LOG.log(Level.INFO, "categoria: " + e.toString()));
		
		LOG.log(Level.INFO, "----------------------findAll::END--------------------------------");
		return categorias;
	}

}
