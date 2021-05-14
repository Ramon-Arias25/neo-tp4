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
 * 		1 	- Kei 		- Protecci�n 	- Pastor belga malin�s 	- macho
 *		2 	- Matthis 	- Protecci�n 	- Pastor alem�n			- macho
 *		3 	- Minnie 	- Detecci�n 	- Mestizo 				- hembra
 *		4 	- Marek 	- Protecci�n 	- Pastor holand�s		- macho
 *		5 	- Sally 	- Protecci�n 	- Pastor alem�n 		- hembra
 *		6 	- Leia 		- Detecci�n 	- Pastor australiano 	- hembra
 *		7 	- Eddie 	- Protecci�n 	- Pastor belga malin�s 	- macho
 *		8 	- Razor 	- Detecci�n 	- Border Collie 		- macho
 */
		caninosList.add(new CaninoProtector("1","Kei","Protecci�n", "Pastor belga malin�s" , "macho"));
		caninosList.add(new CaninoProtector("2","Matthis","Protecci�n","Pastor alem�n","macho"));
		caninosList.add(new CaninoDetector("3","Minnie","Detecci�n","Mestizo","hembra"));
		caninosList.add(new CaninoProtector("4","Marek","Protecci�n","Pastor holand�s","macho"));
		caninosList.add(new CaninoProtector("5","Sally","Protecci�n","Pastor alem�n","hembra"));
		caninosList.add(new CaninoDetector("6","Leia","Detecci�n","Pastor australiano","hembra"));
		caninosList.add(new CaninoProtector("7","Eddie","Protecci�n","Pastor belga malin�s","macho"));
		caninosList.add(new CaninoDetector("8","Razor","Detecci�n","Border Collie","macho"));
		
		//Imprimir Listado;
		imprimirListado(caninosList, "Protecci�n");
		imprimirListado(caninosList, "Detecci�n");
		
		//Conteo total por sexo
		totalPorSexo(caninosList,"macho");
		totalPorSexo(caninosList,"hembra");
	}
	
	public static void imprimirListado (List<Canino> lista, String filtro) {
		
		System.out.println("Listado Canino "+ filtro + ":");
		lista.stream()
			.filter(c -> c.getTipo().equals(filtro))
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
