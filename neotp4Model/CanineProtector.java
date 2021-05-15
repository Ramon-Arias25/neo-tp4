package neotp4Model;

public class CanineProtector extends Canine implements Protector {

	private boolean train;
	private String equipment;
	private String assignedLocation;

	

	public CanineProtector(String id, String nombre, String tipo, String raza, String sexo) {
		super(id, nombre, tipo, raza, sexo);
		this.trainForAttack();
		this.equipWithKevlarTacticalVests();
		this.assignForGeneralPatrol();	
	}

	public boolean isTrained() {
		return train;
	}

	public String getEquipment() {
		return equipment;
	}

	public String getAssignedLocation() {
		return assignedLocation;
	}

	@Override
	public void trainForAttack() {
		this.train = true;
	}

	@Override
	public void equipWithKevlarTacticalVests() {
		this.equipment = "Chalecos Tácticos de Kevlar";
	}

	@Override
	public void assignForGeneralPatrol() {
		this.assignedLocation = "Patrullaje en general";
	}

}
