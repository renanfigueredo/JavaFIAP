package br.FIAP.capitulo4.exercicios;

public class ContaCorrente extends Conta {
	
	private String tipo;
	private double chequeespecial;

	
	//Metodos:
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeespecial; //para chamar dados da classe mãe é necessário usar o'super' 
	}
	
	
	//Sobresquevendo um método (Polimorfismo), quando pegamos um método "emprestado" da classe mãe, precisamos usar o @overrite para informar que vamos sobresquever o método
	@Override 
	public void retirar(double valor) {
		
		valor += 10;
		super.retirar(valor); // após realizar as alterações necessárias, chamamos o método da classe mãe.
	}
	
	
	//GETs e SETs
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeespecial() {
		return chequeespecial;
	}
	public void setChequeespecial(double chequeespecial) {
		this.chequeespecial = chequeespecial;
	}

}
