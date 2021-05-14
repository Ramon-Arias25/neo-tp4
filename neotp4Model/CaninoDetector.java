package neotp4Model;

public class CaninoDetector extends Canino implements Detector {

	private boolean trained;
	private String equipment;
	private String assignedLocation;

	public CaninoDetector(String id, String nombre, String tipo, String raza, String sexo) {
		super(id, nombre, tipo, raza, sexo);
		this.trainedDetect();
		this.equippedCameras();
		this.assignedConcurrencyLocations();
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
	public void trainedDetect() {
		this.trained = true;
	}

	@Override
	public void equippedCameras() {
		this.equipment = "Camara para Seguimiento";
	}

	@Override
	public void assignedConcurrencyLocations() {
		this.assignedLocation = "Ubicacion Masiva";
	}

}
