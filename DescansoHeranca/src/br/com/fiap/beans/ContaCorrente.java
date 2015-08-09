package br.com.fiap.beans;

public class ContaCorrente extends ContaBancaria {
	private double limiteCredito;

	public ContaCorrente(String numeroConta, Titular titular, double saldo,
			int agencia, double limiteCredito) {
		super(numeroConta, titular, saldo, agencia);
		this.limiteCredito = limiteCredito;
	}

	public ContaCorrente() {
		super();
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
