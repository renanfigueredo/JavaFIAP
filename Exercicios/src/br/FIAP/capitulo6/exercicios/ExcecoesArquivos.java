package br.FIAP.capitulo6.exercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExcecoesArquivos {


	public static void main(String[] args) {

		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;


		List<String> conteudo = new ArrayList<>();
		// o ";" do add infoma o excel que cada info é de uma coluna
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da Unidade;");
		conteudo.add("Pera; 200; pct ; R$ 5,40;");
		conteudo.add("Morango; 400; cx ; R$ 6,50;");
		conteudo.add("Abacaxi; 280; un ; R$ 5,00;");

		gravarEstoque(nomeDoArquivo, caminho, conteudo);

		lerEstoque(caminho);


		//Imprimir as informações sobre o arquivo na tela:
		/*
		File arquivo = new File(diretorio);

		if(arquivo.exists()) {
			System.out.println("O arquivo existe!" + "\nPode ser lido: " + arquivo.canWrite() + "\nTamanho: " + arquivo.length() + "\nCaminho: " + arquivo.getPath());
		}else {
			// Cria o arquivo
			try {
				if (arquivo.createNewFile()) 
					System.out.println("Arquivo criado!");
				else
					System.out.println("Arquivo não criado!");
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		 */


		//Imprimir as informações sobre o diretório na tela:
		/*
		File fdiretorio = new File(diretorio);

		if(fdiretorio.exists()) {
			System.out.println("O diretorio existe!");
		}else {
			if (fdiretorio.mkdir()) 
				System.out.println("Diretorio criado!");
			else
				System.out.println("Diretorio não criado!");
		}
		 */
		
	}


	private static void lerEstoque(String caminho) {

		try {
			//Abre o arquivo
			FileReader stream = new FileReader(caminho);

			// BufferedReader possui o método que lé a linha "readLine" que lê uma linha do arquivo e retorna esse valor para a string
			BufferedReader reader = new BufferedReader(stream);
			String linha = reader.readLine();


			while (linha != null) { // imprime os valores das linhas enquanto a linha possuir informação

				System.out.println(linha);
				linha = reader.readLine();
			}
			reader.close();
			stream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

		FileWriter stream;
		PrintWriter print;

		try {
			//Stream é uma conexão de escrita para o arquivo
			stream = new FileWriter(caminho); // FileWriter abre a comunicação com o arquivo
			//A classe PrintWriter escreve no arquivo
			print = new PrintWriter(stream);


			for (String linha: conteudo) {
				//Escrever uma linha no arquivo
				print.println(linha);
			}
			//Necessário fechar o arquivo:
			print.close();
			stream.close();

			System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

