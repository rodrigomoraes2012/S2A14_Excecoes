package br.com.fiap.excecoes;

public class Excecoes extends Exception {
	public Excecoes(String mensagem, Exception e) {
		super(mensagem, e);
		if (e.getClass().toString()
				.equals("class java.lang.NumberFormatException")) {
			System.out.println("N�mero inv�lido ");
		} else if (e.getClass().toString()
				.equals("class java.lang.ArithmeticException")) {
			System.out.println("Divis�o por 0 ");
		}
		this.print();
		e.printStackTrace();
		// Envia e-mail para o respons�vel
	}
	
	public Excecoes (String mensagem)
	{
		super(mensagem);
		// Envia e-mail para o respons�vel
	}
	
	public void print()
	{
		System.out.println("_________________ Tratando Erro _____________________");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace:  ");
	}
}
