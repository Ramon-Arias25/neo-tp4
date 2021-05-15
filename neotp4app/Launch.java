package neotp4app;
/**
 * 
 * @author ramon.arias
 * date: 13/05/2021
 * current version: 1
 * 
 * 
 * */
import java.util.ArrayList;
import java.util.List;

import neotp4Model.Canine;
import neotp4Model.CanineDetector;
import neotp4Model.CanineProtector;

public class Launch {

	public static void main(String[] args) {
		List<Canine> caninesList = new ArrayList<>();
		List<Canine> caninesProtectorList = new ArrayList<>();
		List<Canine> caninesDetectorList = new ArrayList<>();
		/*
		 * 		id 	- Nombre 	- Tipo 		- Raza 			- sexo
		 *		1 	- Kei 		- Protecci�n 	- Pastor belga malin�s 	- macho
		 *		2 	- Matthis 	- Protecci�n 	- Pastor alem�n 	- macho
		 *		3 	- Minnie 	- Detecci�n 	- Mestizo 		- hembra
		 *		4 	- Marek 	- Protecci�n 	- Pastor holand�s	- macho
		 *		5 	- Sally 	- Protecci�n 	- Pastor alem�n 	- hembra
		 *		6 	- Leia 		- Detecci�n 	- Pastor australiano 	- hembra
		 *		7 	- Eddie 	- Protecci�n 	- Pastor belga malin�s 	- macho
		 *		8 	- Razor 	- Detecci�n 	- Border Collie 	- macho
		 * 
		 * */
		caninesList.add(new CanineProtector("1", "Kei", "Protecci�n", "Pastor belga malin�s", "macho"));
		caninesList.add(new CanineProtector("2", "Matthis", "Protecci�n", "Pastor alem�n", "macho"));
		caninesList.add(new CanineDetector("3", "Minnie", "Detecci�n", "Mestizo", "hembra"));
		caninesList.add(new CanineProtector("4", "Marek", "Protecci�n", "Pastor holand�s", "macho"));
		caninesList.add(new CanineProtector("5", "Sally", "Protecci�n", "Pastor alem�n", "hembra"));
		caninesList.add(new CanineDetector("6", "Leia", "Detecci�n", "Pastor australiano", "hembra"));
		caninesList.add(new CanineProtector("7", "Eddie", "Protecci�n", "Pastor belga malin�s", "macho"));
		caninesList.add(new CanineDetector("8", "Razor", "Detecci�n", "Border Collie", "macho"));

		System.out.println("==================================================================================");
		System.out.println("Listado Canino de Protecci�n:");
		System.out.println("==================================================================================");
		caninesProtectorList.addAll(listingByType(caninesList, "Protecci�n"));
		caninesProtectorList.forEach(System.out::println);

		System.out.println("==================================================================================");
		System.out.println("Listado Canino de Detecci�n:");
		System.out.println("==================================================================================");
		caninesDetectorList.addAll(listingByType(caninesList, "Detecci�n"));
		caninesDetectorList.forEach(System.out::println);

		System.out.println("==================================================================================");
		System.out.println("Totales por Sexo:");
		System.out.println("==================================================================================");
		System.out.println("Conteo total de machos: " + totalBySex(caninesList, "macho"));
		System.out.println("Conteo total de hembras: " + totalBySex(caninesList, "hembra"));
	}
	/**
	 * 
	 * Method that generates a list from a canine type list 
	 * and returns a filtered list through the canine type 
	 * class attribute, for this example "Detection" or "Protection"
	 * @param Canine
	 * @param type
	 * @return listByType
	 * */
	public static List<Canine> listingByType(List<Canine> list, String type) {
		List<Canine> aux = new ArrayList<>();
		list.stream().filter(canine -> canine.getType().equals(type)).forEach(aux::add);
		return aux;
	}
	/**
	 * Method that returns the total count of 
	 * canines by sex, for which it requires as a parameter a 
	 * list of canine type and the class attribute "sex" of type String, for this example "male" or "female"
	 * @param canine
	 * @param sex
	 * @return totalBySex
	 */
	public static int totalBySex(List<Canine> list, String sex) {
		return (int) list.stream().filter(canine -> canine.getSex().equals(sex)).count();
	}
}
