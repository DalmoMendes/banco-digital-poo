package ceproirr.com.br;

/*
 * Projeto: POO - Banco Digital
 * Autor: Dalmo Mendes
 * Bootcamp: DIO/ Amdocs 
 * */
public class Cliente extends Contato {

	private String nome;
	private String sobrenome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
