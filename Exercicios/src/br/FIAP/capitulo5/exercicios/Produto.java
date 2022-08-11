package br.FIAP.capitulo5.exercicios;

public class Produto {
	
	String nome;
	String descricao;
	float valor;
	
	//Para fazer aparecer todos os dados presentes dentro do Array de produtos:
	@Override
	public String toString() {
		return "Produto [nome= " + nome + ", descricao= " + descricao + ", valor= " + valor + "]";
		
	}
	
	//GETs e SETs
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
