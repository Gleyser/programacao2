package IfElse;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		/*
		 * SwitchCase serve para fazer menus e seleções onde você sabe as opções possíveis.
		*/
		
		// Nesse exemplo a pessoa pode escolher entre: cadastrar produto,vender produto e sair
		System.out.println("Por favor, digite a opção que deseja. 1 para vender, 2 para cadastrar e 3 para sair");
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
			System.out.println("Você não digitou uma opção válida");
			break;
		}
		
	}

}
