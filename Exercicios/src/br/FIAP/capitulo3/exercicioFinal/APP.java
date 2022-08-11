package br.FIAP.capitulo3.exercicioFinal;

public class APP {

	public static void main(String[] args) {
		
		Conta cc = new Conta(05, 256, "05/07/2000");
		cc.cliente.setNome("Renan");
		
		cc.depositar(200);
		cc.sacar(250);
				
	}

}
