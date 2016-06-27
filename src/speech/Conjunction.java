package speech;

public class Conjunction extends ConjunctionInfo {
	
	private String text;
	
	@Override
	public String getText() {
		return text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
}
