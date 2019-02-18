package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		ChildFactory childFactory = new ChildFactory();
		
		Child son = childFactory.getChild("Son");
		son.say();

		Child daughter = childFactory.getChild("Daughter");
		daughter.say();
	}

}
