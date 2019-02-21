package strategy;

public class HalfSalary implements Strategy {

	@Override
	public double getSalary(double salary) {
		return salary * 0.5;
	}

}
