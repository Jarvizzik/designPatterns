package state;

public class LowerCaseState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println(context.name.toLowerCase());
	}

}
