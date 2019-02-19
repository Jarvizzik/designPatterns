package adapter;

public class BirdAdapter implements Toy {

	Bird bird; 
    public BirdAdapter(Bird bird) 
    { 
        this.bird = bird; 
    }
    
	@Override
	public void squeak() {
		bird.makeSound();
	} 

}
