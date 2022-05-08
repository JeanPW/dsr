package com.api.dsr.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "imposto")
public abstract class ImpostoModel {
	
	private String nome;
	private double rendaAnual;
	
	public ImpostoModel() {
		
	}

	public ImpostoModel(String nome, double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double imp();
	
}
