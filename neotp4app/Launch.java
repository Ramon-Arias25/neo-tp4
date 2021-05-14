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
		 * id - Nombre - Tipo - Raza - sexo 1 - Kei - Protecci�n - Pastor belga malin�s
		 * - macho 2 - Matthis - Protecci�n - Pastor alem�n - macho 3 - Minnie -
		 * Detecci�n - Mestizo - hembra 4 - Marek - Protecci�n - Pastor holand�s - macho
		 * 5 - Sally - Protecci�n - Pastor alem�n - hembra 6 - Leia - Detecci�n - Pastor
		 * australiano - hembra 7 - Eddie - Protecci�n - Pastor belga malin�s - macho 8
		 * - Razor - Detecci�n - Border Collie - macho
		 *
		 */
		caninosList.add(new CaninoProtector("1", "Kei", "Protecci�n", "Pastor belga malin�s", "macho"));
		caninosList.add(new CaninoProtector("2", "Matthis", "Protecci�n", "Pastor alem�n", "macho"));
		caninosList.add(new CaninoDetector("3", "Minnie", "Detecci�n", "Mestizo", "hembra"));
		caninosList.add(new CaninoProtector("4", "Marek", "Protecci�n", "Pastor holand�s", "macho"));
		caninosList.add(new CaninoProtector("5", "Sally", "Protecci�n", "Pastor alem�n", "hembra"));
		caninosList.add(new CaninoDetector("6", "Leia", "Detecci�n", "Pastor australiano", "hembra"));
		caninosList.add(new CaninoProtector("7", "Eddie", "Protecci�n", "Pastor belga malin�s", "macho"));
		caninosList.add(new CaninoDetector("8", "Razor", "Detecci�n", "Border Collie", "macho"));


		//listadoPorTipo(caninosList, "Protecci�n");
		//listadoPorTipo(caninosList, "Detecci�n");
		
		System.out.println("Listado Canino de Protecci�n:");
		caninosProtectorList.addAll(listadoPorTipo(caninosList, "Protecci�n"));
		caninosProtectorList.forEach(System.out::println);

		System.out.println("Listado Canino de Detecci�n:");
		caninosDetectorList.addAll(listadoPorTipo(caninosList, "Detecci�n"));
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
