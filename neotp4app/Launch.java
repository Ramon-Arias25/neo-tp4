package neotp4app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import neotp4Model.Canino;
import neotp4Model.CaninoDetector;
import neotp4Model.CaninoProtector;

public class Launch {

	public static void main(String[] args) {
		List<Canino> caninosList = new ArrayList<>();
		List<Canino> caninosProtectorList = new ArrayList<>();
		List<Canino> caninosDetectorList = new ArrayList<>();
		/*
		 *
		 * id - Nombre - Tipo - Raza - sexo 1 - Kei - Protección - Pastor belga malinés
		 * - macho 2 - Matthis - Protección - Pastor alemán - macho 3 - Minnie -
		 * Detección - Mestizo - hembra 4 - Marek - Protección - Pastor holandés - macho
		 * 5 - Sally - Protección - Pastor alemán - hembra 6 - Leia - Detección - Pastor
		 * australiano - hembra 7 - Eddie - Protección - Pastor belga malinés - macho 8
		 * - Razor - Detección - Border Collie - macho
		 *
		 */
		caninosList.add(new CaninoProtector("1", "Kei", "Protección", "Pastor belga malinés", "macho"));
		caninosList.add(new CaninoProtector("2", "Matthis", "Protección", "Pastor alemán", "macho"));
		caninosList.add(new CaninoDetector("3", "Minnie", "Detección", "Mestizo", "hembra"));
		caninosList.add(new CaninoProtector("4", "Marek", "Protección", "Pastor holandés", "macho"));
		caninosList.add(new CaninoProtector("5", "Sally", "Protección", "Pastor alemán", "hembra"));
		caninosList.add(new CaninoDetector("6", "Leia", "Detección", "Pastor australiano", "hembra"));
		caninosList.add(new CaninoProtector("7", "Eddie", "Protección", "Pastor belga malinés", "macho"));
		caninosList.add(new CaninoDetector("8", "Razor", "Detección", "Border Collie", "macho"));


		//listadoPorTipo(caninosList, "Protección");
		//listadoPorTipo(caninosList, "Detección");
		
		System.out.println("Listado Canino de Protección:");
		caninosProtectorList.addAll(listadoPorTipo(caninosList, "Protección"));
		caninosProtectorList.forEach(System.out::println);

		System.out.println("Listado Canino de Detección:");
		caninosDetectorList.addAll(listadoPorTipo(caninosList, "Detección"));
		caninosDetectorList.forEach(System.out::println);
		
		System.out.println("Conteo total de machos: " + totalPorSexo(caninosList, "macho"));
		System.out.println("Conteo total de hembras: " + totalPorSexo(caninosList, "hembra"));
	}

	public static List<Canino> listadoPorTipo(List<Canino> lista, String tipo) {
		List<Canino> bList = new ArrayList<>(); 				
		lista.stream()
			.filter(canino -> canino.getTipo().equals(tipo))
			.forEach(bList::add);
		return bList;
	}

	public static int totalPorSexo(List<Canino> lista, String sexo) {
		return (int) lista.stream().filter(canino -> canino.getSexo().equals(sexo)).count();
	}
}
