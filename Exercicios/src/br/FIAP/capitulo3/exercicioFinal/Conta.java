package br.FIAP.capitulo3.exercicioFinal;

import java.io.Serializable;

public class Conta  implements Serializable{

	private static final long serialVersionUID = 1L;
	private int agencia;
	private int conta;
	private double saldo = 0;
	private String dataCriação ;
	Cliente cliente = new Cliente();
	
	//Construtores:
	protected Conta() {}

	protected Conta(int agencia, int conta, String dataCriação) {
		this.agencia = agencia;
		this.conta = conta;
		this.dataCriação = dataCriação;
	}

	//Metodos:
	
	protected void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado! Seu saldo atual é de : R$" + this.saldo);
	}
	
	protected void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Valor sacado! Seu saldo atual é de : R$" + this.saldo);
		}
		else {
			System.out.println("Saldo insuficiente, favor consultar seu saldo.");
		}
	}
	
	protected void verificarSaldo() {
		System.out.println("Seu saldo é: R$" + this.saldo);
	}
	
	
	//GETs e SETs:
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getDataCriação() {
		return dataCriação;
	}
	public void setDataCriação(String dataCriação) {
		this.dataCriação = dataCriação;
	}

}
