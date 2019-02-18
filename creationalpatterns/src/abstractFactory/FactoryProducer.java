package abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean clever) {
		return clever ? new CleverChildFactory() : new ChildFactory();
	}
}
