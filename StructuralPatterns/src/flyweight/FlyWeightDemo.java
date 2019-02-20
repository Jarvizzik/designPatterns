package flyweight;

public class FlyWeightDemo {

	public static void main(String[] args) {

		Car blackToyota1 = CarFactory.getToyota("black");
		Car whiteToyota1 = CarFactory.getToyota("white");
		
		blackToyota1.drive();
		whiteToyota1.drive();
		
		Car blackToyota2 = CarFactory.getToyota("black");
		Car whiteToyota2 = CarFactory.getToyota("white");
		
		blackToyota2.drive();
		whiteToyota2.drive();
		
	}

}
