package lacosDeRepeticao;

public class For {

	public static void main(String[] args) {

		// um FOR que imprime de 0 a 100.
		for (int i = 0; i<101; i++){
			System.out.println(i);
		}

		// um FOR que imprime APENAS os divisiveis por 2 de 1 a 100
		for (int i = 0; i<101; i++){
			if (i%2 == 0) {
				System.out.println(i);
			}
		}

		// um FOR que imprime APENAS os divisiveis por 2 E 3 de 1 a 100
		for (int i = 0; i<101; i++){
			if (i%2 == 0 && i%3 == 0) {
				System.out.println(i);
			}
		}
		
		// um  FOR que imprime APENAS os divisiveis por 2 OU 3 de 1 a 100
				for (int i = 0; i<101; i++){
					if (i%2 == 0 || i%3 == 0) {
						System.out.println(i);
					}
				}
	}

}
