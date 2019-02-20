package proxy;

public class ProxyDemo {

	public static void main(String[] args) {
	
		Image image = new ProxyImage("cat.png");
		
		//image will be loaded from disk
		image.display();
		
		System.out.println("==========");
		
		//image will not be loaded from disk
		image.display();
	}

}
