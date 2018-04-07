package excecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class exemploExcecoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Capturando excecao de divisao por zero
		try {
			int num1 = sc.nextInt();			
			int divisao = num1/0;
		} catch (Exception e) {
			System.err.println("O denominador nao pode ser zero");
		}
		
		// Capturando excecao de leitura de dados (esperava inteiro e o usu�rio digita string)
		try {
			int num1 = sc.nextInt();	
			
		} catch (Exception e) {
			System.err.println("Voc� n�o digitou um inteiro v�lido");
		}
		
		// Capturando excecao de acessar indice que nao existe no array
		try {
			ArrayList<String> nomes = new ArrayList<String>();	
			nomes.add("Maria");
			nomes.add("Amadeu");
			System.out.println(nomes.get(3));
			
		} catch (Exception e) {
			System.err.println("Voc� tentou acessar um indice inv�lido");
		}
	}

}
