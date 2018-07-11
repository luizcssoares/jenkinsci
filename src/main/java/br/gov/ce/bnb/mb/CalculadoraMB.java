package br.gov.ce.bnb.mb;

import javax.faces.bean.ManagedBean;
import br.gov.ce.bnb.operacao.*;

@ManagedBean
public class CalculadoraMB {

	Operacao operacao = new Operacao(); 
	
	private int numero1;
	private int numero2;
	
	public int soma() {		
		return operacao.somar(this.numero1, this.numero2);  		
	}
	
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}		
}
