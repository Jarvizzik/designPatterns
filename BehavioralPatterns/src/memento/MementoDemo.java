package memento;

public class MementoDemo {
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		
		originator.setState("one");
		
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(originator.createMemento());
		
		originator.setState("two");
		
		originator.getDataFromMemento(careTaker.getMemento());
		System.out.println(originator.getState());
		
	}
}
