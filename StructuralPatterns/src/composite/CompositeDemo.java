package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {

	public static void main(String[] args) {

		Developer Senior = new Developer("Mark", "Senior", 300);
		Developer Middle = new Developer("Sam", "Middle", 200);
		Developer Junior = new Developer("John", "Junior", 100);
		Developer Trainee = new Developer("Greg", "Trainee", 50);

		Senior.add(Middle);
		Middle.add(Junior);
		Junior.add(Trainee);

		System.out.println(Senior);
		print(Senior);

	}

	public static void print(Developer developer) {

		System.out.println(developer.getSubordinates());

		for (Developer subordinate : developer.getSubordinates()) {
			print(subordinate);
		}
	}

}
