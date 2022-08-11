package br.FIAP.capitulo5.exercicios;

public class ArrayEx {

	public static void main(String[] args) {
		
		//Declaração do Array: (estrutura de dados simples que armazena uma coleção de itens do mesmo tipo 
		
		/*// Utilizando dados Primitivos:
		int tamanhoArray =5;
		float valores[] = new float[tamanhoArray];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		
		System.out.println("O valor armazeanado na posição '3' é: " + valores[2] );
		System.out.println("Quando não colocamos valores para uma posição do Array ele define com o valor padrão no caso de 'float': " + valores[4]);
		
		// Podemos definir o Array dessas duas formas:
		float valores2[] = {10,20,30,40,50};
		float valores3[] = new float[] {10,20,30,40,50};
		*/
		
		
		//Utilizando classes:
		Produto produtos[] = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Limão");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Maçã");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
		/*
		System.out.println("Usando For:");
		for (int i = 0; i < produtos.length; i++) { // 'Length' retorna o tamanho do objeto em questão
			System.out.println("Produto Cadastrado na posição " + i + ": \n " + produtos[i].toString());
		}

		System.out.println("Usando For each: (recomendado usar quando temos objetos relacionados a lógica) ");
		for (Produto prod : produtos) {
			System.out.println( prod2.toString());
		}
		*/
		
		//Declaração do Array Multidimencional:
		
		int numCorredores = 10;
		int numParteleira = 3;
		Produto[][] localizacaoProduto = new Produto[numCorredores][numParteleira];
		
		localizacaoProduto[0][1] = prod1;
		localizacaoProduto[1][1] = prod2;
		
		System.out.println(localizacaoProduto[0][1].getNome());
		
		
		
		
	}

}
