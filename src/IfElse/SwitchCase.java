package IfElse;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		/*
		 * SwitchCase serve para fazer menus e sele��es onde voc� sabe as op��es poss�veis.
		*/
		
		// Nesse exemplo a pessoa pode escolher entre: cadastrar produto,vender produto e sair
		System.out.println("Por favor, digite a op��o que deseja. 1 para vender, 2 para cadastrar e 3 para sair");
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Vendendo produto...");
			break;
			
		case 2:
			System.out.println("Cadastrando produto...");
			break;
			
		case 3:
			System.out.println("Saindo do sistema");
			break;

		default:
			System.out.println("Voc� n�o digitou uma op��o v�lida");
			break;
		}
		
	}

}
