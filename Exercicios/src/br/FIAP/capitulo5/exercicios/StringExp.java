package br.FIAP.capitulo5.exercicios;

public class StringExp {

	public static void main(String[] args) {

		// É possível declarar uma string de 3 formas:
		String nome1;
		nome1 = new String();
		nome1 = "Maça";

		String nome2 = new String("Maça");

		//Nesse terceiro caso, a declaração da var fica armazenado na memoria de execução do projeto "cash"
		String nome3 = "Maça";


		//Concatenar strings:

		String nome = new String("Maça");
		String descricao = new String();
		descricao = "tipo Gala, a maça mais doce do mercado";

		String propaganda = nome + "" + descricao;
		System.out.println("Usando \" + \" : " + propaganda);

		propaganda = nome.concat("").concat(descricao);
		System.out.println("Usando \" conct \" : ".concat(propaganda));

		propaganda += "!"; //nesse caso pegamos a concatenação anterior e adicionamos "!"
		System.out.println("Usando \" += \" : " + propaganda);
		
		
		
		
	}

}
