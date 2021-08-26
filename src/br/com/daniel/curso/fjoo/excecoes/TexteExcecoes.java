package br.com.daniel.curso.fjoo.excecoes;

public class TexteExcecoes {

	public static void main(String[] args) {
//		int numero = 5 / 0; - Lança a exceção java.lang.ArithmeticExpection
//		String s = null;
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
		} catch (IllegalArgumentException tratamento) {
			System.out.println("Você executou uma operação inválida: " 
					+ tratamento.getMessage());
		}
	}
}
