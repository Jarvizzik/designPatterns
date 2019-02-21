package null_object;

public class NullAnimal extends AbstractAnimal {

	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not available animal";
	}

}
