package br.FIAP.capitulo6.exercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExecoesChecked {

	public static void main(String[] args) throws IOException {


		/*Quando usamos o tratamento de arquivos, obrigatóriamente precisamos declarar o "trows IOException". 
		o trows declara exceções que podem occorrer em um determinado método, forçando quem o chame trate o erro nesse caso IOException*/
		FileWriter fw = new FileWriter("c:\\nota.txt");

		PrintWriter print = new PrintWriter(fw);
		print.println("Maça = R$4,00");
		print.println("Pera = R$7,00");
		print.println("Uva = R$10,00");
		print.println("Total = R$21,00");
		print.close();
		fw.close();
	}
}
