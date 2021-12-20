package ceproirr.com.br;

/*
 * Projeto: POO - Banco Digital
 * Autor: Dalmo Mendes
 * Bootcamp: DIO/ Amdocs 
 * */
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;


	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("TITULAR: %s", this.cliente.getNome(), " %s", this.cliente.getSobrenome()));
		System.out.println(String.format("SOBRENOME: %s", this.cliente.getSobrenome()));
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
		System.out.println(String.format("AGENCIA: %d", this.agencia));
		System.out.println(String.format("NUMERO: %d", this.numero));
		System.out.println(String.format("SALDO: %.2f", this.saldo));
		System.out.println(String.format("DD :(%d) ", this.cliente.getCod()));
		System.out.println(String.format("PHONE :%d ", this.cliente.getPhone()));
	}
}
