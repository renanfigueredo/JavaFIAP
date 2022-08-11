package br.FIAP.capitulo2.exercicios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercicioFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com seu nome: ");
		String nome = sc.nextLine(); //pega tudo que foi digitado na linha
		System.out.println("Entre com seu peso: ");
		float peso = sc.nextFloat();
		System.out.println("Entre com sua altura (em centimetros): ");
		int altura = sc.nextInt();
		sc.close();
		
		float calcIMC = ((peso*10000)/(altura*altura)); //peso*10000 para deixar na formatação certa


		// Formatando o IMC para usar 2 casas decimais -> "DecimalFormat", porém ela transforma o numero em uma string: 
		/*
		String imc2CText = new DecimalFormat(".##").format(calcIMC);
		System.out.println("\nUsando o método 'DecimalFormat':");
		
		if (calcIMC < 15) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CText +" este valor está muito abaixo do valor ideal."+"\nRecomendamos que você procure um médico"+"\n");
		}
		else if (calcIMC < 18.5 && calcIMC >=15) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CText +" este valor está abaixo do valor ideal."+"\n");
		}
		else if (calcIMC >= 18.5 && calcIMC <=24.9) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CText +" este valor está no valor ideal."+"\n");
		}
		else if (calcIMC >= 25 && calcIMC <=29.9) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CText +" este valor está acima do valor ideal."+"\n");
		}
		else if (calcIMC >= 30 && calcIMC <= 39.9 ) {
			System.out.println("\n"+nome +" seu indice de massa é de: " +imc2CText +" este valor está muito acima do valor ideal."+"\nRecomendamos que você procure um médico"+"\n");
		}
		else if (calcIMC > 39.9) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CText +" este valor está muito acima do valor ideal e com alto grau de risco a sua saude."+"\nRecomendamos que procure um médico o mais rápido possível"+"\n");
		}
		 */

		// Formatando o IMC para usar 2 casas decimais -> "Math.round ()", devemos multiplicar e dividir o numero por 10^quantidade de casas decimais a ser usadas:
		// A vantagem desse é que o o valor continua sendo numérico:

		float imc2CNun = (float)(Math.round(calcIMC*100.0)/100.0);
		//System.out.println("\nUsando o método 'Math.round':");
		
		if (imc2CNun < 15) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CNun +" este valor está muito abaixo do valor ideal."+"\nRecomendamos que você procure um médico"+"\n");
		}
		else if (imc2CNun < 18.5 && imc2CNun >=15) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CNun +" este valor está abaixo do valor ideal."+"\n");
		}
		else if (imc2CNun >= 18.5 && imc2CNun <=24.9) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CNun +" este valor está no valor ideal."+"\n");
		}
		else if (imc2CNun >= 25 && imc2CNun <=29.9) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CNun +" este valor está acima do valor ideal."+"\n");
		}
		else if (imc2CNun >= 30 && imc2CNun <= 39.9 ) {
			System.out.println("\n"+nome +" seu indice de massa é de: " +imc2CNun +" este valor está muito acima do valor ideal."+"\nRecomendamos que você procure um médico"+"\n");
		}
		else if (imc2CNun > 39.9) {
			System.out.println("\n"+nome +" seu indice de massa é de: "+imc2CNun +" este valor está muito acima do valor ideal e com alto grau de risco a sua saude."+"\nRecomendamos que procure um médico o mais rápido possível"+"\n");
		}
	}
}
