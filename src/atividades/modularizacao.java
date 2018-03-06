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
		String nomeIdosos = "";
		String nomeNaoIdosos = "";
		
		String idadeIdosos = "";
		String idadeNaoIdosos = "";
		
		for (int i=0; i<5; i++){
			System.out.println("Digite o nome da pessoa por favor: ");
			String nome = lerNomeDaPessoa();
			System.out.println("Digite a idade da pessoa por favor: ");
			int idade = lerIdadeDaPessoa();
			if (idade>=60){
				nomeIdosos += nome + " ";
				idadeIdosos += idade + " ";
			} else {
				nomeNaoIdosos += nome + " ";
				idadeNaoIdosos += idade + " ";
			}
		}		
		
		
		System.out.println("Os idosos são: " + nomeIdosos);
		System.out.println("A idade dos idosos: " + idadeIdosos);
		
		System.out.println("Não são idosos: " + nomeNaoIdosos);
		System.out.println("A idade dos não idosos: " + idadeNaoIdosos);
				
		
	}
	
	private static String lerNomeDaPessoa(){
		String nome = sc.next();
		return nome;
	}
	
	private static int lerIdadeDaPessoa(){
		int idade = sc.nextInt();
		return idade;
	}

}