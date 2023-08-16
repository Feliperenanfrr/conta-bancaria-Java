package entities;

public class Conta {
		
		private int numero;
		private String titular;
		private double saldo;
		
		// Construtor sem o deposito inicial, a conta começa com saldo 0 
		public Conta(int numero, String titular) {
			this.numero = numero;
			this.titular = titular;
		}
		
		// Construtor com deposito inicial, chama o método deposito passando o deposito inicial como parâmeto
		public Conta(int numero, String titular, double depositoInicial) {
			this.numero = numero;
			this.titular = titular;
			deposito(depositoInicial);
		}

		public int getNumero() {
			return numero;
		}


		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public double getSaldo() {
			return saldo;
		}
		
		public void deposito(double quantidade) {
			saldo += quantidade;
		}
		
		// Método para saque, adicionando a taxa de 5 reais de saque
		public void saque(double quantidade) {
			saldo -= quantidade + 5;
		}
		
		public String toString() {
			return "Conta "
					+ numero
					+", titular: "
					+ titular
					+ ", saldo: R$ "
					+ String.format("%.2f", saldo);
			}
						
}
