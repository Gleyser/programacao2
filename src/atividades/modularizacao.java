package atividades;

import java.util.Scanner;

public class modularizacao {
	private static Scanner sc = new Scanner(System.in);
	
	/* Esse programa recebe do usuário 5 nomes e 5 idades e
	 * informa quantas e quais são idosas (idade maior que 60 anos) e quantas/quais não são.
	 * 
	 * Esse código está MUITO FEIO E MUITO GRANDE. Seu trabalho é modularizar e melhorar o código.
	 * 
	 * Dicas: implemente os métodos abaixo e use-os.
	 * Dicas: Que tal usar um laço de repetição? FOR OU WHILE? Por que?
	*/
	public static void main(String[] args) {
		System.out.println("Digite o nome da pessoa por favor: ");
		String pessoa1 = sc.next();
		System.out.println("Digite a idade da pessoa por favor: ");
		int idade1 = sc.nextInt();
		
		System.out.println("Digite o nome da pessoa por favor: ");
		String pessoa2 = sc.next();
		System.out.println("Digite a idade da pessoa por favor: ");
		int idade2 = sc.nextInt();
		
		System.out.println("Digite o nome da pessoa por favor: ");
		String pessoa3 = sc.next();
		System.out.println("Digite a idade da pessoa por favor: ");
		int idade3 = sc.nextInt();
		
		System.out.println("Digite o nome da pessoa por favor: ");
		String pessoa4 = sc.next();
		System.out.println("Digite a idade da pessoa por favor: ");
		int idade4 = sc.nextInt();
		
		System.out.println("Digite o nome da pessoa por favor: ");
		String pessoa5 = sc.next();
		System.out.println("Digite a idade da pessoa por favor: ");
		int idade5 = sc.nextInt();
		
		String nomeIdosos = "";
		String nomeNaoIdosos = "";
		
		String idadeIdosos = "";
		String idadeNaoIdosos = "";
		
		if (idade1>=60)	{
			nomeIdosos += " " + pessoa1;
			idadeIdosos += " " + idade1;
		} else {
			nomeNaoIdosos += " " + pessoa1;
			idadeNaoIdosos += " " + idade1;
		}
		
		if (idade2>=60)	{
			nomeIdosos += " " + pessoa2;
			idadeIdosos += " " + idade2;
		} else {
			nomeNaoIdosos += " " + pessoa2;
			idadeNaoIdosos += " " + idade2;
		}
		
		if (idade3>=60)	{
			nomeIdosos += " " + pessoa3;
			idadeIdosos += " " + idade3;
		} else {
			nomeNaoIdosos += " " + pessoa3;
			idadeNaoIdosos += " " + idade3;
		}
		
		if (idade4>=60)	{
			nomeIdosos += " " + pessoa4;
			idadeIdosos += " " + idade4;
		} else {
			nomeNaoIdosos += " " + pessoa4;
			idadeNaoIdosos += " " + idade4;
		}
		
		if (idade5>=60)	{
			nomeIdosos += " " + pessoa5;
			idadeIdosos += " " + idade5;
		} else {
			nomeNaoIdosos += " " + pessoa5;
			idadeNaoIdosos += " " + idade5;
		}
		
		
		System.out.println("Os idosos são: " + nomeIdosos);
		System.out.println("A idade dos idosos: " + idadeIdosos);
		
		System.out.println("Não são idosos: " + nomeNaoIdosos);
		System.out.println("A idade dos não idosos: " + idadeNaoIdosos);
				
		
	}
	
	private static String lerNomeDaPessoa(){
		// Implemente  o conteúdo desse método e use-o no main
		return "";
	}
	
	private static int lerIdadeDaPessoa(){
		// Implemente  o conteúdo desse método e use-o no main
		return 0;
	}

}
