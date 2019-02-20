package mediator;

public abstract class User {
	protected ChatMediator chatMediator;
	protected String name;

	public User(ChatMediator chatMediator, String name) {
		this.name = name;
		this.chatMediator = chatMediator;
	}

	public abstract void receive(String message);

	public abstract void send(String message);

}
