package singleton;

public class SingletonObject {
	int i;
	private static SingletonObject singletonObject = new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		return singletonObject;
	}
}
