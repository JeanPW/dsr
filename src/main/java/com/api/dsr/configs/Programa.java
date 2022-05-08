package com.api.dsr.configs;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.api.dsr.models.EmpresaModel;
import com.api.dsr.models.FuncionarioModel;
import com.api.dsr.models.ImpostoModel;

public class Programa {

	public static void main(String[] args) {
		
    	Locale.setDefault(Locale.US);
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.print("Informe o número de funcionarios: ");
    	int NF = scan.nextInt();
    	
    	List<ImpostoModel> list = new ArrayList<ImpostoModel>();
    	
    	for (int i = 1; i <=NF; i++) {
    		System.out.print("PagadorImpostoModel #" + i + " :");
    		System.out.print("Funcionario ou Empresa (f/e)? ");
    		char escolha = scan.next().charAt(0);
    		System.out.print("Nome: ");
    		String nome = scan.next();
    		System.out.print("Renda Anual: ");
    		Double rendaAnual= scan.nextDouble();
    		
    		if (escolha == 'f') {
    			System.out.print("Gastos com saúde: ");
    			Double gastoSaude = scan.nextDouble();
    			list.add(new FuncionarioModel(nome, rendaAnual, gastoSaude));
    		}
    		else {
    			System.out.print("Número de funcionários: ");
    			Integer numeroFuncionario = scan.nextInt();
    			list.add(new EmpresaModel(nome, rendaAnual, numeroFuncionario));
    		}
    		
    	}
    	System.out.println();
    	System.out.println("Imposto pago: ");

    	for (ImpostoModel pim : list) {
    	System.out.println(pim.getNome() + ": R$ " + String.format("%.2f", pim.imp()));
    	}
    	double soma= 0.0;
    	for (ImpostoModel pim : list) {
    		soma += pim.imp();

    	}
    	System.out.println();
    	System.out.println("Total de imposto pago R$ " + String.format("%.2f", soma));
    	
    	scan.close();
	}
}
