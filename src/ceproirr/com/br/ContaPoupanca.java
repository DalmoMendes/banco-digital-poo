package ceproirr.com.br;

/*
 * Projeto: POO - Banco Digital
 * Autor: Dalmo Mendes
 * Bootcamp: DIO/ Amdocs 
 * */

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("===================== Extrato Conta Poupança ======================");
		super.imprimirInfosComuns();
	}
}
