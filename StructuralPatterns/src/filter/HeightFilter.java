package filter;

import java.util.ArrayList;
import java.util.List;

public class HeightFilter implements Filter {

	@Override
	public List<Person> filter(List<Person> persons) {
		List<Person> tallPersons = new ArrayList<>();
		for (Person person : persons) {
			if (person.getHeight() > 170) {
				tallPersons.add(person);
			}
		}
		return tallPersons;
	}

}
