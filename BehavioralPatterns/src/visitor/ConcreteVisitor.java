package visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public void chirik() {
		System.out.println("chirik-chirik");
	}

	@Override
	public void bark() {
		System.out.println("haw-haw");
	}

}
