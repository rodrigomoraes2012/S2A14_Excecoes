package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ContaPoupanca;
import br.com.fiap.beans.Titular;

public class Teste {
	static String texto(String d){
		return JOptionPane.showInputDialog(d);
	}
	static int inteiro(String d){
		return Integer.parseInt
				(JOptionPane.showInputDialog(d));
	}
	static double decimal(String d){
		return Double.parseDouble
				(JOptionPane.showInputDialog(d));
	}
	public static void main(String[] args) {
		ContaPoupanca conta = new ContaPoupanca();
		conta.setAgencia(inteiro("Digite a agencia"));
		conta.setNumeroConta(texto("Digite a conta"));
		conta.setSaldo(decimal("Digite o saldo"));
		conta.setTaxaJuros(decimal("Digite o juros"));
		Titular cliente = new Titular();
		conta.setTitular(cliente);
		cliente.setCpf(texto("Digite o cpf"));
		cliente.setNome(texto("Digite o nome"));
		

	}

}
