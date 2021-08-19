package br.com.franca.api.v2.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoriaDTO {

	private Integer id;
	private String nome;
	private String novoAtributo = "VALOR";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNovoAtributo() {
		return novoAtributo;
	}

	public void setNovoAtributo(String novoAtributo) {
		this.novoAtributo = novoAtributo;
	}

}