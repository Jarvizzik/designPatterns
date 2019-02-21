package strategy;

public class FullSalary implements Strategy {

	@Override
	public double getSalary(double salary) {
		return salary * 1.5;
	}

}
