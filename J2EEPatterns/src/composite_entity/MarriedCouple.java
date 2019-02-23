package composite_entity;

// coarse grained object 
public class MarriedCouple {
	Husband husband = new Husband();
	Wife wife = new Wife();

	public void setMarriedCoupleNames(String husbandName, String wifeName) {
		husband.setName(husbandName);
		wife.setName(wifeName);
	}

	public String[] getNames() {
		return new String[] { husband.getName(), wife.getName() };
	}

}
