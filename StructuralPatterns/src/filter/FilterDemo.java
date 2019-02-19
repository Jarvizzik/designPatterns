package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>() {
			{
				add(new Person("Mark", 17, 175));
				add(new Person("Vanya", 19, 180));
				add(new Person("Sam", 23, 165));
				add(new Person("Rostyk", 16, 168));
			}
		};

		Filter byHeight = new HeightFilter();

		System.out.println("Tall: ");
		printPersons(byHeight.filter(persons));

		Filter byAge = new AgeFilter();

		System.out.println("Adult: ");
		printPersons(byAge.filter(persons));
	}

	public static void printPersons(List<Person> persons) {

		for (Person person : persons) {
			System.out.println("Name : " + person.getName());
		}
	}
}
