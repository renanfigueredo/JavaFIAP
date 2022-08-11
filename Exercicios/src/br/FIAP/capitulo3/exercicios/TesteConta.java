package br.FIAP.capitulo3.exercicios;

public class TesteConta {

	public static void main(String[] args) {

		// Criando os objetos Conta:
		Conta contCor = new Conta(01,55,100);
		Conta contPop = new Conta();

		/* Quando não protegemos nossas informações, podemos passar as informações para as classes normalmente:
		contCor.cliente.nome = "Juca"; 
		contCor.cliente.idade = 40;
		contCor.depositar(100); 
		contCor.sacar(60);

		contPop.cliente.nome = "Ana"; 
		contPop.cliente.idade = 20;

		System.out.println("Dados da Conta Corrente:");
		System.out.println(contCor.cliente.nome);
		System.out.println(contCor.cliente.idade);
		System.out.println(contCor.numConta);
		System.out.println(contCor.verificarSaldo());

		*/


		// Como protegemos os parametros das classes, para passar valores para as classes precisamos usar os metodos gets e sets:
		contCor.cliente.setNome("Juca");
		contCor.cliente.setIdade(40);
		contCor.depositar(100);
		contCor.sacar(60);

		contPop.cliente.setNome("Ana");
		contPop.cliente.setIdade(20);


		System.out.println("Dados da Conta Corrente:");
		System.out.println(contCor.cliente.getNome());
		System.out.println(contCor.cliente.getIdade());
		System.out.println(contCor.getNumConta());
		System.out.println(contCor.getSaldo());
		



	}

}
