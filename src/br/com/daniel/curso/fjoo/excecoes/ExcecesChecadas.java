package br.com.daniel.curso.fjoo.excecoes;

public class ExcecesChecadas {

	public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente(100);
	
	try {
		cc.sacar(60);
	} catch (SaldoInsuficienteException saldoInsuficiente) {
		System.out.println("Desculpa, saldo insuficiente.");
			}
	
	System.out.println("Saldo: " + cc.getSaldo());
	
	try {
		cc.sacar(50);
	} catch (SaldoInsuficienteException saldoInsuficiente) {
				System.out.println("Desculpa, saldo insuficiente.");
			}
	
	System.out.println("Saldo agora: " + cc.getSaldo());

	
	
	
	}

}
