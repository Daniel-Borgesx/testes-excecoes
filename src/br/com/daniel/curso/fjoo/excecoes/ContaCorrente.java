package br.com.daniel.curso.fjoo.excecoes;

public class ContaCorrente {
	
	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double deposito) {
		if (deposito <= 0) {
			throw new IllegalArgumentException("O valor não pode ser menor que zero.");
		}
		this.saldo += deposito;
	}
	
	public void sacar(double saque) throws SaldoInsuficienteException {
		double saldoTemp = saldo - saque;
		if (saldoTemp < 0) {
			throw new SaldoInsuficienteException("Saldo insuficiente para saque");
		}
		this.saldo -= saque;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
