package br.com.daniel.curso.fjoo.excecoes;

public class TexteExcecoes {

	public static void main(String[] args) {
//		int numero = 5 / 0; - Lan�a a exce��o java.lang.ArithmeticExpection
//		String s = null;
		
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
			cc.depositar(-10);
		} catch (IllegalArgumentException tratamento) {
			System.out.println("Voc� executou uma opera��o inv�lida: " 
					+ tratamento.getMessage());
		}
	}
}
