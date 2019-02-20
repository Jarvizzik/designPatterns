package facade;

public class FacadeDemo {
	public static void main(String[] args) {

		GuitarPlayer guitarPlayer = new GuitarPlayer();
		
		guitarPlayer.playTheAcoustic();
		guitarPlayer.playTheElectronic();
		guitarPlayer.playTheBass();
	}
}
