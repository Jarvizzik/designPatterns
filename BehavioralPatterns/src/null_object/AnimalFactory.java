package null_object;

public class AnimalFactory {

	public static final String[] animals = { "cat", "dog", "bird", "bear", "lion" };

	public static AbstractAnimal getAnimal(String name) {
		
		for (int i = 0; i < animals.length; i++) {
			
			if(animals[i].equals(name)) {
				return new RealAnimal(name);
			}
		}
		return new NullAnimal();
	}
}
