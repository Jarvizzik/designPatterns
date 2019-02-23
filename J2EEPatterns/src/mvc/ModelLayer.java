package mvc;

public interface ModelLayer {
	Car retrieveCarFromDB(String brand, Integer year);
}
