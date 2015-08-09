package br.com.fiap.beans;

public class ContaBancaria {
	private String numeroConta;
	private Titular titular;
	private double saldo;
	private int agencia;

	public ContaBancaria(String numeroConta, Titular titular, double saldo,
			int agencia) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		this.agencia = agencia;
	}

	public ContaBancaria() {
		super();
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	/*public void sacar(double valor){
		saldo = saldo - valor;
		//saldo-=valor;
	}*/
	public String sacar(double valor){
		if (saldo>=valor){
			saldo = saldo - valor;
			return "Saque realizado";
		}else{
			return "Saldo insuficiente";
		}
	}
	
	public void depositar(double valor){
		saldo+=valor;
	}











}
