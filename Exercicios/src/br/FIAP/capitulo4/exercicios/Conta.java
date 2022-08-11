package br.FIAP.capitulo4.exercicios;

import java.io.Serializable;

public class Conta implements Serializable{

	private int agencia;
	private int numero;
	private double saldo;
	
	//Construtores:
	public Conta() {
		
	}
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// Metodos:
	
	public void depositar (Double valor) {
		this.saldo += valor;
	}
	
	public void retirar (double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	//GETs e SETs
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	
	
	
}
