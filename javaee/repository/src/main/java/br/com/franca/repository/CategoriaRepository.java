package br.com.franca.repository;

import java.util.List;

import br.com.franca.repository.domain.Categoria;

public interface CategoriaRepository {
	public List<Categoria> findAll();
}
