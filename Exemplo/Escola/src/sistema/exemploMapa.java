package sistema;

import java.util.HashMap;
import java.util.Map;

public class exemploMapa {
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		mapa.put("amadeu", 1);
		mapa.put("maria", 25);
		mapa.put("jose", 12);
		mapa.put("carlos", 50);
		Integer[] valores = (Integer[]) mapa.values().toArray();
		for (Integer elemento: valores ){
			System.out.println(elemento);
		}
	}

}
