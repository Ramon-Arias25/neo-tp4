package neotp4Model;

public class CaninoProtector extends Canino implements Protector {

	private boolean trained;
	private String equipment;
	private String assignedLocation;

	public CaninoProtector(String id, String nombre, String tipo, String raza, String sexo) {
		super(id, nombre, tipo, raza, sexo);
		this.trainedForAttack();
		this.equipTacticalVests();
		this.assignGeneralPatrol();
	}

	public boolean isTrained() {
		return trained;
	}

	public String getEquipment() {
		return equipment;
	}

	public String getAssignedLocation() {
		return assignedLocation;
	}

	@Override
	public void trainedForAttack() {
		this.trained = true;
	}

	@Override
	public void equipTacticalVests() {
		this.equipment = "Chalecos Tácticos de Kevlar";
	}

	@Override
	public void assignGeneralPatrol() {
		this.assignedLocation = "Patrullaje en general";
	}

}
