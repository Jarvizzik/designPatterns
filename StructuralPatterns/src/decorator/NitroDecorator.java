package decorator;

public class NitroDecorator extends CarDecorator {

	public NitroDecorator(Car car) {
		super(car);
	}

	@Override
	public void drive() {
		car.drive();
		addNitro(car);
	}
	
	private void addNitro(Car car) {
		System.out.println("with nitro!");
	}

}
