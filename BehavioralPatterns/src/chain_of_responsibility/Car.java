package chain_of_responsibility;

public class Car extends AbstractCleaner {

	public Car(int state) {
		this.state = state;
	}

	@Override
	protected void clean() {
		System.out.print("I`m a ");
		switch (state) {
			case 1:
				System.out.println("cleaned car :)");
				break;
			case 2:
				System.out.println("dirty car :(");
				break;
			case 3:
				System.out.println("very dirty car :o");
				break;
		}
	}
}
