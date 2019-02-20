package facade;

public class GuitarPlayer {

	private Guitar acousticGuitar;
	private Guitar electronicGuitar;
	private Guitar bassGuitar;

	GuitarPlayer() {
		acousticGuitar = new AcousticGuitar();
		electronicGuitar = new ElectronicGuitar();
		bassGuitar = new BassGuitar();
	}

	public void playTheAcoustic() {
		acousticGuitar.play();
	}

	public void playTheElectronic() {
		electronicGuitar.play();
	}

	public void playTheBass() {
		bassGuitar.play();
	}

}
