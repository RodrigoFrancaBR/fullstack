package br.com.franca.web.api.implementations;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.apache.commons.logging.Log;

import br.com.franca.business.CategoriaBusiness;
import br.com.franca.business.Prioridade;
import br.com.franca.domain.Categoria;
import br.com.franca.web.api.v1.dto.CategoriaDTO;
import br.com.franca.web.api.v1.interfaces.CategoriaAPI;

@RequestScoped
public class CategoriaControllerV1 implements CategoriaAPI {
	
	private Log LOG;

	private CategoriaBusiness business;
	
	public CategoriaControllerV1() {
	}	

	@Inject
	public CategoriaControllerV1(Log LOG, @Prioridade CategoriaBusiness business) {
		this.LOG = LOG;
		this.business = business;
	}
	
	@PostConstruct
	public void init(){
		LOG.info("----------------------INIT--------------------------------");
	}	

	@Override
	public List<CategoriaDTO> findAll() {

		LOG.info("----------------------findAll::BEGIN--------------------------------");

		List<Categoria> categorias = business.findAll();
		
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
