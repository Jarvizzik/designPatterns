package composite_entity;

public class CompositeEntityDemo {

	public static void main(String[] args) {

		CompositeEntity compositeEntity = new CompositeEntity();

		compositeEntity.setMarriedCoupleNames("Ivan", "Maria");

		for (String s : compositeEntity.getNames()) {
			System.out.println(s);
		}

	}

}
