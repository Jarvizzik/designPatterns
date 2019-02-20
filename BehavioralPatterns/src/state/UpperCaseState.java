package state;

public class UpperCaseState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println(context.name.toUpperCase());
	}

}
