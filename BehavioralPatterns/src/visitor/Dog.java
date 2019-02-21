package visitor;

public class Dog implements Animal {

	@Override
	public void say(Visitor visitor) {
		visitor.bark();
	}

}
