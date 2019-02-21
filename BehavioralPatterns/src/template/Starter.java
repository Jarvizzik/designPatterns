package template;

public abstract class Starter {

	abstract void ready();

	abstract void steady();

	abstract void go();

	public final void run() {
		ready();
		steady();
		go();
	}
}
