package strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		
		double avgSalary = 500;
		System.out.println("Average salary - " + avgSalary);
		
		Context context = new Context(new FullSalary());
		double bestSalary = context.getSalary(avgSalary);
		System.out.println("Salary of better workers - " + bestSalary);
		
		context = new Context(new HalfSalary());
		double worstSalary = context.getSalary(avgSalary);
		System.out.println("Salary of worse workers - " + worstSalary);
		
	}
}
