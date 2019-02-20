package memento;

public class Originator {
	String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	Memento createMemento() {
		return new Memento(state);
	}
	
	void getDataFromMemento(Memento memento) {
		this.state = memento.getState();
	}
	
}