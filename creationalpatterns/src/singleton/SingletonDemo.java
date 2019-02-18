package singleton;

public class SingletonDemo {

	public static void main(String[] args) {

		SingletonObject singletonObject = SingletonObject.getInstance();
		SingletonObject singletonObject2 = SingletonObject.getInstance();

		singletonObject2.i = 4;
		System.out.println(singletonObject.i);
		
	}

}
