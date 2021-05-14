package neotp4Model;

public class CaninoDetector extends Canino implements Preparar{
	
	public CaninoDetector(String id, String nombre, String tipo, String raza, String sexo) {
		super(id, nombre, tipo, raza, sexo);
	}

	@Override
	public void detectar() {
		System.out.println("Entrenado para detección de personas y explosivos");
	}

	@Override
	public void equipar() {
		System.out.println("Equipado con cámaras para seguimiento");
	}

	@Override
	public void asignar() {
		System.out.println("Asignado a ubicaciones de concurrencia masiva");		
	}

}
