package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("Tem deposito inicial? [S / N]: ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Digite o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		// Fazendo depósito
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		// Fazendo saque
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
	
		
		
		sc.close();
	}

}
