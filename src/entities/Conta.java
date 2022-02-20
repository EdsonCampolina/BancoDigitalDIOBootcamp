package entities;

import interfaces.IConta;

public abstract class Conta implements IConta {

	protected Integer agencia;
	protected Integer numero;
	protected Double saldo;

	@Override
	public void sacar(Double valor) {
	}

	@Override
	public void depositar(Double valor) {
	}

	@Override
	public void transferir(IConta contaDestino, Double valor) {
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
