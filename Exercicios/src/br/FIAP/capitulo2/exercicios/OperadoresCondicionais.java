package br.FIAP.capitulo2.exercicios;

import java.util.Scanner;

public class OperadoresCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  // Inicia o Scan para pegar a info de idade;

		System.out.println("Entre com o valor da sua idade: ");
		int idade = sc.nextInt();
		sc.close(); // Fecha o scan


		if(idade <16 ) {
			System.out.println("Você ainda não tem idade para votar.");
		}
		else if ( (idade >= 16 && idade <= 17) || (idade >=70) ) {
			System.out.println("Seu voto é facultativo, ou seja, caso queira votar você pode votar. ");
		}
		else {
			System.out.println("Seu voto é obrigatório.");
		}
	}
}

