package Operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		// Operador AND
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("valor1 � 1 AND valor2 � 2 - resultado: " + resultado1);
		
		// Operador OR
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("valor1 � 1 OR valor2 � 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		// Operador AND
		System.out.println(verdadeiro && falso);
		
		// Operador OR
		System.out.println(verdadeiro || falso);
		
		// Operador NOT
		System.out.println(!falso);
		
		// Operador OU EXCLUSIVO
		System.out.println(verdadeiro ^ falso);
		
		// NEGA��O DE VERDADEIRO OU FALSO
		System.out.println(!verdadeiro || falso);
		
		
	/*	Pode ser �til:
	 * 
	 * && E ("logical AND") a && b
		retorna true se a e b forem ambos true. Sen�o retorna false. Se a for false, b n�o � avaliada.

		& E ("boolean logical AND") a & b
		retorna true se a e b forem ambos true. Sen�o retorna false. Ambas express�es a e b s�o sempre avaliadas.

		|| OU ("logical OR") a || b
		retorna true se a ou b for true. Sen�o retorna false. Se a for true, b n�o � avaliada.

		| OU ("boolean logical inclusive OR") a | b
		retorna true se a ou b for true. Sen�o retorna false. Ambas express�es a e b s�o sempre avaliadas.

		^ OU EXCLUSIVO ("boolean logical exclusive OR") a ^ b
		retorna true se a for true e b for false ou vice-versa. Sen�o retorna false

		! N�O ("logical NOT") !a
		retorna true se a for false. Sen�o retorna false*/
	}

}
