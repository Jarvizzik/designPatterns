package chain_of_responsibility;

public abstract class AbstractCleaner {

	public static int CLEANED = 1;
	public static int DIRTY = 2;
	public static int VERYDIRTY = 3;

	protected int state;

	// next element in chain or responsibility
	protected AbstractCleaner nextCleaner;

	public void setNextCleaner(AbstractCleaner nextCleaner) {
		this.nextCleaner = nextCleaner;
	}

	public void completeClean(int state) {
		if (this.state <= state) {
			clean();
		}
		if (nextCleaner != null) {
			nextCleaner.completeClean(state);
		}
	}

	abstract protected void clean();

}
