package abstractFactory;

public class ChildFactory extends AbstractFactory{
	
	public Child getChild(String sexOfChild) {
		switch (sexOfChild) {
			case "Son":
				return new Son();
			case "Daughter":
				return new Daughter();
			default:
				return null;
		}
	}
}
