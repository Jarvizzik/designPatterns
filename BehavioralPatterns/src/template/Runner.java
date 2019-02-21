package template;

public class Runner extends Starter {

	@Override
	void ready() {
		System.out.println("Runner is ready ... ");
	}

	@Override
	void steady() {
		System.out.println("Runner is steady ... ");
	}

	@Override
	void go() {
		System.out.println("Runner is running ... ");
	}

}
