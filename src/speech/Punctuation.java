package speech;

public abstract class Punctuation extends Word {
	
	public abstract String getText();
	
	@Override
	public boolean isPunc() {
		return true;
	}
}
