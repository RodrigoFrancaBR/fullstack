package br.com.franca.business;

import java.util.List;

import br.com.franca.repository.domain.Categoria;

public interface CategoriaBusiness {
	public List<Categoria> findAll();
}
