package variaveisELeituraDeDados;

import java.util.Scanner;

public class LeituraDeDados {
	/*
	 * Lembre-se: sempre que for necessário executar algo, você deverá colocar o código dentro de um método main
	 * O método main é o método principal
	 */
	
	public static void main(String[] args) {
		// Inicializando o Scanner
		Scanner scan = new Scanner(System.in);
		
		// Lendo e imprimindo uma String: o nome completo
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		// Lendo e imrpimento uma String: o primeiro nome
		System.out.println("Digite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		// Lendo e imprimindo um inteito: a idade
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		// Lendo e imprimindo um Double: a altura
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é: " + altura);		
	
	}

}
