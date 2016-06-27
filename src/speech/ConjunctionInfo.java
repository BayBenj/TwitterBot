package speech;

import enumerations.PoS;

public class ConjunctionInfo extends Word {

	private String text;
	
	@Override
	public PoS getPart() {
		return PoS.CONJUNCTION;
	}

	@Override
	public void setPart(PoS part) {
		this.part = part;
	}

	@Override
	public String getText() {
		return this.text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
}
