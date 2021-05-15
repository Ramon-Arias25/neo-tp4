package neotp4Model;

public class CanineDetector extends Canine implements Detector {

	private boolean train;
	private String equipment;
	private String assignedLocation;



	public CanineDetector(String id, String nombre, String tipo, String raza, String sexo) {
		super(id, nombre, tipo, raza, sexo);
		this.trainForDetectionOfPersonsAndExplosives();
		this.equipWithCameraForTracking();
		this.assignToBulkConcurrencyLocations();
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
	public void trainForDetectionOfPersonsAndExplosives() {
		this.train = true;
	}

	@Override
	public void equipWithCameraForTracking() {
		this.equipment = "Camara para Seguimiento";
	}

	@Override
	public void assignToBulkConcurrencyLocations() {
		this.assignedLocation = "Ubicacion Masiva";
	}

}
