package iterator;

public class ArrayContainer implements Container {
	Integer[] array = new Integer[] { 1, 2, 3, 4, 5 };

	@Override
	public Iterator getIterator() {
		return new ArrayIterator();
	}

	class ArrayIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			return (index < array.length) ? true : false;
		}

		@Override
		public Object next() {
			if (hasNext()) {
				return array[index++];
			}
			return null;
		}

	}

}
