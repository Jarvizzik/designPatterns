package abstractFactory;

public class CleverChildFactory extends AbstractFactory{
	
	public Child getChild(String sexOfChild) {
		switch (sexOfChild) {
			case "Son":
				return new CleverSon();
			case "Daughter":
				return new CleverDaughter();
			default:
				return null;
		}
	}
}
