package br.FIAP.capitulo3.exercicios;

import java.io.Serializable;

public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numConta;
	private double saldo;
	Cliente cliente = new Cliente(null,0); //Podemos chamar uma classe na construção de outra classe:


	//Costrutores:quando declaramos algum construtor, toda vez que criarmos um objeto devemos passar as info requiridas
	// a menos que tenhamos o contrutor padrão declarado tbm.

	public Conta(){} //Construtor padrão (Em branco)

	public Conta(int agencia, int numConta, double saldo) { 
		this.agencia = agencia; 
		this.numConta = numConta; 
		this.saldo = saldo; 
	}

	//Metodos:

	//Metodo Void não retorna valor !

	public void depositar(double valor) {
		this.saldo +=  valor;
	}

	public void sacar (double valor) {
		this.saldo -= valor;
	}


	// GET e SET
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




}