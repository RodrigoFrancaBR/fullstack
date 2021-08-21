package br.com.franca.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import br.com.franca.repository.CategoriaRepository;
import br.com.franca.repository.domain.Categoria;

@RequestScoped
public class CategoriaBusinessImplementationV1 implements CategoriaBusiness {
	
	private CategoriaRepository repository;

	public CategoriaBusinessImplementationV1() {
	}
	
	@Inject
	public CategoriaBusinessImplementationV1(CategoriaRepository repository) {
		this.repository = repository;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Iniciando o CategoriaBusinessImplementation ");
	}

	@Override
	public List<Categoria> findAll() {
		System.out.println("CategoriaBusinessImplementation :: findAll :: BEGIN");
		List<Categoria> categorias = repository.findAll();
		categorias.forEach(e -> System.out.println("id: " + e.getId() + "nome: " + e.getNome()));
		return categorias;
	}

}
