package br.FIAP.capitulo3.exercicioFinal;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 2337405680150880595L;
	private String nome;
	private int idade;
	private String nomeMae;
	private String dataNac;
	private int numTel;
	
	//Construtores:
	protected Cliente() {}
	
	protected Cliente(String nome, int idade,String nomeMae, String dataNac , int numTel) {
		this.nome = nome;
		this.idade = idade;
		this.nomeMae = nomeMae;
		this.dataNac = dataNac;
		this.numTel = numTel;
	}


	//GETs e SETs :
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNac() {
		return dataNac;
	}
	public void setDataNac(String dataNac) {
		this.dataNac = dataNac;
	}

	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	
	
}
