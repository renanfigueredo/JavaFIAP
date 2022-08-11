package br.FIAP.capitulo5.exercicios;

public class StringComparacao {

	public static void main(String[] args) {

		String nome = new String("maça");
		String nome2 = new String("Maça");
		String nome3 = new String("maça");

		
		//A melhor maneira de conparar strings é usando o equals:
		
		//Comparando como estão escritas:
		System.out.println(nome.equals(nome2)); // falso pq nome2 tem "M"

		//Comparando ignorando como estão escritas:
		System.out.println(nome.equalsIgnoreCase(nome2)); // True pq nome2 tem os mesmos caracteres 

		//Comparando como estão escritas:
		System.out.println(nome.equals(nome3)); // True pq nome3 está identico 
		
		
		// == não é recomendado pois:
		boolean teste = (nome == nome3);
		System.out.println(teste); // vai dar false pq o "==" compara a posição dos itens na memoria, como os dois são objetos cada um tem uma posição na memoria

		String nome4 = "maça";
		String nome5 = "maça";
		boolean teste1 = (nome4 == nome5);
		System.out.println(teste1); // vai dar verdadeiro pq o "==" compara a posição dos itens na memoria, como os dois são var estão armazenados no mesmo endereço
		
		
	}

}
