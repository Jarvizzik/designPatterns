package bridge;

public class BridgeDemo {
	public static void main(String[] args) {
		Car toyota = new SportCar(2, 300, new Toyota());
		Car audi = new SportCar(4, 700, new Audi());

		toyota.drive();
		audi.drive();
	}
}
