package br.FIAP.capitulo5.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {

	public static void main(String[] args) {
		
		/*
		ArrayList carrinho = new ArrayList();
		double valor = 100.55;
		int valor2 = 1;
		int valor3;
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);

		System.out.println(carrinho.get(1)); // retorna o valor salvo na posição 1
		*/
		
		
		
		// Utilizando a interface List e Generics ( Generics não permite tipos primitivos de dados )
		List<String> carrinho2 = new ArrayList<String>(); // nesse caso só podemos ter elementos do tipo String
		
		
		System.out.println(carrinho2.isEmpty()); // retorna se o Array está vazio
		
		carrinho2.add("Maça");
		carrinho2.add("Morango");
		carrinho2.add("Maça");
		carrinho2.set(1,"Pera"); // modifica a informação na posição 1
		
		System.out.println(carrinho2.isEmpty()); // retorna se o Array está vazio
		System.out.println(carrinho2.size()); // retorna se o Array está vazio
		
		
		
		
		
	}

}
