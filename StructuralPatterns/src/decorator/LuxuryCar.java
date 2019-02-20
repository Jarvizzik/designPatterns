package decorator;

public class LuxuryCar implements Car {

	@Override
	public void drive() {
		System.out.println("Luxury Car beep!");
	}

}
