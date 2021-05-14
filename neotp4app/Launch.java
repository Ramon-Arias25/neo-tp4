package neotp4app;

import java.util.ArrayList;
import java.util.List;

import neotp4Model.Canino;
import neotp4Model.CaninoDetector;
import neotp4Model.CaninoProtector;

public class Launch {

	public static void main(String[] args) {
		List<Canino> caninosList = new ArrayList<>();
/*
 *
 *		id 	- Nombre 	- Tipo 		- Raza 			- sexo
 *		1 	- Kei 		- Protección 	- Pastor belga malinés 	- macho
 *		2 	- Matthis 	- Protección 	- Pastor alemán 	- macho
 *		3 	- Minnie 	- Detección 	- Mestizo 		- hembra
 *		4 	- Marek 	- Protección 	- Pastor holandés	- macho
 *		5 	- Sally 	- Protección 	- Pastor alemán 	- hembra
 *		6 	- Leia 		- Detección 	- Pastor australiano 	- hembra
 *		7 	- Eddie 	- Protección 	- Pastor belga malinés 	- macho
 *		8 	- Razor 	- Detección 	- Border Collie 	- macho
 *
 */
		caninosList.add(new CaninoProtector("1","Kei","Protección", "Pastor belga malinés" , "macho"));
		caninosList.add(new CaninoProtector("2","Matthis","Protección","Pastor alemán","macho"));
		caninosList.add(new CaninoDetector("3","Minnie","Detección","Mestizo","hembra"));
		caninosList.add(new CaninoProtector("4","Marek","Protección","Pastor holandés","macho"));
		caninosList.add(new CaninoProtector("5","Sally","Protección","Pastor alemán","hembra"));
		caninosList.add(new CaninoDetector("6","Leia","Detección","Pastor australiano","hembra"));
		caninosList.add(new CaninoProtector("7","Eddie","Protección","Pastor belga malinés","macho"));
		caninosList.add(new CaninoDetector("8","Razor","Detección","Border Collie","macho"));
		
		//Imprimir Listado;
		listadoPorTipo(caninosList, "Protección");
		listadoPorTipo(caninosList, "Detección");
		
		//Conteo total por sexo
		totalPorSexo(caninosList,"macho");
		totalPorSexo(caninosList,"hembra");
	}
	
	public static void listadoPorTipo (List<Canino> lista, String tipo) {
		
		System.out.println("Listado Canino "+ tipo + ":");
		lista.stream()
			.filter(c -> c.getTipo().equals(tipo))
			.forEach(System.out::println);
		System.out.println("-----------------------------------");
	}
	
	public static void totalPorSexo (List<Canino> lista, String sexo) {
		System.out.println("Conteo de " + sexo + ": " +
							lista.stream()
								.filter(c -> c.getSexo().equals(sexo))
								.count());
	}

}
