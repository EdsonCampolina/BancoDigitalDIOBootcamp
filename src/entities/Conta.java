package entities;

import interfaces.IConta;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;

	private static int SEQUENCIAL = 1;

	protected Integer agencia;
	protected Integer numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void imprimirExtrato() {
		this.impressao();
	}

	protected void impressao() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Titu: %.2f", this.saldo));

	}

	@Override
	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saque não permitido");
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(IConta contaDestino, double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public Integer getAgencia() {
		return agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}

}
