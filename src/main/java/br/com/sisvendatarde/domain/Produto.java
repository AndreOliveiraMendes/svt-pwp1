package br.com.sisvendatarde.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto extends GenericDomain {
	
	@Column(length = 50, nullable = false)
	private String descri�ao;
	
	@Column(nullable = false)
	private float valor;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Fornecedor fornecedor;

	public String getDescri�ao() {
		return descri�ao;
	}

	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
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
