package br.com.franca.web.api.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.franca.domain.Categoria;
import br.com.franca.modelo.Aluno;
import br.com.franca.repository.CategoriaRepository;
import br.com.franca.web.api.v1.dto.CategoriaDTO;
import br.com.franca.web.api.v1.resources.CategoriaResource;

@Named
@RequestScoped
public class CategoriaServiceV1 implements CategoriaResource {
	private Categoria categoria;
	
	@Inject
	private Aluno a;

	private CategoriaRepository repository;

	@Inject
	public CategoriaServiceV1(CategoriaRepository repository) {
		this.repository = repository;
		
	}

	// private CategoriaRepository repository;

	@Override
	public List<CategoriaDTO> findAll() {
		repository.findAll();
		System.out.println(a.toString());
		a.setId(1L);
		Map<Integer, Categoria> banco = new HashMap<>();

		/*
		 * Produto p1 = new Produto(1, "Computador", new BigDecimal("2000.00"));
		 * Produto p2 = new Produto(2, "Impressora", new BigDecimal("800.00"));
		 * Produto p3 = new Produto(3, "Mouse", new BigDecimal("80.00"));
		 * 
		 * 
		 * Categoria cat1 = new Categoria(1, "Informática"); Categoria cat2 =
		 * new Categoria(2, "Escritório");
		 * 
		 * List<Produto> produtosCat1 = Arrays.asList(p1, p2, p3); List<Produto>
		 * produtosCat2 = Arrays.asList(p2);
		 * 
		 * cat1.setProdutos(produtosCat1); cat2.setProdutos(produtosCat2);
		 */
		categoria = new Categoria();
		categoria.setId(1);
		categoria.setNome("Teste");
		banco.put(1, categoria);
		// banco.put(1, cat1);
		// banco.put(2, cat2);

		Collection<br.com.franca.domain.Categoria> listaDeCategorias = banco.values();

		// List<br.com.franca.domain.Categoria> categorias =
		// repository.findAll();
		List<CategoriaDTO> categoriasDTO = new ArrayList<CategoriaDTO>();
		listaDeCategorias.forEach(c -> categoriasDTO.add(new CategoriaDTO(c.getId(), c.getNome())));
		return categoriasDTO;
	}

}
