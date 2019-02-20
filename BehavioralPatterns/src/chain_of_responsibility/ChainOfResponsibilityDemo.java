package chain_of_responsibility;

public class ChainOfResponsibilityDemo {
	
	private static AbstractCleaner getChainOfStates() {

		AbstractCleaner simpleCleaner = new Car(AbstractCleaner.VERYDIRTY);
		AbstractCleaner superCleaner = new Car(AbstractCleaner.DIRTY);
		AbstractCleaner hyperCleaner = new Car(AbstractCleaner.CLEANED);

		simpleCleaner.setNextCleaner(superCleaner);
		superCleaner.setNextCleaner(hyperCleaner);

		return simpleCleaner;
	}

	public static void main(String[] args) {
		AbstractCleaner cleanerChain = getChainOfStates();
		
		cleanerChain.completeClean(AbstractCleaner.DIRTY);
	}

}
