package speech;

public class Adverb extends AdverbInfo {
	
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
