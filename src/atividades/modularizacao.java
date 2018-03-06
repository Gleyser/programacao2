package atividades;

import java.util.Scanner;

public class modularizacao {
	private static Scanner sc = new Scanner(System.in);
	
	/* Esse programa recebe do usu�rio 5 nomes e 5 idades e
	 * informa quantas e quais s�o idosas (idade maior que 60 anos) e quantas/quais n�o s�o.
	 * 
	 * Esse c�digo est� MUITO FEIO E MUITO GRANDE. Seu trabalho � modularizar e melhorar o c�digo.
	 * 
	 * Dicas: implemente os m�todos abaixo e use-os.
	 * Dicas: Que tal usar um la�o de repeti��o? FOR OU WHILE? Por que?
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
		
		
		System.out.println("Os idosos s�o: " + nomeIdosos);
		System.out.println("A idade dos idosos: " + idadeIdosos);
		
		System.out.println("N�o s�o idosos: " + nomeNaoIdosos);
		System.out.println("A idade dos n�o idosos: " + idadeNaoIdosos);
				
		
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