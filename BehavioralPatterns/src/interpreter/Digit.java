package interpreter;

public class Digit implements Expression {
	int digit;

	public Digit(int digit) {
		this.digit = digit;
	}

	@Override
	public int interpret() {
		return digit;
	}

}
