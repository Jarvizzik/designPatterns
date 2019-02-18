package factory;

public class ChildFactory {

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
