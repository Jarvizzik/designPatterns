package state;

public class Context {
	State state;
	String name;

	public Context(State state, String name) {
		this.state = state;
		this.name = name;
	}

	public void setState(State state) {
		this.state = state;
	}

	void doAction() {
		state.doAction(this);
	}

}
