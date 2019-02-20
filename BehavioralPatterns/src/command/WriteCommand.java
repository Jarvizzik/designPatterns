package command;

public class WriteCommand implements Command {

	@Override
	public void execute() {
		System.out.println("write");
	}

}
