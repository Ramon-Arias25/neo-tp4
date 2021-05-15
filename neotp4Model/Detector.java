package neotp4Model;
/**
 * 
 * @author ramon.arias
 * date: 14/05/2021
 * current version: 1
 * Detector Interface: which should be used for the preparation of members of the k-9 unit destined to have a detector role
 * 
 * */
public interface Detector {
	public void trainForDetectionOfPersonsAndExplosives();

	public void equipWithCameraForTracking();

	public void assignToBulkConcurrencyLocations();
}
