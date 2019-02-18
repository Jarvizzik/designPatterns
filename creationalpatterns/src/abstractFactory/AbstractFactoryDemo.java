package abstractFactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// first factory
		AbstractFactory cleverChildFactory = FactoryProducer.getFactory(true);

		Child cleverSon = cleverChildFactory.getChild("Son");
		cleverSon.say();

		Child cleverDaughter = cleverChildFactory.getChild("Daughter");
		cleverDaughter.say();

		// second factory
		AbstractFactory childFactory = FactoryProducer.getFactory(false);

		Child son = childFactory.getChild("Son");
		son.say();

		Child daughter = childFactory.getChild("Daughter");
		daughter.say();
	}

}
