package decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		Car simpleCar = new SimpleCar();
		Car luxuryCar = new LuxuryCar();
		
		simpleCar.drive();
		luxuryCar.drive();
		
		Car simpleCarWithNitro = new NitroDecorator(new SimpleCar());
		Car luxuryCarWithNitro = new NitroDecorator(new LuxuryCar());
		
		simpleCarWithNitro.drive();
		luxuryCarWithNitro.drive();
		
	}

}
