package ceproirr.com.br;

/*
 * Projeto: POO - Banco Digital
 * Autor: Dalmo Mendes
 * Bootcamp: DIO/ Amdocs 
 * */

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===================== Extrato Conta Corrente =====================");
		super.imprimirInfosComuns();
	}
	
}
