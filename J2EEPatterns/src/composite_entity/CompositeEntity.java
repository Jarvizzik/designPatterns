package composite_entity;

public class CompositeEntity {
	private MarriedCouple marriedCouple = new MarriedCouple();
	
	public void setMarriedCoupleNames(String husbandName, String wifeName) {
		marriedCouple.setMarriedCoupleNames(husbandName, wifeName);
	}

	public String[] getNames() {
		return marriedCouple.getNames();
	}
}
