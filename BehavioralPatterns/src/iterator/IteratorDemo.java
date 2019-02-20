package iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayContainer arrayContainer = new ArrayContainer();
		Iterator it = arrayContainer.getIterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
