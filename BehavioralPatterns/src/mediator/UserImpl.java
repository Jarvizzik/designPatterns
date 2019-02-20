package mediator;

public class UserImpl extends User {

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sending message: " + message);
		chatMediator.sendMessage(this, message);
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received message: " + message);
	}
}
