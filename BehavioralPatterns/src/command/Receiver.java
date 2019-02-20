package command;

import java.util.ArrayList;
import java.util.List;

public class Receiver {

	List<Command> commands = new ArrayList<>();

	public void addCommand(Command command) {
		commands.add(command);
	}

	public void run() {
		for (Command command : commands) {
			command.execute();
		}
	}
}
