package mvc;

public class CarController {
	private ModelLayer modelLayer;
	private CarView carView;

	public CarController(ModelLayer modelLayer, CarView carView) {
		this.modelLayer = modelLayer;
		this.carView = carView;
	}
	
	public void execute() {
		Car car = modelLayer.retrieveCarFromDB("Toyota", 1999);
		carView.displayCarInfo(car);
	}

}
