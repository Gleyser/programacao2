package Operadores;

public class OperadoresAritmeticos {
	/*
	 * Lembre-se: sempre que for necessário executar algo, você deverá colocar o código dentro de um método main
	 * O método main é o método principal
	 */
	
	public static void main(String[] args) {
		int soma = 1 + 2;
		System.out.println(soma);
		
		int subtracao = soma - 1;
		System.out.println(subtracao);
		
		int multiplicacao = soma * 2;
		System.out.println(multiplicacao);
		
		// Atencao na divisao de inteiros!
		int divisao = soma / 2;
		System.out.println(divisao);
		
		int valor = 5;		
		int mod = valor % 2;
		System.out.println(mod);
		
		//Posso reusar variaveis
		int valorReusado = 10;
		valorReusado = valorReusado+ 10;
		System.out.println(valorReusado);
		
		// Posso concatenar Strings
		String primeiroNome = "Gleyser";
		String segundoNome = " Bomfim Guimarães";
		String nomeCompleto = primeiroNome + segundoNome;
		System.out.println(nomeCompleto);
		
		// Incremento
		int resultado = 0;
		resultado++;
		//mesma coisa que
		//resultado = resultado + 1;
		//resultado += 1;
		System.out.println(resultado);
					
		System.out.println(++resultado);
		//mesma coisa que
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado = 10;
		// Decremento
		resultado--;
		System.out.println(resultado);
		
		// Imprime e depois decrementa
		System.out.println(resultado--);
		// Note que que ele decrementou apos imprimir
		System.out.println(resultado);
		// Decrementa e depois imprime
		System.out.println(--resultado);
	}

}
