package composite;

import java.util.ArrayList;
import java.util.List;

public class Developer {
	private String name;
	private String position;
	private int salary;
	private List<Developer> subordinates = new ArrayList<>();

	public Developer(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public void add(Developer developer) {
		subordinates.add(developer);
	}

	public void remove(Developer developer) {
		subordinates.remove(developer);
	}

	public List<Developer> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		return "Developer: " + this.name + ", " + this.position + ", " + this.salary + ". ";
	}

}
