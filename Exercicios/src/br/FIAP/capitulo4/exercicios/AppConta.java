//Aplicação referente ao teste das classes Conta, ContaCorrente:

package br.FIAP.capitulo4.exercicios;

public class AppConta {

	public static void main(String[] args) {

		/*//Teste 1
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(148);
		cc.setNumero(1697);
		cc.setTipo("Pessoa Fisica");
		cc.setChequeespecial(1000);
		*/
		
		/*// Teste 2
		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		
		//Forçando um objeto da classe mãe a se comportar como um objeto da classe filha (Down cast):
		
		ContaCorrente c1 = (ContaCorrente) cc; //depois dessa conversão 
		*/
		
		//Teste 3
		
		Conta conta1= new Conta();
		conta1.depositar(1000.00);
		conta1.retirar(100.00);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000.00);
		conta2.retirar(100.00);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000.00);
		conta3.retirar(100.00);
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());
		
		
	}

}
