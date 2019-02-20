package interpreter;

public class Plus implements Expression {

	Expression leftOperand;
	Expression rightOperand;

	public Plus(Expression leftOperand, Expression rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	@Override
	public int interpret() {
		return leftOperand.interpret() + rightOperand.interpret();
	}

}
