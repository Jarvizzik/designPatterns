package interpreter;

import java.util.Stack;

public class Evaluator implements Expression {
	Expression evaluate;

	public Evaluator(String expression) {
		Stack<Expression> expressions = new Stack<>();
		String expressionRever = new StringBuilder(expression).reverse().toString();

		for (String s : expressionRever.split("\\D")) {
			expressions.push(new Digit(Integer.parseInt(s)));
		}
		for(Expression e : expressions) {
			System.out.println(e.interpret());
		}
		for (String s : expression.split("\\d")) {

			if (s.equals("+")) {
				expressions.push(new Plus(expressions.pop(), expressions.pop()));
			} else if (s.equals("-")) {
				expressions.push(new Minus(expressions.pop(), expressions.pop()));
			}
		}
		for(Expression e : expressions) {
			System.out.println(e.interpret());
		}
		evaluate = expressions.pop();
	}

	@Override
	public int interpret() {
		return evaluate.interpret();
	}

}
