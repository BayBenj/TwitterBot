package speech;

public class Preposition extends PrepositionInfo {
	
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
