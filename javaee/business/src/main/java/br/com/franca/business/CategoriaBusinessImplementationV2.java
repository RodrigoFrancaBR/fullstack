package br.com.franca.business;

import java.util.List;

import br.com.franca.repository.CategoriaRepository;
import br.com.franca.repository.domain.Categoria;

public class CategoriaBusinessImplementationV2 implements CategoriaBusiness {
	
	private CategoriaRepository repository;

	public CategoriaBusinessImplementationV2() {
	}
	
	public CategoriaBusinessImplementationV2(CategoriaRepository repository) {
		this.repository = repository;
	}	

	@Override
	public List<Categoria> findAll() {
		System.out.println("CategoriaBusinessImplementationV2 :: findAll :: BEGIN");
		// alguma regra de negócio diferente da versão 1
		List<Categoria> categorias = repository.findAll();
		categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));
		return categorias;
	}

}
