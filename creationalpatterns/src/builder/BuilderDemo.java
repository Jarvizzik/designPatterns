package builder;

public class BuilderDemo {
	public static void main(String[] args) {
		Person me = new Person.InfoBuilder("Rostyk").setSurname("Hlynka").setAge(18).build();
		System.out.println(me);
	}
}
