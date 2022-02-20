package interfaces;

public interface IConta {

	void sacar(Double valor);

	void depositar(Double valor);

	void transferir(IConta contaDestino, Double valor);

}
