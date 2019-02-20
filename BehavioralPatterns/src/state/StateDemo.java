package state;

public class StateDemo {

	public static void main(String[] args) {
		
		Context context = new Context(new LowerCaseState(), "loWER");
		context.doAction();

		context = new Context(new UpperCaseState(), "upPER");
		context.doAction();

	}
}
