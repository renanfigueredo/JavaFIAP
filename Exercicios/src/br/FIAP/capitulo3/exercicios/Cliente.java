package br.FIAP.capitulo3.exercicios;

import java.io.Serializable;

public class Cliente implements Serializable{ // implements Serializable transforma os dados da classe em bytes para poderem trafegar na rede de forma mais segura

	/**
	 *  Ao implementar o 'Serializable', é recomendado executar o 'serialVersionUID' pois pode ser que existam mais de um objeto da classe pessoal, com versões diferentes
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private int idade; 


	public Cliente(String nome,int idade) {//Construtor com parametros
		this.nome = nome;
		this.idade = idade;
	}

	// GET e SET, realizam a comunicação dos dados da classe com o projeto.
	
	// GET: pega a informação a classe
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}

	// SET: passa informação para a classe
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}




}

