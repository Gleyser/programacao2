package modularizandoAsClasses;

import java.util.Scanner;

public class Modulos {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		if(retornaSeEhPar(lerInteiroDoTeclado())){
			System.out.println("o numero lido eh par");
		} else {
			System.out.println("o numero lido não eh par");
		}
	}
	
	public static int lerInteiroDoTeclado(){
		System.out.println("Digite um inteiro por favor: ");
		int retorno = sc.nextInt();
		return retorno;
	}
	
	public static boolean retornaSeEhPar(int numero){
		if (numero%2 == 0){
			return true;
		}
		return false;
	}

}
