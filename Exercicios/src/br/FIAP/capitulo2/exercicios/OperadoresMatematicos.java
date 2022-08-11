package br.FIAP.capitulo2.exercicios;

import java.util.Scanner;

public class OperadoresMatematicos {

	public static void main(String[] args) {

		//criando o scaner para receber os valores:
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor do primeiro numero: ");
		float num1 = sc.nextFloat();

		System.out.println("Entre com o valor do segundo numero: ");
		float num2 = sc.nextFloat();

		//Devemos sempre fechar o scaner !
		sc.close();

		float soma = num1 + num2;
		float sub = num1 - num2;
		float mult = num1 * num2;
		float div = num1 / num2;
		float resto = num1 % num2;

		System.out.println("O resultado das operações entre " + num1 + " e " + num2 + " são: ");
		System.out.println("Adição: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div + " e possui o resto: " + resto);
	}
}