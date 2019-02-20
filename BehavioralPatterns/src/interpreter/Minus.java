package interpreter;

public class Minus extends Plus {

	public Minus(Expression leftOperand, Expression rightOperand) {
		super(leftOperand, rightOperand);
	}

	@Override
	public int interpret() {
		return leftOperand.interpret() - rightOperand.interpret();
	}
}
