package visitor;

public class Bird implements Animal {

	@Override
	public void say(Visitor visitor) {
		visitor.chirik();
	}

}
