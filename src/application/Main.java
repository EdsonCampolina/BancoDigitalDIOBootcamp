package application;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(new Cliente("Edson"));
		ContaPoupanca contaPoupanca = new ContaPoupanca(new Cliente("Campolina"));
		contaCorrente.depositar(5000);
		contaCorrente.sacar(500);
		contaCorrente.transferir(contaPoupanca, 700);
		contaPoupanca.sacar(100);
		contaCorrente.sacar(60000);

		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();

	}

}
