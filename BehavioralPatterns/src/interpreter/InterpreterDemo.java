package interpreter;

public class InterpreterDemo {

	public static void main(String[] args) {
		String expression = "1+2-7";
		Expression evaluator = new Evaluator(expression);
		System.out.println(evaluator.interpret());
	}

}
