package lacosDeRepeticao;

public class While {

	public static void main(String[] args) {
				
		// While que imprime os números de 1 a 100
		int contador = 0;
		while (contador<101){
			System.out.println(contador);
			contador++;
		}
		
		// While que imprime APENAS os números de 1 a 100 que sao divisiveis por dois
		contador = 0;
		while (contador<101){
			if (contador%2 == 0) {
				System.out.println(contador);
			}
			contador++;
		}
		
		// While que imprime APENAS os números de 1 a 100 que sao divisiveis por 2 ou 3
				contador = 0;
				while (contador<101){
					if (contador%2 == 0 || contador%3 == 0) {
						System.out.println(contador);
					}
					contador++;
				}


	}

}
