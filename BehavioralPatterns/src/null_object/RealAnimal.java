package null_object;

public class RealAnimal extends AbstractAnimal {

	public RealAnimal(String name) {
		this.name = name;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
