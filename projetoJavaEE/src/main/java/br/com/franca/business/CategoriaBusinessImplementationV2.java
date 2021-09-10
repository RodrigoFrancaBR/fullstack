package br.com.franca.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.domain.Categoria;
import br.com.franca.jms.JMSUtil;
import br.com.franca.repository.CategoriaRepository;

@Prioridade
public class CategoriaBusinessImplementationV2 implements CategoriaBusiness {
	private Log LOG;
	private CategoriaRepository repository;

	@PostConstruct
	public void init() {
		LOG.info("----------------------INIT--------------------------------");
	}

	@Inject
	public CategoriaBusinessImplementationV2(Log LOG, CategoriaRepository repository) {
		this.LOG = LOG;
		this.repository = repository;
	}

	@Override
	public List<Categoria> findAll() {
		LOG.info("----------------------findAll::BEGIN--------------------------------");
		JMSUtil JMSUtil = new JMSUtil();
		JMSUtil.start();
		String message = JMSUtil.getMessage();
		
		LOG.info("message: " + message);
		
		List<Categoria> categorias = repository.findAll();
		
		categorias.forEach(e -> LOG.info("categoria: " + e.toString()));

		LOG.info("----------------------findAll::END--------------------------------");
		return categorias;
	}

}
