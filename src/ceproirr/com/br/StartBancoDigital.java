package ceproirr.com.br;

import java.util.Scanner;

public class StartBancoDigital {
		
/*
 * Projeto: POO - Banco Digital
 * Autor: Dalmo Mendes, ceproirr.com.br
 * Bootcamp: DIO/ Amdocs 
 * 
 * */
	
	public static void main(String[] args) {
		// Declaração de Variaveis
		String CPF; String NOMECLIENTE; String SEGNOMECLIENTE;
		int CODIGO; int DDESTADO; int NUMPHONE; int TIPOCONTA;
		double DEPOSITARVALOR; double SACARVALOR;
		
		Scanner cann = new Scanner(System.in); 
		
		System.out.print("================= Seja Bem Vindo ao Banco Digital Amdocs ===================\n");
		System.out.print("==[1-Novo Cliente] | [2-Sobre] | [3-Sair] ==================================\n");
		System.out.print("============================================================================\n");
		System.out.print("===== Digite o codigo de Entrada: \n"
					+ "\n");
		CODIGO = cann.nextInt();
		
			switch (CODIGO) {
			case 1:
				System.out.print("=====[Cadastro de Novo Cliente ]============================================\n");
				System.out.print("============================================================================\n");
				Cliente cliente = new Cliente();
				System.out.print("===== CPF DO CLIENTE :\n");
				CPF = cann.next();
				cliente.setCpf(CPF);
				
				System.out.print("===== PRIMEIRO NOME DO CLIENTE :\n");
				NOMECLIENTE = cann.next();
				cliente.setNome(NOMECLIENTE);
				
				System.out.print("===== SEGUNDO NOME DO CLIENTE :\n");
				SEGNOMECLIENTE = cann.next();				
				cliente.setSobrenome(SEGNOMECLIENTE);
				
				System.out.print("===== DD DO ESTADO:\n");
				DDESTADO = cann.nextInt();				
				cliente.setCod(DDESTADO);
							
				System.out.print("===== DIGITE UM NUMERO DE TELEFONE: \n");
				NUMPHONE = cann.nextInt();				
				cliente.setPhone(NUMPHONE);				
												
				System.out.print("===== TIPO DE CONTA : Digite ( 20 - CORRENTE ) | (30 - POUPANCA) =========\n");
				TIPOCONTA = cann.nextInt();
				
				if(TIPOCONTA == 20) {
					Conta cc = new ContaCorrente(cliente);
					System.out.print("===== Parabens " + NOMECLIENTE + " voce criou uma conta tipo 20 - Corrente ============\n");	
					
					System.out.print("Sr.(a): " + NOMECLIENTE + " " + SEGNOMECLIENTE + ", Digite um valor para DEPOSITAR R$:\n");
					DEPOSITARVALOR = cann.nextDouble();
					cc.depositar(DEPOSITARVALOR);
					System.out.print("Parabens " + NOMECLIENTE + "! Seu deposito de R$:" + DEPOSITARVALOR + " foi realizado com sucesso!\n");
					
					
					System.out.print("O que voce quer fazer " + NOMECLIENTE + "?\n [ 7 Sacar ] | [ 8 Consultar Extrato ] | [ 3 Sair ]: \n"
							+ "\n");
					CODIGO = cann.nextInt();
					
						if(CODIGO == 7 )
						{
							System.out.print("Sr.(a): " + NOMECLIENTE + ", Digite um valor para SACAR R$:\n");
							SACARVALOR = cann.nextDouble();
							cc.sacar(SACARVALOR);
							System.out.print("Parabens " + NOMECLIENTE + "! Seu saque de R$:" + SACARVALOR + " foi realizado com sucesso!\n");
							
							System.out.print("Deseja visualizar seu extrato?  [ 12 para SIM ] | [ 3 Fechar o Programa ]\n");
							CODIGO = cann.nextInt();
							
							if(CODIGO == 12) {
								System.out.print("===============================================================================\n");
								cc.imprimirExtrato();
								System.out.print("===============================================================================\n");
							}else {
								System.out.print("================== Voce saiu do Banco Digital Amdocs, Tchau!!! =================\n");
								break;
							}
						}
						else if(CODIGO == 8)
						{
							System.out.print("===============================================================================\n");
							cc.imprimirExtrato();
							System.out.print("===============================================================================\n");
						}else {
							System.out.print("================== Voce saiu do Banco Digital Amdocs, Tchau!!! =================\n");
							break;
						}		
				}
				
				else if(TIPOCONTA == 30) {
					Conta cp = new ContaPoupanca(cliente);
					System.out.print("===== Parabens " + NOMECLIENTE + " voce criou uma conta tipo 30 - Poupanca ============\n");
					
					System.out.print("Sr.(a): " + NOMECLIENTE + " " + SEGNOMECLIENTE + ", Digite um valor para DEPOSITAR R$:\n");
					DEPOSITARVALOR = cann.nextDouble();
					cp.depositar(DEPOSITARVALOR);
					System.out.print("Parabens " + NOMECLIENTE + "! Seu deposito de R$:" + DEPOSITARVALOR + " foi realizado com sucesso!\n");
					
					
					System.out.print("O que voce quer fazer " + NOMECLIENTE + "?\n [ 7 Sacar ] | [ 8 Consultar Extrato ] | [ 3 Sair ]\n");
					CODIGO = cann.nextInt();
					
						if(CODIGO == 7 )
						{
							System.out.print("Sr.(a): " + NOMECLIENTE + ", Digite um valor para SACAR R$:\n");
							SACARVALOR = cann.nextDouble();
							cp.sacar(SACARVALOR);
							System.out.print("Parabens " + NOMECLIENTE + "! Seu saque de R$:" + SACARVALOR + " foi realizado com sucesso!\n");
							
							System.out.print("Deseja visualizar seu extrato?  [ 12 para SIM ] | [ 3 Fechar o Programa ]\n");
							CODIGO = cann.nextInt();
							
							if(CODIGO == 12) {
								System.out.print("=============================================================================\n");
								cp.imprimirExtrato();
								System.out.print("=============================================================================\n");
							}else {
								System.out.print("=============== Voce saiu do Banco Digital Amdocs, Tchau!!! =================\n");
								break;
							}
						}
						else if(CODIGO == 8)
						{
							System.out.print("==============================================================================\n");
							cp.imprimirExtrato();
							System.out.print("==============================================================================\n");
						}else {
							System.out.print("================ Você saiu do Banco Digital Amdocs, Tchau!!! =================\n");
							break;
						}		
					
				} else {
				System.out.print("== Ops! " + NOMECLIENTE + " voce digitou uma conta invalida, tente novamente ==\n");
				}
										
				break;
			
			case 2:
				System.out.print("================== Projeto Banco Digital Amdocs  ==============================\n");
				System.out.print("===============================================================================\n");
				System.out.print("===============================================================================\n");
				System.out.print("===============================================================================\n");
				System.out.print("===============================================================================\n");
				System.out.print("===============================================================================\n");
				System.out.print("====================================== by Dalmo Mendes ========================\n");
				System.out.print("====================================== Contatos: ==============================\n");
				System.out.print("====================================== dalmosilvamendes@gmail.com =============\n");
				System.out.print("====================================== Tel.(95) 99170-7450 ====================\n");
				System.out.print("====================================== github.com/DalmoMendes =================\n");
				System.out.print("====================================== ceproirr.com.br ========================\n");
				System.out.print("====================================== Boa Vista-RR, 2021 =====================\n");												
				break;
			
			case 3:
				System.out.print("================ Você saiu do Banco Digital Amdocs, Tchau!!! =================\n");
				break;

			default:
				System.out.print("================ Ops!!! Operacao invalida, digite um codigo valido. ==========\n");
				break;
			}
			
			System.out.print("\n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "========================= Banco Digital Amdocs ===============================\n");
	 System.out.print("=========================== by Dalmo Mendes ==================================\n");
	 System.out.print("==============================================================================\n");
			
		}

}
