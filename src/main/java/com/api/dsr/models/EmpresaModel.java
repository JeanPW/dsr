package com.api.dsr.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_empresa")
public class EmpresaModel extends ImpostoModel {
	
	private int numeroFuncionario;

	public EmpresaModel(String nome, double rendaAnual, int numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double imp() {
		
		if (numeroFuncionario > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
		return getRendaAnual() * 0.16;
		}
	}
}
