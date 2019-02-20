package observer;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		subject.setState(8);

		subject.setState(16);
	}

}
