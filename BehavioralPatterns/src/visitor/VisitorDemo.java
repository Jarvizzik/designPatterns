package visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		
		Animal animal = new Bird();
		animal.say(new ConcreteVisitor());
		
		animal = new Dog();
		animal.say(new ConcreteVisitor());
	}

}
