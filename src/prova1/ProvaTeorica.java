package prova1;

import java.util.Scanner;

public class ProvaTeorica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nick do invocador");
		String nick  = scan.next();		
		boolean morte = false;
		int vida, dano;
		System.out.println("o nick do invocador eh: " + nick);
		vida = 75;
		int forca = vida/5;		
		dano  = scan.nextInt();
		if (dano >= vida){
			vida = vida - dano;
			if (dano > forca + vida){
				morte = true;
				forca = forca + 20;
			} else {
				morte = false;
				forca = forca - 10;
				vida = vida * 2;
			} 
		}		
		if (morte){
				System.out.println(nick + " foi eliminado");
				System.out.println("Dados: " + "forca: " + forca + " vida: " + vida );
			} else{
				System.out.println(nick + " foi atacado");
				System.out.println("Dados: " + "forca: " + forca + " vida: " + vida );
			}
		} 
	

}
