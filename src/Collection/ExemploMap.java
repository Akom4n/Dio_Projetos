package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
	
	public static void main(String[] args) {
		
		System.out.println("Crie um dicionario que relacione os modelos e seus respectivos valores: ");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		
		System.out.println(carrosPopulares.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2 km/L: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		
		System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tukson"));
		
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
		
		//System.out.println("Exiba o terceiro modelo adicionado: ");
		
		System.out.println("Exiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> consumo = carrosPopulares.values();
		System.out.println(consumo);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		
		
		for(Map.Entry<String, Double> entry: entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}
		
		
		
		
	}

}