package neotp4app;

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
 *		1 	- Kei 		- Protección 	- Pastor belga malinés 	- macho
 *		2 	- Matthis 	- Protección 	- Pastor alemán 	- macho
 *		3 	- Minnie 	- Detección 	- Mestizo 		- hembra
 *		4 	- Marek 	- Protección 	- Pastor holandés	- macho
 *		5 	- Sally 	- Protección 	- Pastor alemán 	- hembra
 *		6 	- Leia 		- Detección 	- Pastor australiano 	- hembra
 *		7 	- Eddie 	- Protección 	- Pastor belga malinés 	- macho
 *		8 	- Razor 	- Detección 	- Border Collie 	- macho
 * 
 * */
		caninesList.add(new CanineProtector("1", "Kei", "Protección", "Pastor belga malinés", "macho"));
		caninesList.add(new CanineProtector("2", "Matthis", "Protección", "Pastor alemán", "macho"));
		caninesList.add(new CanineDetector("3", "Minnie", "Detección", "Mestizo", "hembra"));
		caninesList.add(new CanineProtector("4", "Marek", "Protección", "Pastor holandés", "macho"));
		caninesList.add(new CanineProtector("5", "Sally", "Protección", "Pastor alemán", "hembra"));
		caninesList.add(new CanineDetector("6", "Leia", "Detección", "Pastor australiano", "hembra"));
		caninesList.add(new CanineProtector("7", "Eddie", "Protección", "Pastor belga malinés", "macho"));
		caninesList.add(new CanineDetector("8", "Razor", "Detección", "Border Collie", "macho"));

		System.out.println("==================================================================================");
		System.out.println("Listado Canino de Protección:");
		System.out.println("==================================================================================");
		caninesProtectorList.addAll(listingByType(caninesList, "Protección"));
		caninesProtectorList.forEach(System.out::println);

		System.out.println("==================================================================================");
		System.out.println("Listado Canino de Detección:");
		System.out.println("==================================================================================");
		caninesDetectorList.addAll(listingByType(caninesList, "Detección"));
		caninesDetectorList.forEach(System.out::println);
		
		System.out.println("==================================================================================");
		System.out.println("Totales por Sexo:");
		System.out.println("==================================================================================");
		System.out.println("Conteo total de machos: " + totalBySex(caninesList, "macho"));
		System.out.println("Conteo total de hembras: " + totalBySex(caninesList, "hembra"));
	}

	public static List<Canine> listingByType(List<Canine> list, String type) {
		List<Canine> aux = new ArrayList<>(); 				
		list.stream().filter(canine -> canine.getType().equals(type)).forEach(aux::add);
		return aux;
	}

	public static int totalBySex(List<Canine> list, String sex) {
		return (int) list.stream().filter(canine -> canine.getSex().equals(sex)).count();
	}
}
