package com.api.dsr.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class FuncionarioModel extends ImpostoModel {
	
	private double gastoSaude;
	

	public FuncionarioModel(String nome, double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}


	@Override
	public double imp() {
		
		//double impostoBasico = getRendaAnual() < 20000.0 ? impostoBasico = getRendaAnual() * 0.15 : getRendaAnual() * 0.25;
		
		double impostoBasico;
		
		if (getRendaAnual() < 20000.0) {
			impostoBasico = getRendaAnual() * 0.15;	
		}
		else {
			impostoBasico = getRendaAnual() * 0.25;
		}
		impostoBasico = impostoBasico - (getGastoSaude() * 0.5);
		return impostoBasico;
	}
}