package adapter;

public class AdapterDemo {
	public static void main(String[] args) {

		Sparrow sparrow = new Sparrow();
		System.out.println("Sparrow...");
		sparrow.makeSound();


		Toy toySparrow = new ToySparrow();
		System.out.println("ToyDuck...");
		toySparrow.squeak();


		Toy bird = new BirdAdapter(sparrow);
		System.out.println("BirdAdapter...");
		bird.squeak();
	}
}
