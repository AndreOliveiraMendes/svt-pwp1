package br.com.sisvendatarde.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produtos extends GenericDomain {
	
	@Column(length = 50, nullable = false)
	private String descrišao;
	
	@Column(nullable = false)
	private float valor;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Fornecedor fornecedor;

	public String getDescrišao() {
		return descrišao;
	}

	public void setDescrišao(String descrišao) {
		this.descrišao = descrišao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
}
