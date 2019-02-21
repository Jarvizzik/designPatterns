package template;

public class RaceCar extends Starter {

	@Override
	void ready() {
		System.out.println("RaceCar is ready ... ");
	}

	@Override
	void steady() {
		System.out.println("RaceCar is steady ... ");
	}

	@Override
	void go() {
		System.out.println("RaceCar is riding ... ");
	}

}
