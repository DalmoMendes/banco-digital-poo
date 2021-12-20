package ceproirr.com.br;

/*
 * Projeto: POO - Banco Digital
 * Autor: Dalmo Mendes
 * Bootcamp: DIO/ Amdocs 
 * */

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
}
