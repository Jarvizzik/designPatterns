package filter;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter implements Filter {
	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> adults = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() > 18) {
				adults.add(person);
			}
		}
		return adults;
	}
}
