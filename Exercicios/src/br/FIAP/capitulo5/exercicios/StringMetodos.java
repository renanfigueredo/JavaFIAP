package br.FIAP.capitulo5.exercicios;

import java.util.Arrays;

public class StringMetodos {

	public static void main(String[] args) {

		String descricao = new String ("Maça Gala, a maça mais doce do mercado !");


		/*
		System.out.println("Plotar o tamanho da String (.length): " + descricao.length());

		System.out.println("Verificar se o começo da frase tenha Maça (.startsWith): " + descricao.startsWith("Maça"));

		System.out.println("Verificar se o ultimo caracter seja '1' (.endsWith): " + descricao.endsWith("!"));
		 */

		/*
		int posicaoCaracter = 1;
		System.out.println("Plotar o caracter na posição 1 (.charAt): " + descricao.charAt(posicaoCaracter));

		System.out.println("Plotar a posição da primeira letra G (.indexOf): " + descricao.indexOf("G"));
		System.out.println("Plotar a posição de inicio da palavra Gala (.indexOf): " + descricao.indexOf("Gala"));

		System.out.println("Plotar a posição da ultima letra a (.lastIndexOf): " + descricao.lastIndexOf("a"));
		 */

		/*
		System.out.println("Substituir todos os caracter (.replace): " + descricao.replace("G", "g"));
		System.out.println("Substituir alguma palavra (.replace): " + descricao.replace("Gala", "Fugi"));
		 */
		
		/*
		System.out.println("Quebrar as Strings em pacotes menores (.split) e retornar a quantidade de intervalos 'começando do zero' (.length): " + descricao.split(" ").length);
		System.out.println("Quebrar a String (.split) e plotar o que ficou em cada intervalo (Array.toString): " + Arrays.toString(descricao.split(" ")));
		 */
		
		/*
		System.out.println("Tranformar todos os caracteres em minusculos (.toLowerCase): " + descricao.toLowerCase());
		System.out.println("Tranformar todos os caracteres em maiusculo (.toUpperCase): " + descricao.toUpperCase());
		*/
		
		
		int posicaoInicio = 5;
		int posicaoInicial = 0;
		int posicaoFinal = 4;
		System.out.println("Varre a string e pega o que está a partir da posição (.substring): " + descricao.substring(posicaoInicio));
		System.out.println("Varre a string e pega o que está dentro do intervalo (.substring): " + descricao.substring(posicaoInicial, posicaoFinal));
		System.out.println("Varre a string e pega o que está dentro do intervalo (.substring): " + descricao.substring(descricao.indexOf("Gala"),descricao.indexOf("mais")));
		
		
		
		System.out.println("Essas alterações não alteram o conteudo original da String: " + descricao);
	}

}
