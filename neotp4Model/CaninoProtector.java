package neotp4Model;

public class CaninoProtector extends Canino implements Preparar{
	
	public CaninoProtector(String id, String nombre, String tipo, String raza, String sexo) {
		super(id, nombre, tipo, raza, sexo);
	}

	@Override
	public void detectar() {
		System.out.println("Entrenados para ataque");
	}

	@Override
	public void equipar() {
		System.out.println("equipados con chalecos tácticos de kevlar");
	}

	@Override
	public void asignar() {
		System.out.println("asignados para patrullaje en general");
	}

}
