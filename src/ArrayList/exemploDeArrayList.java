package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class exemploDeArrayList {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> listaDeNomes = new ArrayList<String>();
		
		// Adicionando string lidas do teclado no array
		listaDeNomes.add(lerStringDoTeclado());
		listaDeNomes.add(lerStringDoTeclado());
		listaDeNomes.add(lerStringDoTeclado());
		listaDeNomes.add(lerStringDoTeclado());
		
		// Adicionando string diretamente no array
		listaDeNomes.add("Maria");
		listaDeNomes.add("José");
		
		// Imprimindo o TAMANHO DO ARRAY
		System.out.println(listaDeNomes.size());
		
		// Removendo elemento do array passando o ELEMENTO
		listaDeNomes.remove("Maria");
		
		// Imprimindo o TAMANHO DO ARRAY
		System.out.println(listaDeNomes.size());
		
		// Removendo elemento do array passando o INDICE do elemento
		listaDeNomes.remove(0);
		
		// Recuperando os elementos do ARRAY pelo INDICE
		listaDeNomes.get(0);
		listaDeNomes.get(2);
		
		// Para saber se um elemento está no ARRAY 
		listaDeNomes.contains("José");
		
		// Para ITERAR sobre os elementos do ARRAY 
		for (String nome : listaDeNomes){
			System.out.println(nome);
		}
		
		// Para imprimir a representação do ARRAY 
		System.out.println(listaDeNomes.toString());
				
		
		
	}
	
	public static String lerStringDoTeclado(){
		System.out.println("Digite uma string por favor: ");
		String retorno = sc.next();
		return retorno;
	}

}
