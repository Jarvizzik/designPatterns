package builder;

class Person {
	private String name;
	private String surname;
	private int age;

	private Person(InfoBuilder infoBuilder) {
		this.name = infoBuilder.name;
		this.surname = infoBuilder.surname;
		this.age = infoBuilder.age;
	}

	@Override
	public String toString() {
		return "Person: " + "name = " + name + ", surname = " + surname + ", age = " + age + " .";
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getAge() {
		return age;
	}

	// Builder
	static class InfoBuilder {
		private String name;
		private String surname;
		private int age;

		public InfoBuilder(String name) {
			this.name = name;
		}


		public InfoBuilder setSurname(String surname) {
			this.surname = surname;
			return this;
		}


		public InfoBuilder setAge(int age) {
			this.age = age;
			return this;
		}


		public Person build() {
			return new Person(this);
		}
	}
}