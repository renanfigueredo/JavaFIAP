package br.FIAP.capitulo5.exercicios;

public class EstruturasRepeticoes {

	public static void main(String[] args) {

		int qtdProdutos = 5;
		int registro = 0;


		//Quando não sabemos exatamente a quantidade de vezes que devemos executar o laço usamos:

		//While: o cód roda até que a condição deixa de ser verdade, o While faz a checagem da condição antes de executar qqr coisa

		System.out.println("While:");
		while (registro < qtdProdutos) {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado.");
		}
		
		registro = 0;

		//do while: o cód roda até que a condição deixa de ser verdade, Do While faz a checagem da condição depois de executar algum comando
		System.out.println("Do While:");
		do {
			registro++;
			System.out.println("O produto número " + registro + " foi registrado.");
		}while (registro < qtdProdutos);


		//Quando sabemos a quantidade de laços:

		System.out.println("For: ");
		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println("O caixa registrou o procuto " + i);
		}

	}

}
