package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecoes;

public class TesteExcecoes2 {

	public static void main(String[] args) throws Excecoes{
		try{
			Cliente objCliente = new Cliente();
			objCliente.setCodigo(Long.parseLong(JOptionPane.showInputDialog("Digite o código: ")));
		} catch(Exception e){
			throw new Excecoes("Ocorreu uma falha.", e);
		}
		
		try{
			int numero = 10;
			int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor para o número " + numero + ":"));
			numero = numero / divisor;
		}catch(Exception e)
		{
			throw new Excecoes("Ocorreu uma falha", e);
		}
	}
}
