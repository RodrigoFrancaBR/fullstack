package br.com.franca.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.business.exception.BusinessRuleException;
import br.com.franca.domain.Categoria;
import br.com.franca.repository.CategoriaRepository;

@Default
public class CategoriaBusinessImplementationV1 implements CategoriaBusiness {
	private Log LOG;
	private CategoriaRepository repository;

	@PostConstruct
	public void init() {
		LOG.info("----------------------INIT--------------------------------");
	}

	@Inject
	public CategoriaBusinessImplementationV1(Log LOG, CategoriaRepository repository) {
		this.LOG = LOG;
		this.repository = repository;
	}

	@Override
	public List<Categoria> findAll() {
		LOG.info("----------------------findAll::BEGIN--------------------------------");

		List<Categoria> categorias = repository.findAll();
		
		if (categorias!=null){
			System.out.println("erro");
		throw new BusinessRuleException("Exemplo de erro de Business!!");	
		}
		
		categorias.forEach(e -> LOG.info("categoria: " + e.toString()));

		LOG.info("----------------------findAll::END--------------------------------");
		return categorias;
	}

}
