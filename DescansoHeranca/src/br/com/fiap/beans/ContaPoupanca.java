package br.com.fiap.beans;

public class ContaPoupanca extends ContaBancaria {
	private double taxaJuros;
	public ContaPoupanca(String numeroConta, 
			Titular titular, double saldo,
			int agencia, double taxaJuros) {
		super(numeroConta, titular, saldo, agencia);
		this.taxaJuros = taxaJuros;
	}
	public ContaPoupanca() {
		super();
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public void atualizarSaldo(){
		super.setSaldo(super.getSaldo()+
				super.getSaldo()*taxaJuros/100);
		//super.saldo = 
			//super.saldo+ super.sado * taxaJuros/100;
	}
	
	
	
	
}
