package br.com.franca.web.api.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.business.CategoriaBusiness;
import br.com.franca.domain.Categoria;
import br.com.franca.web.api.v1.dto.CategoriaDTO;
import br.com.franca.web.api.v1.interfaces.CategoriaAPI;

@RequestScoped
public class CategoriaControllerV1 implements CategoriaAPI {
	
	private Log LOG;
	private Logger log;
	
	private CategoriaBusiness business;
	
	public CategoriaControllerV1() throws SecurityException, IOException {
		// teste salvando o log no diretorio
		
		log = Logger.getLogger(CategoriaControllerV1.class.getName());
		ConsoleHandler conHandler = new ConsoleHandler();
		FileHandler fileHandler;
		
		fileHandler = new FileHandler("d:/rodrigo/git_repo/full-stack/tmp/fileLog.out");
		
		log.addHandler(conHandler);
		// salva apenas SEVERE
		fileHandler.setLevel(Level.SEVERE);
		
		log.addHandler(fileHandler);
		log.info("teste log: info");
		log.severe("teste log: severe");
		fileHandler.close();
				
	}	

	@Inject
	public CategoriaControllerV1(Log LOG, @Default CategoriaBusiness business) {	
		this.LOG = LOG;
		this.business = business;
	}
	
	@PostConstruct
	public void init(){		
		LOG.info("====== CategoriaControllerV1:: int:: ======");
	}	

	@Override
	public List<CategoriaDTO> findAll() {

		LOG.info("----------------------findAll::BEGIN--------------------------------");

		List<Categoria> categorias = business.findAll();
				
/*		
		try {
		
			if (categorias!=null){
				throw new RestException("Exemplo de MSG de ERRO em REST", Status.NOT_FOUND);
				// throw new BadRequestException();
			}
			
		} catch (Exception e) {
			LOG.error(e.getMessage());
		}
	*/	
		
		
		categorias.forEach(e -> LOG.info("categoria: " + e.toString()));

		// converter para dto
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		categoriaDTO.setId(2);
		categoriaDTO.setNome("CategoriDTOV1");

		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();
		categoriasDTO.add(categoriaDTO);
		categoriasDTO.forEach(e -> LOG.info("categoriaDTO: " + e.toString()));

		LOG.info("----------------------findAll::END--------------------------------");
		return categoriasDTO;
	}

}

