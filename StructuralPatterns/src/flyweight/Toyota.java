package flyweight;

public class Toyota implements Car {
	private String color;
	
	public Toyota(String color) {
		this.color = color;
	}

	@Override
	public void drive() {
		System.out.println(color + " toyota beep");
	}
	
}
