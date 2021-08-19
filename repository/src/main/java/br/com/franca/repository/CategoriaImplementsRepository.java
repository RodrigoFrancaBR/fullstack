package br.com.franca.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.franca.repository.modelo.Categoria;

@Named
public class CategoriaImplementsRepository implements CategoriaRepository {

	private static Map<Integer, Categoria> banco = new HashMap<>();

	static {
/*
		Produto p1 = new Produto(1, "Computador", new BigDecimal("2000.00"));
		Produto p2 = new Produto(2, "Impressora", new BigDecimal("800.00"));
		Produto p3 = new Produto(3, "Mouse", new BigDecimal("80.00"));

		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");

		List<Produto> produtosCat1 = Arrays.asList(p1, p2, p3);
		List<Produto> produtosCat2 = Arrays.asList(p2);

		cat1.setProdutos(produtosCat1);
		cat2.setProdutos(produtosCat2);

		banco.put(1, cat1);
		banco.put(2, cat2);
*/
	}

	public List<Categoria> findAll() {
		List<Categoria> categorias = (List<Categoria>) banco.values();
		return categorias;
	}

}
