package mvc;

public class MVCDemo {
	public static void main(String[] args) {
		CarController carController = new CarController(new DBLayer(), new CarView());
		carController.execute();
	}
}
