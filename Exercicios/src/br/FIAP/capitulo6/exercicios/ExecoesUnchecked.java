package br.FIAP.capitulo6.exercicios;

public class ExecoesUnchecked {

	public static void main(String[] args) {

		try {

			int val = 10/0; 


			int[] valores = new int[3];
			System.out.println(valores[4]);


			String nome = null;
			System.out.println(nome.length());


			int numero = Integer.parseInt("zero");


			// podemos colocar mais de um tratamento de exceção de acordo com o tipo dela:
		} catch (ArithmeticException e) { // nesse caso para exceçções aritimeticas

			System.out.println("Não é possível realziar uma divisão por zero! ");

			//Mensagem com a lista de erros:
			System.out.println(e.getMessage());
			// Imprime a pilha de erros da exceção
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) { // para erros de acesso indevido
			System.out.println("Não é possível acessar a posição 4 do Array!");
		} 

		catch (NullPointerException e) { // erro de acesso/ tentativa de acesso a um objeto não inicializado:
			System.out.println("Não foi possível retornar o tamanho, variável não instanciada! ");
		} 

		catch (NumberFormatException e) { // erro de formatação 
			System.out.println("não foi possível realizar a conversão! ");
		}

		catch (Exception e) { // Exception e a classe mais generica, se caso os catch acima não resolverem a exeção esse bloco é executado
			System.out.println("Erro na execução do programa! ");
		}
	}
}
