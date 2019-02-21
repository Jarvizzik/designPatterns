package strategy;

public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double getSalary(double salary) {
		return strategy.getSalary(salary);
	}
}
