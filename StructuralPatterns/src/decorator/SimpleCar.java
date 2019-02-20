package decorator;

public class SimpleCar implements Car {

	@Override
	public void drive() {
		System.out.println("Simple Car beep!");
	}
}
