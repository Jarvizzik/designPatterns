package command;

public class CommandDemo {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		receiver.addCommand(new ReadCommand());
		receiver.addCommand(new WriteCommand());
		receiver.run();

	}

}
