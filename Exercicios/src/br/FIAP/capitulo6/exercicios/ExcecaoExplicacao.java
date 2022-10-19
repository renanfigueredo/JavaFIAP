package br.FIAP.capitulo6.exercicios;

public class ExcecaoExplicacao {

	public static void main(String[] args) {

		/*Basicamente uma exceção ocorre em 3 etapas:
		 * 
		1- delimitamos um bloco onde a exceção pode acontecer;
		2- Capturar esse bloco para verificação;
		3- Tratar essa exceção em um segundo bloco.
		
		através desse tratamento de informações, o programa continiu a execução sem que ele feche devido à exceção.   
		
		
		Uma exceção pode ser clssificada em:
		
		- checked: quando o programador é obrigado a tratar a exceção ou delegar para algum "throw" (exceção herdada da class exception)
		
		- uncheckd: quando não precisamos tratar a exceção (se a exceção não for tratada ela vai sempre ficar alertando (exceção herdada da class RunTimeException)
		
		- error: erro crítico, ou seja quando a JVM não consegue resolver o problema "fechando" o mesmo
		
		*/
		
		try { 
			// trecho onde a exceção pode ocorrer (tudo dentro do try)
			int val = 10/0;
			System.out.println(val);
			
		} catch (Exception e) { // Exception e captura essa exceção para tratala
			
			// tratamento da exceção (tudo dentro do catch)
			e.printStackTrace(); // imprime o local dos erros no terminal
		}
		finally { // independente do tratamento do erro no catch dar certo ou não, quando temos o finally no cód dentro dele sempre será executado
			System.out.println("Bloco finally sempre é executado");
		}
		
		
	}

}
