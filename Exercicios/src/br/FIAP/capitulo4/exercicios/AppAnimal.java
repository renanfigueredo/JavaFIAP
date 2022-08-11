//Aplicação referente ao teste das classes Animal, Cachorro e Passaro:

package br.FIAP.capitulo4.exercicios;

public class AppAnimal {

	public static void main(String[] args) {

		// Criando um objeto sem especificação:
		Animal animal = new Animal();
		animal.setAlimenta("Todo Animal se alimenta");
		animal.setLocomove("Todo Animal se locomove");

		// Criando um objeto com especificação:
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ração de cachorro");
		cachorro.setLocomove("Cachorro anda com 4 patas");
		cachorro.setLatido("Cachorro faz Au Au");

		//Gerando um objeto usando especifico, utilizando a classe Mãe:
		//Nesse caso, o objeto só consegue acessar os métodos da classe mãe
		Animal pastorAlemao = new Cachorro();
		pastorAlemao.setAlimenta("Poodle come ração de cachorro");
		pastorAlemao.setLocomove("Cachorro anda com 4 patas");


	}

}
