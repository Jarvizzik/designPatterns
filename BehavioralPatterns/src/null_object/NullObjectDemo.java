package null_object;

public class NullObjectDemo {

	public static void main(String[] args) {
		
		AbstractAnimal animal1 = AnimalFactory.getAnimal("cat");
		AbstractAnimal animal2 = AnimalFactory.getAnimal("sparrow");
		AbstractAnimal animal3 = AnimalFactory.getAnimal("dog");
		AbstractAnimal animal4 = AnimalFactory.getAnimal("lion");

		System.out.println("Animals");
		System.out.println(animal1.getName());
		System.out.println(animal2.getName());
		System.out.println(animal3.getName());
		System.out.println(animal4.getName());
	}

}
